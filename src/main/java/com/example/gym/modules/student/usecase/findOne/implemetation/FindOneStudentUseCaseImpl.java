package com.example.gym.modules.student.usecase.findOne.implemetation;

import com.example.gym.modules.student.entity.StudentEntity;

import java.util.Optional;
import java.util.UUID;

public interface FindOneStudentUseCaseImpl {
    Optional<StudentEntity> execute(UUID studentId);
}
