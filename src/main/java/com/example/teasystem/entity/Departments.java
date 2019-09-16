package com.example.teasystem.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Departments {
    private int deId;
    private String deptName;

    @Id
    @Column(name = "deId")
    public int getDeId() {
        return deId;
    }

    public void setDeId(int deId) {
        this.deId = deId;
    }

    @Basic
    @Column(name = "deptName")
    public String getDeptName() {
        return deptName;
    }

    public void setDeptName(String deptName) {
        this.deptName = deptName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Departments that = (Departments) o;
        return deId == that.deId &&
                Objects.equals(deptName, that.deptName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(deId, deptName);
    }
}
