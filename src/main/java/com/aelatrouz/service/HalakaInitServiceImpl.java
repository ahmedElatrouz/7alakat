package com.aelatrouz.service;

import com.aelatrouz.dao.*;
import com.aelatrouz.model.*;
import com.aelatrouz.model.Class;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Arrays;
import java.util.Date;
import java.util.List;
import java.util.stream.Stream;

@Service
public class HalakaInitServiceImpl implements IHalakaInitService {
	
	@Autowired
	private SeasonRepository seasonRepository;
	@Autowired
	private TeacherRepository teacherRepository;
	@Autowired
	private AdminRepository adminRepository;
	@Autowired
	private ClassRepository classRepository;
	@Autowired
	private StudentRepository studentRepository;

	@Override
	public void initAdmins() {
		Stream.of("ahmed","abderrazak").forEach(a->{
			Admin admin=new Admin();
			admin.setUsername(a);
			adminRepository.save(admin);
		});

	}

	@Override
	public void initTeachers() {
		Stream.of("ahmed","ali","abdelkarim","mostapha").forEach(t->{
			Teacher teacher=new Teacher();
			teacher.setFirstName(t);
			teacherRepository.save(teacher);
		});

	}

	@Override
	public void initSeasons() {
		Stream.of("summer","automn","winter","spring").forEach(v->{
			Season season=new Season();
			season.setDescription(v);
			seasonRepository.save(season);
		});

	}

	@Override
	public void initClasses() {
		teacherRepository.findAll().forEach(t->{
			Class aClass=new Class();
			aClass.setTeacher(t);
			classRepository.save(aClass);
			t.setAClass(Arrays.asList(aClass));
			teacherRepository.save(t);
		});

	}

	@Override
	public void initStudents() {
		List<Student> students_list=null;
		Stream.of("kassol1","kassol2","kassol3","kassol4","kassol5").forEach(s->{
			Student student=new Student();
			student.setFirstName(s);
			studentRepository.save(student);

		});


	}

}
