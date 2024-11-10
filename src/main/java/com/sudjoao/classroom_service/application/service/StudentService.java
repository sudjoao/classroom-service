package com.sudjoao.classroom_service.application.service;

import com.sudjoao.classroom_service.domain.model.Student;
import com.sudjoao.classroom_service.domain.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class StudentService {
    @Autowired
    StudentRepository studentRepository;

    public Student create(Student student) {
        return studentRepository.save(student);
    }
}
