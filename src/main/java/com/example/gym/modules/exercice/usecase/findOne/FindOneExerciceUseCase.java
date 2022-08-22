package com.example.gym.modules.exercice.usecase.findOne;

import com.example.gym.modules.exercice.entity.ExerciceEntity;
import com.example.gym.modules.exercice.repository.ExerciceRepository;
import com.example.gym.modules.exercice.usecase.findOne.implementation.FindOneExerciseUseCaseImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class FindOneExerciceUseCase implements FindOneExerciseUseCaseImp {
    @Autowired
    private ExerciceRepository exerciceRepository;

    public Optional<ExerciceEntity> execute(UUID exerciceId) {
        return this.exerciceRepository.findById(exerciceId);

    }
}
