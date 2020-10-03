package com.aelatrouz;

import com.aelatrouz.service.IHalakaInitService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;

import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application implements CommandLineRunner {
	@Autowired
	private IHalakaInitService iHalakaInitService;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		iHalakaInitService.initAdmins();
		iHalakaInitService.initSeasons();
		iHalakaInitService.initTeachers();
		iHalakaInitService.initClasses();
		iHalakaInitService.initStudents();
	}
}
