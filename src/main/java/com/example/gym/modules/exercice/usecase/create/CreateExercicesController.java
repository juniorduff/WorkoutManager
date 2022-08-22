package com.example.gym.modules.exercice.usecase.create;

import com.example.gym.modules.exercice.dto.ExerciceDto;
import com.example.gym.modules.exercice.entity.ExerciceEntity;
import com.example.gym.modules.exercice.usecase.create.implementation.CreateExercicesUseCaseImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@Api(tags = "exercise")
@RequestMapping("/exercice")
public class CreateExercicesController {
    @Autowired
    private CreateExercicesUseCaseImpl createExercicesUseCase;

    @PostMapping("/create")
    public ExerciceEntity handle(@RequestBody ExerciceDto exerciceDto) {
        return this.createExercicesUseCase.execute(exerciceDto);
    }

}
