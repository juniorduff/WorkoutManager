package com.example.gym.modules.student.usecase.findAll;

import com.example.gym.modules.student.entity.StudentEntity;

import java.util.List;

public interface FindAllStudentyUseCaseImplementation {
    List<StudentEntity> execute();
}
