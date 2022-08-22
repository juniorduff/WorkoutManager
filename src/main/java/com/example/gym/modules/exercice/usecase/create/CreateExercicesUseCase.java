package com.example.gym.modules.exercice.usecase.create;

import com.example.gym.modules.exercice.dto.ExerciceDto;
import com.example.gym.modules.exercice.entity.ExerciceEntity;
import com.example.gym.modules.exercice.repository.ExerciceRepository;
import com.example.gym.modules.exercice.usecase.create.implementation.CreateExercicesUseCaseImpl;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CreateExercicesUseCase implements CreateExercicesUseCaseImpl {

    @Autowired
    private ExerciceRepository exerciceRepository;

    public ExerciceEntity execute(ExerciceDto exerciceDto) {
        ModelMapper modelMapper = new ModelMapper();
        ExerciceEntity newExercice = modelMapper.map(exerciceDto, ExerciceEntity.class);

        return this.exerciceRepository.save(newExercice);
    }


}
