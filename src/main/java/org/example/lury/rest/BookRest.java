package org.example.lury.rest;

import com.google.gson.Gson;
import lombok.extern.log4j.Log4j2;
import org.example.lury.entity.Book;
import org.example.lury.entity.BookItem;
import org.example.lury.entity.BookParam;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Log4j2
public class BookRest {

    @RequestMapping(value = "/insertBook", method = RequestMethod.POST)
    public String testInsert(@RequestBody BookParam param) {
        log.info("==================================={}", param.getName());
        BookItem bookItem = new BookItem();
        bookItem.setItemName("2023年度最受欢迎");
        bookItem.setItemDesc("-2023年度最受欢迎，阅读量最大的10本书-");
        Book book1 = new Book();
        book1.setName("bookA");
        book1.setYear("2023");

        Book book2 = new Book();
        book2.setName("bookB");
        book2.setYear("2023");

        Book book3 = new Book();
        book3.setName("bookC");
        book3.setYear("2023");

        Book book4 = new Book();
        book4.setName("bookD");
        book4.setYear("2023");

        List<Book> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        bookItem.setBookList(list);
        Gson gson = new Gson();
        return gson.toJson(bookItem);
    }


    @RequestMapping(value = "/getBook", method = RequestMethod.POST)
    public String test(@RequestBody BookParam param) {
        log.info("==================================={}", param.getName());
        BookItem bookItem = new BookItem();
        bookItem.setItemName("2023年度最受欢迎");
        bookItem.setItemDesc("-2023年度最受欢迎，阅读量最大的10本书-");
        Book book1 = new Book();
        book1.setName("bookA");
        book1.setYear("2023");

        Book book2 = new Book();
        book2.setName("bookB");
        book2.setYear("2023");

        Book book3 = new Book();
        book3.setName("bookC");
        book3.setYear("2023");

        Book book4 = new Book();
        book4.setName("bookD");
        book4.setYear("2023");

        List<Book> list = new ArrayList<>();
        list.add(book1);
        list.add(book2);
        list.add(book3);
        list.add(book4);
        bookItem.setBookList(list);
        Gson gson = new Gson();
        return gson.toJson(bookItem);
    }
}
