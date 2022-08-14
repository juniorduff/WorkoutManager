package com.example.gym.modules.exercice.usecase.implementation;

import com.example.gym.modules.exercice.dto.ExerciceDto;
import com.example.gym.modules.exercice.entity.ExerciceEntity;

public interface CreateExercicesUseCaseImpl {
    ExerciceEntity execute(ExerciceDto exerciceDto);
}
