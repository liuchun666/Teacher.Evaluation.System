package com.example.teasystem.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "lt_grades", schema = "teasystem")
public class LtGrades {
    private int ltgId;
    private Integer ltgLeaderId;
    private Integer ltgTeacherId;
    private Integer ltgGrades;

    @Id
    @Column(name = "ltg_id")
    public int getLtgId() {
        return ltgId;
    }

    public void setLtgId(int ltgId) {
        this.ltgId = ltgId;
    }

    @Basic
    @Column(name = "ltg_leaderId")
    public Integer getLtgLeaderId() {
        return ltgLeaderId;
    }

    public void setLtgLeaderId(Integer ltgLeaderId) {
        this.ltgLeaderId = ltgLeaderId;
    }

    @Basic
    @Column(name = "ltg_teacherId")
    public Integer getLtgTeacherId() {
        return ltgTeacherId;
    }

    public void setLtgTeacherId(Integer ltgTeacherId) {
        this.ltgTeacherId = ltgTeacherId;
    }

    @Basic
    @Column(name = "ltg_grades")
    public Integer getLtgGrades() {
        return ltgGrades;
    }

    public void setLtgGrades(Integer ltgGrades) {
        this.ltgGrades = ltgGrades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        LtGrades ltGrades = (LtGrades) o;
        return ltgId == ltGrades.ltgId &&
                Objects.equals(ltgLeaderId, ltGrades.ltgLeaderId) &&
                Objects.equals(ltgTeacherId, ltGrades.ltgTeacherId) &&
                Objects.equals(ltgGrades, ltGrades.ltgGrades);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ltgId, ltgLeaderId, ltgTeacherId, ltgGrades);
    }
}
