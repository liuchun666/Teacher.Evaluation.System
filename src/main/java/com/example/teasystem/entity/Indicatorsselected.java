package com.example.teasystem.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Indicatorsselected {
    private int inSId;
    private Integer indicatorsId;
    private String selectedName;
    private Integer score;

    @Id
    @Column(name = "InSId")
    public int getInSId() {
        return inSId;
    }

    public void setInSId(int inSId) {
        this.inSId = inSId;
    }

    @Basic
    @Column(name = "indicatorsId")
    public Integer getIndicatorsId() {
        return indicatorsId;
    }

    public void setIndicatorsId(Integer indicatorsId) {
        this.indicatorsId = indicatorsId;
    }

    @Basic
    @Column(name = "SelectedName")
    public String getSelectedName() {
        return selectedName;
    }

    public void setSelectedName(String selectedName) {
        this.selectedName = selectedName;
    }

    @Basic
    @Column(name = "score")
    public Integer getScore() {
        return score;
    }

    public void setScore(Integer score) {
        this.score = score;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Indicatorsselected that = (Indicatorsselected) o;
        return inSId == that.inSId &&
                Objects.equals(indicatorsId, that.indicatorsId) &&
                Objects.equals(selectedName, that.selectedName) &&
                Objects.equals(score, that.score);
    }

    @Override
    public int hashCode() {

        return Objects.hash(inSId, indicatorsId, selectedName, score);
    }
}
