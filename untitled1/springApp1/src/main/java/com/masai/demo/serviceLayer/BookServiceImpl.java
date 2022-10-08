package com.masai.demo.serviceLayer;

import com.masai.demo.module.Book;
import com.masai.demo.repository.BookDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class BookServiceImpl implements BookService{

    @Autowired
    private BookDAO bookDAO;


    @Override
    public List<Book> getAllBook() {

        List<Book> books = bookDAO.findAll();

        return books;
    }

    @Override
    public Book findBookByID(int bookID) {

        Optional<Book> bookOptional = bookDAO.findById(bookID);

        return bookOptional.get();
    }

    @Override
    public boolean addNewBook(Book book) {

        Book bookCheck = bookDAO.save(book);

        return bookCheck != null?true:false;
    }

    @Override
    public boolean deleteBookByID(int bookID) {

        Book book = findBookByID(bookID);

        bookDAO.delete(book);

        return true;
    }

    @Override
    public boolean updateBookByID(int bookID, Book book) {

        Book bookFound = findBookByID(bookID);

        bookDAO.save(bookFound);


        return true;
    }
}
