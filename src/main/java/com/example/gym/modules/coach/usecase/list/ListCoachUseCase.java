package com.example.gym.modules.coach.usecase.list;

import com.example.gym.modules.coach.entities.CoachEntity;
import com.example.gym.modules.coach.repository.CoachRepository;
import com.example.gym.modules.coach.usecase.list.implementation.ListCoachUseCaseImp;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ListCoachUseCase implements ListCoachUseCaseImp {
    @Autowired
    private CoachRepository coachRepository;

    public List<CoachEntity> execute() {
        return this.coachRepository.findAll();
    }
}
