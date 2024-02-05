package org.example.lury.future;

import lombok.extern.slf4j.Slf4j;
import org.junit.Test;

import java.util.concurrent.*;
import java.util.function.Supplier;

@Slf4j
public class FutureDemo {

    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> {
            System.out.println("执行step 1");
            try {
                log.info("============{}=====", "foeme");
                System.out.println("AAAAAAAAAAAAAAAAAAA");
            } catch (Exception e) {
                System.out.println("_______________");
                e.printStackTrace();
            }
            return "step1 result";
        }, executor);
//        CompletableFuture<String> cf2 = CompletableFuture.supplyAsync(() -> {
//            System.out.println("执行step 2");
//            return "step2 result";
//        });
//        cf1.thenCombine(cf2, (result1, result2) -> {
//            System.out.println(result1 + " , " + result2);
//            System.out.println("执行step 3");
//            return "step3 result";
//        }).thenAccept(result3 -> System.out.println(result3));
    }

    @Test
    public void zeroRely() throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        CompletableFuture.supplyAsync(new Supplier<String>() {
            @Override
            public String get() {
                return null;
            }
        }, executor);
        //1、使用runAsync或supplyAsync发起异步调用
        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> {
            return "result1";
        }, executor);
        //2、CompletableFuture.completedFuture()直接创建一个已完成状态的CompletableFuture
        CompletableFuture<String> cf2 = CompletableFuture.completedFuture("result2");
        String s = cf2.get();
        System.out.println(s);
        //3、先初始化一个未完成的CompletableFuture，然后通过complete()、completeExceptionally()，完成该CompletableFuture
        CompletableFuture<String> cf = new CompletableFuture<>();
        cf.complete("success");
    }

    @Test
    public void oneRely() throws ExecutionException, InterruptedException {
        ExecutorService executor = Executors.newFixedThreadPool(5);
        CompletableFuture<String> cf1 = CompletableFuture.supplyAsync(() -> {
            return "result1";
        }, executor);

        // 一元依赖
        CompletableFuture<String> cf3 = cf1.thenApply(result1 -> {
            //result1为CF1的结果
            //......
            return "result3";
        });
        CompletableFuture<String> cf2 = CompletableFuture.completedFuture("result2");

        // 一元依赖
        CompletableFuture<String> cf5 = cf2.thenApply(result2 -> {
            //result2为CF2的结果
            //......
            System.out.println("-----result5------");
            return "result5";
        });

        // 二元依赖
        CompletableFuture<String> cf4 = cf1.thenCombine(cf2, (result1, result2) -> {
            //result1和result2分别为cf1和cf2的结果
            System.out.println("-----result4------");
            return "result4";
        });

        // 多元依赖； anyOf:任何一个完成即可；allOf:全部完成
//        CompletableFuture<Void> cf6 = CompletableFuture.allOf(cf3, cf4, cf5);
//        CompletableFuture<String> result = cf6.thenApply(v -> {
//            //这里的join并不会阻塞，因为传给thenApply的函数是在CF3、CF4、CF5全部完成时，才会执行 。
//            String result3 = cf3.join();
//            String result4 = cf4.join();
//            String result5 = cf5.join();
//            System.out.println(result5);
//            //根据result3、result4、result5组装最终result;
//            return "result";
//        });

//        CompletableFuture<Object> cf7 = CompletableFuture.anyOf(cf3, cf4, cf5);
//        CompletableFuture<String> mm = cf7.thenApply(v -> {
//            //这里的join并不会阻塞，因为传给thenApply的函数是在CF3、CF4、CF5全部完成时，才会执行 。
//            String result3 = cf3.join();
//            String result4 = cf4.join();
//            String result5 = cf5.join();
//            System.out.println(result5);
//            //根据result3、result4、result5组装最终result;
//            return "result";
//        });
    }
}
