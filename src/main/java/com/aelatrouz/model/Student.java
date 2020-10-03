package com.aelatrouz.model;

import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@ToString
public class Student implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String address;
    private String phoneNbr;
    @ManyToOne
    private Class aClass;

    public Student(long id, String firstName, String lastName, String address, String phoneNbr, Class aClass) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.address = address;
        this.phoneNbr = phoneNbr;
        this.aClass = aClass;
    }

    public Student() {
    }

    public long getId() {
        return this.id;
    }

    public String getFirstName() {
        return this.firstName;
    }

    public String getLastName() {
        return this.lastName;
    }

    public String getAddress() {
        return this.address;
    }

    public String getPhoneNbr() {
        return this.phoneNbr;
    }

    public Class getAClass() {
        return this.aClass;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setPhoneNbr(String phoneNbr) {
        this.phoneNbr = phoneNbr;
    }

    public void setAClass(Class aClass) {
        this.aClass = aClass;
    }

    public String toString() {
        return "Student(id=" + this.getId() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", address=" + this.getAddress() + ", phoneNbr=" + this.getPhoneNbr() + ", aClass=" + this.getAClass() + ")";
    }
}
