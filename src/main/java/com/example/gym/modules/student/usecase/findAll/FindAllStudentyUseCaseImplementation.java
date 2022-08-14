package com.example.gym.modules.student.usecase.create.findAll;

import com.example.gym.modules.student.entities.StudentEntity;

import java.util.List;

public interface FindAllStudentyUseCaseImplementation {
    List<StudentEntity> execute();
}
