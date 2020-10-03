package com.aelatrouz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aelatrouz.model.Class;
@RepositoryRestResource
public interface ClassRepository extends JpaRepository<Class, Long> {

}
