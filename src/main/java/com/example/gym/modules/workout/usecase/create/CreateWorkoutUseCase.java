package com.example.gym.modules.workout.usecase.create;

import com.example.gym.modules.coach.CoachRepository;
import com.example.gym.modules.coach.entities.CoachEntity;
import com.example.gym.modules.exercice.ExerciceRepository;
import com.example.gym.modules.exercice.entity.ExerciceEntity;
import com.example.gym.modules.student.StudentyRepository;
import com.example.gym.modules.student.entities.StudentEntity;
import com.example.gym.modules.workout.WorkoutRepository;
import com.example.gym.modules.workout.dto.WorkoutDto;
import com.example.gym.modules.workout.entity.WorkoutEntity;
import com.example.gym.modules.workout.usecase.create.implementation.CreateWorkoutUseCaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class CreateWorkoutUseCase implements CreateWorkoutUseCaseImpl {

    @Autowired
    private WorkoutRepository workoutRepository;
    @Autowired
    private StudentyRepository studentyRepository;
    @Autowired

    private CoachRepository coachRepository;
    @Autowired
    private ExerciceRepository exerciceRepository;

    public ResponseEntity<WorkoutEntity> execute(WorkoutDto workoutDto) {

        Optional<StudentEntity> student = this.studentyRepository.findById(workoutDto.getStudentID());
        Optional<CoachEntity> coach = this.coachRepository.findById(workoutDto.getCoachID());
        List<ExerciceEntity> exercices = this.exerciceRepository.findAllById(workoutDto.getExercicesIDs());

        if (student.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }
        if (coach.isEmpty()) {
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(null);
        }


        WorkoutEntity workoutEntity = new WorkoutEntity();
        workoutEntity.setExercices(exercices);
        workoutEntity.setStudent(student.get());
        workoutEntity.setCoach(coach.get());
        workoutEntity.setObservations(workoutDto.getObservations());
        workoutEntity.setRepetitions(workoutDto.getRepetitions());
        workoutEntity.setVariation(workoutDto.getVariation());
        workoutEntity.setRest_time(workoutDto.getRest_time());

        return ResponseEntity.status(HttpStatus.CREATED).body(this.workoutRepository.save(workoutEntity));
    }
}


