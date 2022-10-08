package com.masai.demo.repository;

import com.masai.demo.module.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookDAO extends JpaRepository<Book,Integer> {

}
