package com.aelatrouz.service;

import com.aelatrouz.dao.StudentRepository;
import com.aelatrouz.model.Student;
import org.springframework.beans.factory.annotation.Autowired;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class StudentServiceImpl implements IStudentService {

    @Autowired
    private StudentRepository studentRepository;

    @Override
    public Student getStudentById(Long id) {
        Student student=null;
        try{
            student=studentRepository.findById(id).orElse(null);
        }catch (Exception e){
            e.printStackTrace();
        }

        return student;
    }

    @Override
    public Student getStudentByName(String f_name, String l_name) {
        Student student=null;
        try{
            student=studentRepository.findStudentByFirstNameContainingAndLastNameContaining(f_name,l_name);
        }catch (Exception e){
            e.printStackTrace();
        }

        return student;
    }

    @Override
    public List<Student> getStudentsByClass(Long class_id) {
        List<Student> students=new ArrayList<Student>();
        try{
            students=studentRepository.findStudentByAClass_Id(class_id);
        }catch (Exception e){
            e.printStackTrace();
        }

        return students;
    }

    @Override
    public void addStudent(Student student) {

        try{
            studentRepository.save(student);
        }catch (Exception e){
            e.printStackTrace();
        }

    }

    @Override
    public void updateStudent(Student student) {
        try{
           if(studentRepository.existsById(student.getId())) studentRepository.save(student);
        //TODO:else throw StudentDoesntExistException();
        }catch (Exception e){
            e.printStackTrace();
        }
    }

    @Override
    public void deleteStudent(Long student_id) {
        try{
            if(studentRepository.existsById(student_id)) studentRepository.deleteById(student_id);
            //TODO:else throw StudentDoesntExistException();
        }catch (Exception e){
            e.printStackTrace();
        }
    }
}
