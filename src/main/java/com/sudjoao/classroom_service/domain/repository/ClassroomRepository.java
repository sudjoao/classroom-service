package com.sudjoao.classroom_service.domain.repository;

import com.sudjoao.classroom_service.domain.model.Classroom;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClassroomRepository extends JpaRepository<Classroom, Long> {
}
