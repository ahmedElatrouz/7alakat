package com.aelatrouz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aelatrouz.model.Student;

import java.util.List;

@RepositoryRestResource
public interface StudentRepository extends JpaRepository<Student, Long> {

    public Student findStudentByFirstNameContainingAndLastNameContaining(String firstName,String lastName);
    public List<Student> findStudentByAClass_Id(Long class_id);
	
}
