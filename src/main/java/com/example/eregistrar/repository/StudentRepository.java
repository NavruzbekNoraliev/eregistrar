package com.example.eregistrar.repository;

import com.example.eregistrar.model.Student;
import org.springframework.data.repository.CrudRepository;

public interface StudentRepository extends CrudRepository<Student, Long> {
}
