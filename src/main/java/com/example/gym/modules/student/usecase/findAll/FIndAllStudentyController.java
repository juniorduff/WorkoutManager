package com.example.gym.modules.student.usecase.create.findAll;

import com.example.gym.modules.student.entities.StudentEntity;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/user")
@Api(tags = "user")
public class FIndAllStudentyController {

    @Autowired
    private FindAllStudentyUseCase findAllStudentyUseCase;

    @GetMapping("/find-all")
    private List<StudentEntity> handle() {
        return findAllStudentyUseCase.execute();
    }
}
