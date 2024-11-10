package com.sudjoao.classroom_service.presentation.dto.output;

import com.sudjoao.classroom_service.domain.model.Classroom;
import com.sudjoao.classroom_service.domain.model.Student;

import java.util.List;

public record ClassroomInput(Long id, String name, Long userId, List<Student> students) {
    public static ClassroomInput fromDomain(Classroom classroom) {
        return new ClassroomInput(classroom.getId(), classroom.getName(), classroom.getUserId(), classroom.getStudents());
    }
}
