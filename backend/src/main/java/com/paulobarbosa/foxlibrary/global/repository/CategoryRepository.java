package com.paulobarbosa.foxlibrary.global.repository;

import com.paulobarbosa.foxlibrary.global.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}