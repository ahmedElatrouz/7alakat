package com.aelatrouz.service;

import com.aelatrouz.model.Student;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public interface IStudentService {
    public Student getStudentById(Long id);
    public Student getStudentByName(String f_name,String l_name);
    public List<Student> getStudentsByClass(Long class_id);
    public void addStudent(Student student);
    public void updateStudent(Student student);
    public void deleteStudent(Long student_id);


}
