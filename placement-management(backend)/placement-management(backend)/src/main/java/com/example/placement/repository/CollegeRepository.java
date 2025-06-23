package com.example.placement.repository;

import com.example.placement.model.College;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CollegeRepository extends JpaRepository<College, Long> {
    College findByCollegeNameAndPassword(String collegeName, String password);
}
