package com.paulobarbosa.foxlibrary.shared.repository;

import com.paulobarbosa.foxlibrary.shared.model.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface LanguageRepository extends JpaRepository<Language, Long> {
}