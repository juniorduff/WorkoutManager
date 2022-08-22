package com.example.gym.modules.exercice.usecase.update.implementation;

import com.example.gym.modules.exercice.dto.ExerciceDto;
import com.example.gym.modules.exercice.entity.ExerciceEntity;

import java.util.UUID;

public interface UpdateExercicesUseCaseImpl {
    ExerciceEntity execute(ExerciceDto exerciceDto, UUID exerciceId);
}
