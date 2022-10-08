package com.masai.demo.controller;

import com.masai.demo.module.Book;
import com.masai.demo.serviceLayer.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/bookservice")
public class BookController {

    @Autowired
    BookService bookService;

    @GetMapping("/books")
    public ResponseEntity<List<Book>> getAllBook(){
        List<Book> books = bookService.getAllBook();
        return new ResponseEntity<>(books, HttpStatus.ACCEPTED);
    }

    @GetMapping("/books/{bookID}")
    public ResponseEntity<Book> findBookByID(@PathVariable("bookID") int bookID){
        Book book = bookService.findBookByID(bookID);
        return new ResponseEntity<>(book, HttpStatus.ACCEPTED);
    }

    @PostMapping("/books")
    public ResponseEntity<String> addNewBook(@RequestBody Book book){
        bookService.addNewBook(book);
        return new ResponseEntity<>("book added successfully", HttpStatus.ACCEPTED);
    }

    @DeleteMapping("/books/{bookID}")
    public ResponseEntity<String> deleteBookByID(@PathVariable("bookID") int bookID){
        bookService.deleteBookByID(bookID);
        return new ResponseEntity<>("book deleted successfully", HttpStatus.ACCEPTED);
    }

    @PutMapping("/books/{bookID}")
    public ResponseEntity<String> updateBookByID(@PathVariable("bookID") int bookID){
        bookService.updateBookByID(bookID,new Book());
        return new ResponseEntity<>("book deleted successfully", HttpStatus.ACCEPTED);
    }
}
