package com.aelatrouz.model;

import lombok.ToString;

import javax.persistence.*;
import java.io.Serializable;

@Entity
@ToString
public class Progress implements Serializable {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @OneToOne
    private Season season;
    private String description;
    private int absences;
    private String aya;
    private String soura;
    private int ahzabNumber;

    public Progress(long id, Season season, String description, int absences, String aya, String soura, int ahzabNumber) {
        this.id = id;
        this.season = season;
        this.description = description;
        this.absences = absences;
        this.aya = aya;
        this.soura = soura;
        this.ahzabNumber = ahzabNumber;
    }

    public Progress() {
    }

    public long getId() {
        return this.id;
    }

    public Season getSeason() {
        return this.season;
    }

    public String getDescription() {
        return this.description;
    }

    public int getAbsences() {
        return this.absences;
    }

    public String getAya() {
        return this.aya;
    }

    public String getSoura() {
        return this.soura;
    }

    public int getAhzabNumber() {
        return this.ahzabNumber;
    }

    public void setId(long id) {
        this.id = id;
    }

    public void setSeason(Season season) {
        this.season = season;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public void setAbsences(int absences) {
        this.absences = absences;
    }

    public void setAya(String aya) {
        this.aya = aya;
    }

    public void setSoura(String soura) {
        this.soura = soura;
    }

    public void setAhzabNumber(int ahzabNumber) {
        this.ahzabNumber = ahzabNumber;
    }

    public String toString() {
        return "Progress(id=" + this.getId() + ", season=" + this.getSeason() + ", description=" + this.getDescription() + ", absences=" + this.getAbsences() + ", aya=" + this.getAya() + ", soura=" + this.getSoura() + ", ahzabNumber=" + this.getAhzabNumber() + ")";
    }
}
