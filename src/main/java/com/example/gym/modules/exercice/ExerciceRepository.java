package com.example.gym.modules.exercice;

import com.example.gym.modules.exercice.entity.ExerciceEntity;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.UUID;

public interface ExerciceRepository extends JpaRepository<ExerciceEntity, UUID> {
}
