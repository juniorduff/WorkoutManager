package com.example.gym.modules.exercice.usecase.findOne.implementation;

import com.example.gym.modules.exercice.entity.ExerciceEntity;

import java.util.Optional;
import java.util.UUID;

public interface FindOneExerciseUseCaseImp {
   Optional<ExerciceEntity> execute(UUID exerciceId);
}

