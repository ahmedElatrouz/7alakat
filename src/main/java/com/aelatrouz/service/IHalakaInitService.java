package com.aelatrouz.service;

import org.springframework.stereotype.Service;

@Service
public interface IHalakaInitService {

	public void initAdmins();
	public void initTeachers();
	public void initSeasons();
	public void initClasses();
	public void initStudents();
}
