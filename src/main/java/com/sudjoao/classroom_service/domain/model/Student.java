package com.sudjoao.classroom_service.domain.model;

import com.fasterxml.jackson.annotation.JsonBackReference;
import jakarta.persistence.*;

@Entity
@Table(name = "students")
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @ManyToOne
    @JsonBackReference
    Classroom classroom;
    String name;

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", classroom=" + classroom.getId() +
                ", name='" + name + '\'' +
                '}';
    }

    public Classroom getClassroom() {
        return classroom;
    }

    public void setClassroom(Classroom classroom) {
        this.classroom = classroom;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }
}
