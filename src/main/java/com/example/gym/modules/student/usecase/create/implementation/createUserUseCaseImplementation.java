package com.example.gym.modules.student.usecase.create.implementation;

import com.example.gym.modules.student.dto.StudentDto;
import com.example.gym.modules.student.entity.StudentEntity;

public interface createUserUseCaseImplementation {
    /**
     * Create a new user.
     *
     * @param name the name of the new user
     * @return the new user
     */
    StudentEntity excute(StudentDto studentDto);
}
