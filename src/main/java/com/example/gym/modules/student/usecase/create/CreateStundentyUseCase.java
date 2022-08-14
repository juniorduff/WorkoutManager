

package com.example.gym.modules.student.usecase.create;

import com.example.gym.modules.student.StudentyRepository;
import com.example.gym.modules.student.dto.StudentDto;
import com.example.gym.modules.student.entities.StudentEntity;
import com.example.gym.modules.student.usecase.create.implementation.createUserUseCaseImplementation;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class CreateStundentyUseCase implements createUserUseCaseImplementation {

    private final ModelMapper modelMapper = new ModelMapper();
      @Autowired
    private StudentyRepository userRepository;
    private StudentEntity  newStudent;

    @Override
    public StudentEntity excute(StudentDto studentDto) {
        return null;
    }
}

