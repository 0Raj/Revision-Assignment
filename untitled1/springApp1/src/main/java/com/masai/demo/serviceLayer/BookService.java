package com.masai.demo.serviceLayer;

import com.masai.demo.module.Book;

import java.util.List;

public interface BookService {

    public List<Book> getAllBook();

    public Book findBookByID(int bookID);

    public boolean addNewBook(Book book);

    public boolean deleteBookByID(int bookID);

    public boolean updateBookByID(int bookID,Book book);
}
