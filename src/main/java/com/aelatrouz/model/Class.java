package com.aelatrouz.model;


import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;
import java.util.Date;

@Entity

public class Class implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private Date date;
    @ManyToOne
    private Teacher teacher;
    @OneToMany(mappedBy = "aClass",fetch = FetchType.LAZY)
    private Collection<Student> student;

    public Class(long id, Date date, Teacher teacher, Collection<Student> student) {
        this.id = id;
        this.date = date;
        this.teacher = teacher;
        this.student = student;
    }

    @Override
    public String toString() {
        return "Class{" +
                "id=" + id +
                ", date=" + date +
                ", teacher=" + teacher +
                '}';
    }

    public Class() {
    }

    public long getId() {
        return this.id;
    }

    public Date getDate() {
        return this.date;
    }

    public Teacher getTeacher() {
        return this.teacher;
    }

    public Collection<Student> getStudent() {
        return this.student;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public void setTeacher(Teacher teacher) {
        this.teacher = teacher;
    }

    public void setStudent(Collection<Student> student) {
        this.student = student;
    }

}
