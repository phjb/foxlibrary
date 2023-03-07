package com.paulobarbosa.foxlibrary.shared.repository;

import com.paulobarbosa.foxlibrary.shared.model.Format;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FormatRepository extends JpaRepository<Format, Long> {
}