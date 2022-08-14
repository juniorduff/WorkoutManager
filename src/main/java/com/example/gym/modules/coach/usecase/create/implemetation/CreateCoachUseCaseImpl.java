package com.example.gym.modules.coach.usecase.create.implemetation;

import com.example.gym.modules.coach.dto.CoachEntityDto;
import com.example.gym.modules.coach.entities.CoachEntity;

public interface CreateCoachUseCaseImpl
{
   CoachEntity execute(CoachEntityDto coachEntity);
}
