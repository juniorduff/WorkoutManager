package com.example.gym.modules.exercice.usecase.update;

import com.example.gym.modules.exercice.dto.ExerciceDto;
import com.example.gym.modules.exercice.entity.ExerciceEntity;
import com.example.gym.modules.exercice.repository.ExerciceRepository;
import com.example.gym.modules.exercice.usecase.update.implementation.UpdateExercicesUseCaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;
import org.springframework.web.server.ResponseStatusException;

import java.util.Optional;
import java.util.UUID;

@Service
public class UpdateExercicesUseCase implements UpdateExercicesUseCaseImpl {

    @Autowired
    private ExerciceRepository exerciceRepository;

    public ExerciceEntity execute(ExerciceDto exerciceDto, UUID id) {

        Optional<ExerciceEntity> exercice = this.exerciceRepository.findById(id);

        if (exercice.isEmpty()) {
            throw new ResponseStatusException(
                    HttpStatus.NOT_FOUND, "Provide correct Actor Id");
        }
        ExerciceEntity newExercice = exercice.get();
        newExercice.setName(exerciceDto.getName());
        newExercice.setDescription(exerciceDto.getDescription());
        newExercice.setCategory(exerciceDto.getCategory());
        newExercice.setDescription(exerciceDto.getDescription());
        return this.exerciceRepository.save(newExercice);

    }


}
