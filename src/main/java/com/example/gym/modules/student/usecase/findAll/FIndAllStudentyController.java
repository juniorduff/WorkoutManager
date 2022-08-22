package com.example.gym.modules.student.usecase.findAll;

import com.example.gym.modules.student.entity.StudentEntity;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/student")
@Api(tags = "student")
public class FIndAllStudentyController {

    @Autowired
    private FindAllStudentyUseCase findAllStudentyUseCase;

    @GetMapping("/find-all")
    private List<StudentEntity> handle() {
        return findAllStudentyUseCase.execute();
    }
}
