package com.sudjoao.classroom_service.domain.model;

import jakarta.persistence.*;

import java.util.List;

@Entity
@Table(name = "classrooms")
public class Classroom {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    @OneToMany(mappedBy = "classroom", cascade = CascadeType.ALL, fetch = FetchType.EAGER)
    List<Student> students;
    Long userId;
    String name;

    public String getName() {
        return name;
    }

    public Long getId() {
        return id;
    }

    public List<Student> getStudents() {
        return students;
    }

    public Long getUserId() {
        return userId;
    }

    @Override
    public String toString() {
        return "Classroom{" +
                "id=" + id +
                ", userId=" + userId +
                '}';
    }
}
