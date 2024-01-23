package org.example.lury.rest;

import com.google.gson.Gson;
import org.example.lury.generator.domain.Book;
import org.example.lury.generator.service.BookService;
import lombok.extern.log4j.Log4j2;
import org.example.lury.entity.BookItem;
import org.example.lury.entity.BookParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
@Log4j2
public class BookRest {

    @Autowired
    private BookService bookService;

    @RequestMapping(value = "/insertBook", method = RequestMethod.POST)
    public String testInsert(@RequestBody BookParam param) {
        log.info("==================================={}", param.getName());
        BookItem bookItem = new BookItem();
        bookItem.setItemName("2023年度最受欢迎");
        bookItem.setItemDesc("-2023年度最受欢迎，阅读量最大的10本书-");
        Book book1 = new Book();
        book1.setName("繁花");
        book1.setCnDesc("繁花落幕！");
        book1.setEnDesc("Flowers");
        book1.setFornF("0");
        book1.setIsbnCd("100001");
        book1.setCtgrId(1);
        book1.setCrtr("lury");



        List<Book> list = new ArrayList<>();
        list.add(book1);

        boolean flag = bookService.save(book1);
        int id = 0;
        if(flag) {
            id = book1.getId();
        }
        return new Gson().toJson(book1);
    }


    @RequestMapping(value = "/getBook", method = RequestMethod.POST)
    public String test(@RequestBody BookParam param) {
        log.info("==================================={}", param.getName());
        BookItem bookItem = new BookItem();
        bookItem.setItemName("2023年度最受欢迎");
        bookItem.setItemDesc("-2023年度最受欢迎，阅读量最大的10本书-");
        Book book1 = new Book();
        book1.setName("bookA");

        Book book2 = new Book();
        book2.setName("bookB");

        Book book3 = new Book();
        book3.setName("bookC");

        Book book4 = new Book();
        book4.setName("bookD");

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
