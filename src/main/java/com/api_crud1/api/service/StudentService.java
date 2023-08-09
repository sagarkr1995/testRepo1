package com.api_crud1.api.service;

import com.api_crud1.api.entity.Student;
import com.api_crud1.api.repository.StudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class StudentService {
    private final StudentRepository studentRepo;
    @Autowired
    public StudentService (StudentRepository studentRepo) {
        this.studentRepo=studentRepo;
    }

    public List<Student> getAllStudents() {
      return studentRepo.findAll();
    }

    public Optional<Student> findStudentById(Long id) {
        return studentRepo.findById(id);
    }

    public Student saveStudent(Student student) {
        return studentRepo.save(student);
    }

    public void deleteStudent(Long id) {
        studentRepo.deleteById(id);
    }
}
