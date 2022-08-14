package com.example.gym.modules.workout;

import com.example.gym.modules.workout.entity.WorkoutEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.UUID;

public interface WorkoutRepository extends JpaRepository<WorkoutEntity, UUID> {

    List<WorkoutEntity> findAllByStudentId(UUID studentId);
}
