package com.boot.jpa2;

import org.springframework.data.jpa.repository.JpaRepository;

import com.boot.jpa.po.Book;

public interface BookDao extends JpaRepository<Book, Integer> {

}
