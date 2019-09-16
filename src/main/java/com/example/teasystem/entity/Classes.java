package com.example.teasystem.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Classes {
    private int classesId;
    private Integer deId;
    private String classesName;

    @Id
    @Column(name = "classesId")
    public int getClassesId() {
        return classesId;
    }

    public void setClassesId(int classesId) {
        this.classesId = classesId;
    }

    @Basic
    @Column(name = "deId")
    public Integer getDeId() {
        return deId;
    }

    public void setDeId(Integer deId) {
        this.deId = deId;
    }

    @Basic
    @Column(name = "classesName")
    public String getClassesName() {
        return classesName;
    }

    public void setClassesName(String classesName) {
        this.classesName = classesName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Classes classes = (Classes) o;
        return classesId == classes.classesId &&
                Objects.equals(deId, classes.deId) &&
                Objects.equals(classesName, classes.classesName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(classesId, deId, classesName);
    }
}
