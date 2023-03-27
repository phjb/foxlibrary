package com.paulobarbosa.foxlibrary.book.repository;

import com.paulobarbosa.foxlibrary.book.model.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}