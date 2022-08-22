package com.example.gym.modules.exercice.usecase.create.implementation;

import com.example.gym.modules.exercice.dto.ExerciceDto;
import com.example.gym.modules.exercice.entity.ExerciceEntity;

public interface CreateExercicesUseCaseImpl {
    ExerciceEntity execute(ExerciceDto exerciceDto);
}
