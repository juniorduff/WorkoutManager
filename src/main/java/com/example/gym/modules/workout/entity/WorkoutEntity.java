package com.example.gym.modules.workout.entity;

import com.example.gym.modules.coach.entities.CoachEntity;
import com.example.gym.modules.exercice.entity.ExerciceEntity;
import com.example.gym.modules.student.entity.StudentEntity;
import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import org.hibernate.annotations.CreationTimestamp;
import org.hibernate.annotations.UpdateTimestamp;

import javax.persistence.*;
import java.time.LocalDateTime;
import java.util.List;
import java.util.UUID;

@Entity
@Data
@Table(name = "Workout")
public class WorkoutEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    @Column(name = "id", nullable = false)
    private UUID id;
    @Column()
    private String repetitions;
    @Column()
    private String rest_time;
    @Column()
    private String Variation;
    @Column()
    private String Observations;
    @Column(insertable = false, updatable = false)
    private UUID coach_id;
    @Column(insertable = false, updatable = false)
    private UUID student_id;
    @Column(name = "created_at")
    @CreationTimestamp
    private LocalDateTime created_at;
    @Column(name = "updated_at")
    @UpdateTimestamp
    private LocalDateTime updated_at;
    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "coach_id", nullable = false)
    private CoachEntity coach;

    @OneToMany(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "Exercices")
    private List<ExerciceEntity> Exercices;

    @JsonIgnore
    @ManyToOne(fetch = FetchType.EAGER, cascade = {CascadeType.PERSIST, CascadeType.MERGE})
    @JoinColumn(name = "student_id", nullable = false)
    private StudentEntity student;
}
