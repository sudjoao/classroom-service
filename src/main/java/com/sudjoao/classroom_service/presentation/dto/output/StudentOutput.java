package com.sudjoao.classroom_service.presentation.dto.output;

import com.sudjoao.classroom_service.domain.model.Student;

public record StudentOutput(Long id, String name, Long classroomId) {
    public static StudentOutput fromDomain(Student student) {
        return new StudentOutput(student.getId(), student.getName(), student.getClassroom().getId());
    }
}
