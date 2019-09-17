package com.example.teasystem.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Indicators {
    private int indicatorsId;
    private String indicatorsName;
    private Integer indicatorsPercentage;
    private Integer indicatorsParent;

    @Id
    @Column(name = "indicatorsId")
    public int getIndicatorsId() {
        return indicatorsId;
    }

    public void setIndicatorsId(int indicatorsId) {
        this.indicatorsId = indicatorsId;
    }

    @Basic
    @Column(name = "indicatorsName")
    public String getIndicatorsName() {
        return indicatorsName;
    }

    public void setIndicatorsName(String indicatorsName) {
        this.indicatorsName = indicatorsName;
    }

    @Basic
    @Column(name = "indicatorsPercentage")
    public Integer getIndicatorsPercentage() {
        return indicatorsPercentage;
    }

    public void setIndicatorsPercentage(Integer indicatorsPercentage) {
        this.indicatorsPercentage = indicatorsPercentage;
    }

    @Basic
    @Column(name = "indicatorsParent")
    public Integer getIndicatorsParent() {
        return indicatorsParent;
    }

    public void setIndicatorsParent(Integer indicatorsParent) {
        this.indicatorsParent = indicatorsParent;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Indicators that = (Indicators) o;
        return indicatorsId == that.indicatorsId &&
                Objects.equals(indicatorsName, that.indicatorsName) &&
                Objects.equals(indicatorsPercentage, that.indicatorsPercentage) &&
                Objects.equals(indicatorsParent, that.indicatorsParent);
    }

    @Override
    public int hashCode() {

        return Objects.hash(indicatorsId, indicatorsName, indicatorsPercentage, indicatorsParent);
    }
}
