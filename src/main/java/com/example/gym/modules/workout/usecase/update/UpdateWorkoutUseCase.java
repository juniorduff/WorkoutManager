package com.example.gym.modules.workout.usecase.update;

import com.example.gym.modules.exercice.entity.ExerciceEntity;
import com.example.gym.modules.exercice.repository.ExerciceRepository;
import com.example.gym.modules.workout.dto.WorkoutDto;
import com.example.gym.modules.workout.entity.WorkoutEntity;
import com.example.gym.modules.workout.repository.WorkoutRepository;
import com.example.gym.modules.workout.usecase.update.implementation.UpdateWorkoutUseCaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

@Service
public class UpdateWorkoutUseCase implements UpdateWorkoutUseCaseImpl {

    @Autowired
    private WorkoutRepository workoutRepository;
    @Autowired
    private ExerciceRepository exerciceRepository;

    @Override
    public ResponseEntity<WorkoutEntity> execute(WorkoutDto workoutDto, UUID id) {
        List<ExerciceEntity> exercices = this.exerciceRepository.findAllById(workoutDto.getExercicesIDs());
        Optional<WorkoutEntity> workout = this.workoutRepository.findById(id);
        if (workout.isEmpty()) {
            return ResponseEntity.notFound().build();
        }
        workout.get().setExercices(exercices);
        workout.get().setVariation(workoutDto.getVariation());
        workout.get().setRest_time(workoutDto.getRest_time());
        workout.get().setRepetitions(workoutDto.getRepetitions());
        workout.get().setObservations(workoutDto.getObservations());
        return ResponseEntity.ok(this.workoutRepository.save(workout.get())
        );
    }
}
