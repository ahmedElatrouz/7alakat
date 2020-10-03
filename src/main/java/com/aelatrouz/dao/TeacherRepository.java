package com.aelatrouz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aelatrouz.model.Teacher;
@RepositoryRestResource
public interface TeacherRepository extends JpaRepository<Teacher, Long> {

}
