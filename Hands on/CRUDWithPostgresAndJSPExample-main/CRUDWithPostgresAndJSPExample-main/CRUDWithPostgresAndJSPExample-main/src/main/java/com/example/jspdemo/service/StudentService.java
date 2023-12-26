

package com.example.jspdemo.service;

import com.example.jspdemo.model.Student;
import com.example.jspdemo.repo.IStudentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class StudentService {

    @Autowired
    IStudentRepository StudentRepo;

    public List<Student> getAllStudent() {
        List<Student> StudentList = new ArrayList<>();
        StudentRepo.findAll().forEach(Student -> StudentList.add(Student));

        return StudentList;
    }

    public Student getStudentById(Long id) {
        return StudentRepo.findById(id).get();
    }

    public boolean saveOrUpdateStudent(Student Student) {
        Student updatedStudent = StudentRepo.save(Student);

        if (StudentRepo.findById(updatedStudent.getId()) != null) {
            return true;
        }

        return false;
    }

    public boolean deleteStudent(Long id) {
        StudentRepo.deleteById(id);

        if (StudentRepo.findById(id) != null) {
            return true;
        }

        return false;
    }

}
