package com.aelatrouz.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import com.aelatrouz.model.Season;
@RepositoryRestResource
public interface SeasonRepository extends JpaRepository<Season, Long> {

}
