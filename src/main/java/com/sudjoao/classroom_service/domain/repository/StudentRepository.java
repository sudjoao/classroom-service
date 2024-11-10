package com.sudjoao.classroom_service.domain.repository;

import com.sudjoao.classroom_service.domain.model.Student;
import org.springframework.data.jpa.repository.JpaRepository;

public interface StudentRepository extends JpaRepository<Student, Long> {
}
