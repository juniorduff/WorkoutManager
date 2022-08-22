package com.example.gym.modules.student.repository;

import com.example.gym.modules.student.entity.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentyRepository extends JpaRepository<StudentEntity, UUID> {

}
