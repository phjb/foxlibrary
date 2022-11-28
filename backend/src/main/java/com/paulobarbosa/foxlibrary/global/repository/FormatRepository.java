package com.paulobarbosa.foxlibrary.global.repository;

import com.paulobarbosa.foxlibrary.global.model.Format;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormatRepository extends JpaRepository<Format, Long> {
}