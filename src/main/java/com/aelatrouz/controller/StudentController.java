package com.aelatrouz.controller;

import com.aelatrouz.service.IStudentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class StudentController {

    @Autowired
    private IStudentService iStudentService;



}
