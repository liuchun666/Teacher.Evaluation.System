package com.example.teasystem.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "st_grades", schema = "teasystem")
public class StGrades {
    private int stgId;
    private Integer stgStuId;
    private Integer stgTeaId;
    private Integer stgGrades;

    @Id
    @Column(name = "stg_id")
    public int getStgId() {
        return stgId;
    }

    public void setStgId(int stgId) {
        this.stgId = stgId;
    }

    @Basic
    @Column(name = "stg_stuId")
    public Integer getStgStuId() {
        return stgStuId;
    }

    public void setStgStuId(Integer stgStuId) {
        this.stgStuId = stgStuId;
    }

    @Basic
    @Column(name = "stg_teaId")
    public Integer getStgTeaId() {
        return stgTeaId;
    }

    public void setStgTeaId(Integer stgTeaId) {
        this.stgTeaId = stgTeaId;
    }

    @Basic
    @Column(name = "stg_grades")
    public Integer getStgGrades() {
        return stgGrades;
    }

    public void setStgGrades(Integer stgGrades) {
        this.stgGrades = stgGrades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        StGrades stGrades = (StGrades) o;
        return stgId == stGrades.stgId &&
                Objects.equals(stgStuId, stGrades.stgStuId) &&
                Objects.equals(stgTeaId, stGrades.stgTeaId) &&
                Objects.equals(stgGrades, stGrades.stgGrades);
    }

    @Override
    public int hashCode() {

        return Objects.hash(stgId, stgStuId, stgTeaId, stgGrades);
    }
}
