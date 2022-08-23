package com.example.gym.modules.workout.usecase.findOne;

import com.example.gym.modules.workout.entity.WorkoutEntity;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Optional;
import java.util.UUID;

@RestController
@RequestMapping("/workout")
@Api(tags = "Workout")
public class FindOneWorkoutController {
    @Autowired
    private FindOneWorkoutUseCase FindOneWorkoutUseCaseImp;

    @GetMapping("/findOne/{id}")
    public Optional<WorkoutEntity> handle(@PathVariable UUID id) {
        return FindOneWorkoutUseCaseImp.execute(id);
    }
}
