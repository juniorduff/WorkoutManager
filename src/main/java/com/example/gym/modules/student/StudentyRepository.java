package com.example.gym.modules.student;

import com.example.gym.modules.student.entities.StudentEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface StudentyRepository extends JpaRepository<StudentEntity, UUID> {

}
