package com.example.gym.modules.student.usecase.findOne;

import com.example.gym.modules.student.entity.StudentEntity;
import com.example.gym.modules.student.repository.StudentyRepository;
import com.example.gym.modules.student.usecase.findOne.implemetation.FindOneStudentUseCaseImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Optional;
import java.util.UUID;

@Service
public class FindOneStudentUseCase implements FindOneStudentUseCaseImpl {
    @Autowired
    private StudentyRepository studentyRepository;

    public Optional<StudentEntity> execute(UUID studentId) {
        return this.studentyRepository.findById(studentId);
    }
}
