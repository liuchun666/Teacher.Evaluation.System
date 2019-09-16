package com.example.teasystem.entity;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "role_permission", schema = "teasystem")
public class RolePermission {
    private int rpId;
    private Integer perId;
    private Integer roleId;

    @Id
    @Column(name = "rpId")
    public int getRpId() {
        return rpId;
    }

    public void setRpId(int rpId) {
        this.rpId = rpId;
    }

    @Basic
    @Column(name = "perId")
    public Integer getPerId() {
        return perId;
    }

    public void setPerId(Integer perId) {
        this.perId = perId;
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
        RolePermission that = (RolePermission) o;
        return rpId == that.rpId &&
                Objects.equals(perId, that.perId) &&
                Objects.equals(roleId, that.roleId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(rpId, perId, roleId);
    }
}
