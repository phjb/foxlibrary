package com.paulobarbosa.foxlibrary.shared.repository;

import com.paulobarbosa.foxlibrary.shared.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryRepository extends JpaRepository<Category, Long> {
}