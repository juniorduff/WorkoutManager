package com.example.gym.modules.student.usecase.findOne;

import com.example.gym.modules.student.entity.StudentEntity;
import com.example.gym.modules.student.usecase.findOne.implemetation.FindOneStudentUseCaseImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/student")
@Api(tags = "student")
public class FIndOneStudentController {

    @Autowired
    private FindOneStudentUseCaseImpl findOneStudentUseCase;

    @GetMapping("/find-one/{studentId}")
    public Optional<StudentEntity> handle(@PathVariable UUID studentId) {
        return this.findOneStudentUseCase.execute(studentId);
    }
}
