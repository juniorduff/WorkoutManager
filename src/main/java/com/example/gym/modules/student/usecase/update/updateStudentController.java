package com.example.gym.modules.student.usecase.update;

import com.example.gym.modules.student.dto.StudentDto;
import com.example.gym.modules.student.entity.StudentEntity;
import com.example.gym.modules.student.usecase.update.implementation.UpdateStudentUseCaseImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@RequestMapping("/student")
@Api(tags = "student")
public class updateStudentController {


    @Autowired
    UpdateStudentUseCaseImpl updateStudentUseCase;

    @PutMapping("update/{studentId}")
    StudentEntity handle(@PathVariable() UUID studentId, @RequestBody() StudentDto studentDto) {
        return this.updateStudentUseCase.execute(studentId, studentDto);


    }
}
