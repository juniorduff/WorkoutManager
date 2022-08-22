package com.example.gym.modules.exercice.usecase.list;

import com.example.gym.modules.exercice.entity.ExerciceEntity;
import com.example.gym.modules.exercice.repository.ExerciceRepository;
import com.example.gym.modules.exercice.usecase.list.implementation.ListExerciseUseCaseImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListExerciseUseCase implements ListExerciseUseCaseImp {
    @Autowired
    private ExerciceRepository exerciceRepository;

    @Override
    public List<ExerciceEntity> execute() {
        return this.exerciceRepository.findAll();
    }
}

