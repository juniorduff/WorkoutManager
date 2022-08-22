

package com.example.gym.modules.student.usecase.create;

import com.example.gym.modules.student.dto.StudentDto;
import com.example.gym.modules.student.entity.StudentEntity;
import com.example.gym.modules.student.repository.StudentyRepository;
import com.example.gym.modules.student.usecase.create.implementation.createUserUseCaseImplementation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CreateStundentyUseCase implements createUserUseCaseImplementation {

    @Autowired
    private StudentyRepository userRepository;
    private StudentEntity  newStudent;

    @Override
    public StudentEntity excute(StudentDto studentDto) {

        ModelMapper modelMapper = new ModelMapper();
        newStudent = modelMapper.map(studentDto, StudentEntity.class);
        return this.userRepository.save(newStudent);
    }
}

