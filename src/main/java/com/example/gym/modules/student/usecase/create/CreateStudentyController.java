package com.example.gym.modules.student.usecase.create;

import com.example.gym.modules.student.dto.StudentDto;
import com.example.gym.modules.student.entities.StudentEntity;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/user")
@Api(tags = "user")
public class CreateStudentyController {

    @Autowired
  private CreateStundentyUseCase createUserUseCase;

  @PostMapping("/create")
  public StudentEntity handle(@RequestBody StudentDto studentEntity) {
    return this.createUserUseCase.excute(studentEntity);
  }
}
