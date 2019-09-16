package com.example.teasystem.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Permission {
    private int perId;
    private String perName;
    private String perAdress;
    private Integer perParent;

    @Id
    @Column(name = "perId")
    public int getPerId() {
        return perId;
    }

    public void setPerId(int perId) {
        this.perId = perId;
    }

    @Basic
    @Column(name = "perName")
    public String getPerName() {
        return perName;
    }

    public void setPerName(String perName) {
        this.perName = perName;
    }

    @Basic
    @Column(name = "perAdress")
    public String getPerAdress() {
        return perAdress;
    }

    public void setPerAdress(String perAdress) {
        this.perAdress = perAdress;
    }

    @Basic
    @Column(name = "perParent")
    public Integer getPerParent() {
        return perParent;
    }

    public void setPerParent(Integer perParent) {
        this.perParent = perParent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Permission that = (Permission) o;
        return perId == that.perId &&
                Objects.equals(perName, that.perName) &&
                Objects.equals(perAdress, that.perAdress) &&
                Objects.equals(perParent, that.perParent);
    }

    @Override
    public int hashCode() {

        return Objects.hash(perId, perName, perAdress, perParent);
    }
}
