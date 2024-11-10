package com.sudjoao.classroom_service.presentation.dto.input;

import com.sudjoao.classroom_service.domain.model.Student;

public record StudentInput(String name, Long classroomId) {
    public Student toDomain() {
        var student = new Student();
        student.setName(name);
        return student;
    }
}
