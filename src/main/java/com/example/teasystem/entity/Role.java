package com.example.teasystem.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
<<<<<<< HEAD
import java.util.Objects;

=======
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

@SuppressWarnings("ALL")
>>>>>>> 15bf53e42dc3c0ffe49d50e99600fc4a3bfd3f9e
@Entity
public class Role {
    private int roleId;
    private String roleName;
<<<<<<< HEAD

    @Id
=======
    private List<Permission> permissions;

    public List<Permission> getPermissions() {
        return permissions;
    }

    public void setPermissions(List<Permission> permissions) {
        this.permissions = permissions;
    }

    @Id

>>>>>>> 15bf53e42dc3c0ffe49d50e99600fc4a3bfd3f9e
    @Column(name = "roleId")
    public int getRoleId() {
        return roleId;
    }

    public void setRoleId(int roleId) {
        this.roleId = roleId;
    }

<<<<<<< HEAD
    @Basic
=======

>>>>>>> 15bf53e42dc3c0ffe49d50e99600fc4a3bfd3f9e
    @Column(name = "roleName")
    public String getRoleName() {
        return roleName;
    }

    public void setRoleName(String roleName) {
        this.roleName = roleName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Role role = (Role) o;
        return roleId == role.roleId &&
                Objects.equals(roleName, role.roleName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(roleId, roleName);
    }
}
