package com.sudjoao.classroom_service.application.usecase;

import com.sudjoao.classroom_service.application.service.ClassroomService;
import com.sudjoao.classroom_service.domain.model.Classroom;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class GetClassroomUseCase {
    @Autowired
    ClassroomService classroomService;

    public Classroom run(Long id) {
        return classroomService.getById(id);
    }
}
