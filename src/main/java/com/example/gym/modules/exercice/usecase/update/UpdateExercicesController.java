package com.example.gym.modules.exercice.usecase.update;

import com.example.gym.modules.exercice.dto.ExerciceDto;
import com.example.gym.modules.exercice.entity.ExerciceEntity;
import com.example.gym.modules.exercice.usecase.update.implementation.UpdateExercicesUseCaseImpl;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.UUID;

@RestController
@Api(tags = "Exercice")
@RequestMapping("/exercice")
public class UpdateExercicesController {
    @Autowired
    private UpdateExercicesUseCaseImpl updateExercicesUseCaseImpl;

    @PutMapping("/{id}")
    public ExerciceEntity handle(@RequestBody ExerciceDto exerciceDto, @PathVariable UUID id) {
        return this.updateExercicesUseCaseImpl.execute(exerciceDto, id);
    }

}

