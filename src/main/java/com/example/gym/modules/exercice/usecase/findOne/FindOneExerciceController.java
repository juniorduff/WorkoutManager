package com.example.gym.modules.exercice.usecase.findOne;

import com.example.gym.modules.exercice.entity.ExerciceEntity;
import com.example.gym.modules.exercice.usecase.findOne.implementation.FindOneExerciseUseCaseImp;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/exercice")
@Api(tags = "Exercice")
public class FindOneExerciceController {

    @Autowired
    private FindOneExerciseUseCaseImp findOneExerciceUseCase;

    @GetMapping("/find-one/{exerciceId}")
    public Optional<ExerciceEntity> handle(@PathVariable UUID exerciceId) {
        return this.findOneExerciceUseCase.execute(exerciceId);
    }

}
