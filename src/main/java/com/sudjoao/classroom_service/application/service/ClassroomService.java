package com.sudjoao.classroom_service.application.service;

import com.sudjoao.classroom_service.domain.model.Classroom;
import com.sudjoao.classroom_service.domain.repository.ClassroomRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class ClassroomService {
    @Autowired
    ClassroomRepository classroomRepository;

    public Classroom getById(Long id) {
        return classroomRepository.getReferenceById(id);
    }

    public Classroom save(Classroom classroom) {
        return classroomRepository.save(classroom);
    }
}
