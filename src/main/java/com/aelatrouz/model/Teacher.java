package com.aelatrouz.model;

import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;
import java.util.Collection;

@Entity
@ToString
public class Teacher implements Serializable {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    private String firstName;
    private String lastName;
    private String phoneNbr;
    private String address;
    private String description;
    @OneToMany(mappedBy = "teacher")
    private Collection<Class> aClass;

    public Teacher(long id, String firstName, String lastName, String phoneNbr, String address, String description, Collection<Class> aClass) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.phoneNbr = phoneNbr;
        this.address = address;
        this.description = description;
        this.aClass = aClass;
    }

    public Teacher() {
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

    public String getPhoneNbr() {
        return this.phoneNbr;
    }

    public String getAddress() {
        return this.address;
    }

    public String getDescription() {
        return this.description;
    }

    public Collection<Class> getAClass() {
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

    public void setPhoneNbr(String phoneNbr) {
        this.phoneNbr = phoneNbr;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAClass(Collection<Class> aClass) {
        this.aClass = aClass;
    }

    public String toString() {
        return "Teacher(id=" + this.getId() + ", firstName=" + this.getFirstName() + ", lastName=" + this.getLastName() + ", phoneNbr=" + this.getPhoneNbr() + ", address=" + this.getAddress() + ", description=" + this.getDescription() + ", aClass=" + this.getAClass() + ")";
    }
}
