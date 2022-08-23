package com.example.gym.modules.student.usecase.update.implementation;

import com.example.gym.modules.student.dto.StudentDto;
import com.example.gym.modules.student.entity.StudentEntity;

import java.util.UUID;

public interface UpdateStudentUseCaseImpl {
   StudentEntity execute(UUID studentId, StudentDto studentDto);
}
