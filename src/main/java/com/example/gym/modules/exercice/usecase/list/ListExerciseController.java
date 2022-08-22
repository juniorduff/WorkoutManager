package com.example.gym.modules.exercice.usecase.list;

import com.example.gym.modules.exercice.entity.ExerciceEntity;
import com.example.gym.modules.exercice.usecase.list.implementation.ListExerciseUseCaseImp;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/exercice")
@Api(tags = "exercise")
public class ListExerciseController {
    @Autowired
    private ListExerciseUseCaseImp listExerciseUseCase;

    @GetMapping("/list-all")
    public List<ExerciceEntity> handle() {
        return listExerciseUseCase.execute();
    }

}
