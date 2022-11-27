package com.paulobarbosa.foxlibrary.book.repository;

import com.paulobarbosa.foxlibrary.book.model.Format;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormatRepository extends JpaRepository<Format, Long> {
}