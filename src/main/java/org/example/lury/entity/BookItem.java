package org.example.lury.entity;

import org.example.lury.generator.domain.Book;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

public class BookItem {

    private String isbnCode;
    private String itemName;
    private String itemDesc;
    private List<Book> bookList = new ArrayList<>();
    private Date crtTm;
    private Date updTm;
    private String crtr;
    private String updtr;

    public String getIsbnCode() {
        return isbnCode;
    }

    public void setIsbnCode(String isbnCode) {
        this.isbnCode = isbnCode;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public String getItemDesc() {
        return itemDesc;
    }

    public void setItemDesc(String itemDesc) {
        this.itemDesc = itemDesc;
    }

    public List<Book> getBookList() {
        return bookList;
    }

    public void setBookList(List<Book> bookList) {
        this.bookList = bookList;
    }

    public Date getCrtTm() {
        return crtTm;
    }

    public void setCrtTm(Date crtTm) {
        this.crtTm = crtTm;
    }

    public Date getUpdTm() {
        return updTm;
    }

    public void setUpdTm(Date updTm) {
        this.updTm = updTm;
    }

    public String getCrtr() {
        return crtr;
    }

    public void setCrtr(String crtr) {
        this.crtr = crtr;
    }

    public String getUpdtr() {
        return updtr;
    }

    public void setUpdtr(String updtr) {
        this.updtr = updtr;
    }
}
