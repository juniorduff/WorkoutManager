package com.example.gym.modules.student.usecase.create.implementation;

import com.example.gym.modules.student.dto.StudentEntityDto;
import com.example.gym.modules.student.entities.StudentEntity;
import org.apache.catalina.User;

public interface createUserUseCaseImplementation {
    /**
     * Create a new user.
     *
     * @param name the name of the new user
     * @return the new user
     */
    StudentEntity excute(StudentEntityDto studentDto);
}
