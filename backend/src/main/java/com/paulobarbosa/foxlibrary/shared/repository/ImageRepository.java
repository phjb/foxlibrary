package com.paulobarbosa.foxlibrary.shared.repository;

import com.paulobarbosa.foxlibrary.shared.model.Image;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImageRepository extends JpaRepository<Image, Long> {
}