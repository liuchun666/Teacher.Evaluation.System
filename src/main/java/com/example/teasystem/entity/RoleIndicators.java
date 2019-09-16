package com.example.teasystem.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "role_indicators", schema = "teasystem")
public class RoleIndicators {
    private int riId;
    private Integer indicatorsId;
    private Integer roleId;

    @Id
    @Column(name = "riId")
    public int getRiId() {
        return riId;
    }

    public void setRiId(int riId) {
        this.riId = riId;
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
    @Column(name = "roleId")
    public Integer getRoleId() {
        return roleId;
    }

    public void setRoleId(Integer roleId) {
        this.roleId = roleId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        RoleIndicators that = (RoleIndicators) o;
        return riId == that.riId &&
                Objects.equals(indicatorsId, that.indicatorsId) &&
                Objects.equals(roleId, that.roleId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(riId, indicatorsId, roleId);
    }
}
