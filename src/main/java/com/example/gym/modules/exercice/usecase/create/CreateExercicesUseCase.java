package com.example.gym.modules.exercice.usecase.create;

import com.example.gym.modules.exercice.ExerciceRepository;
import com.example.gym.modules.exercice.dto.ExerciceDto;
import com.example.gym.modules.exercice.entity.ExerciceEntity;
import com.example.gym.modules.exercice.usecase.implementation.CreateExercicesUseCaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateExercicesUseCase implements CreateExercicesUseCaseImpl {

    @Autowired
    private ExerciceRepository exerciceRepository;

    public ExerciceEntity execute(ExerciceDto exerciceDto) {

        ExerciceEntity newExercice = new ExerciceEntity();
        newExercice.setName(exerciceDto.getName());
        newExercice.setDescription(exerciceDto.getDescription());

        return this.exerciceRepository.save(newExercice);
    }


}
