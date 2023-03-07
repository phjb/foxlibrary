package com.paulobarbosa.foxlibrary.book.repository;

import com.paulobarbosa.foxlibrary.book.model.Author;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AuthorRepository extends JpaRepository<Author, Long> {
}