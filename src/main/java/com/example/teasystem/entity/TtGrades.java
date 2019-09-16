package com.example.teasystem.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "tt_grades", schema = "teasystem")
public class TtGrades {
    private int ttgId;
    private Integer ttgTeaId;
    private Integer ttgTeaId2;
    private Integer ttgGrades;

    @Id
    @Column(name = "ttg_id")
    public int getTtgId() {
        return ttgId;
    }

    public void setTtgId(int ttgId) {
        this.ttgId = ttgId;
    }

    @Basic
    @Column(name = "ttg_teaId")
    public Integer getTtgTeaId() {
        return ttgTeaId;
    }

    public void setTtgTeaId(Integer ttgTeaId) {
        this.ttgTeaId = ttgTeaId;
    }

    @Basic
    @Column(name = "ttg_teaId2")
    public Integer getTtgTeaId2() {
        return ttgTeaId2;
    }

    public void setTtgTeaId2(Integer ttgTeaId2) {
        this.ttgTeaId2 = ttgTeaId2;
    }

    @Basic
    @Column(name = "ttg_grades")
    public Integer getTtgGrades() {
        return ttgGrades;
    }

    public void setTtgGrades(Integer ttgGrades) {
        this.ttgGrades = ttgGrades;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        TtGrades ttGrades = (TtGrades) o;
        return ttgId == ttGrades.ttgId &&
                Objects.equals(ttgTeaId, ttGrades.ttgTeaId) &&
                Objects.equals(ttgTeaId2, ttGrades.ttgTeaId2) &&
                Objects.equals(ttgGrades, ttGrades.ttgGrades);
    }

    @Override
    public int hashCode() {

        return Objects.hash(ttgId, ttgTeaId, ttgTeaId2, ttgGrades);
    }
}
