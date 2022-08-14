package com.example.gym.modules.student.usecase.create;

import com.example.gym.modules.student.dto.StudentEntityDto;
import com.example.gym.modules.student.entities.StudentEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
public class CreateUserController {

    @Autowired
  private  CreateUserUseCase createUserUseCase;

    @PostMapping("/create")
    public StudentEntity handle(@RequestBody StudentEntityDto studentEntity) {
      return  this.createUserUseCase.excute(studentEntity);
    }
}
