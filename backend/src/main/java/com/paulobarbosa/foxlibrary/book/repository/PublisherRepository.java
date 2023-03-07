package com.paulobarbosa.foxlibrary.book.repository;

import com.paulobarbosa.foxlibrary.book.model.Publisher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PublisherRepository extends JpaRepository<Publisher, Long> {
}