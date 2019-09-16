package com.example.teasystem.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Teaching {
    private int teachId;
    private Integer courseId;
    private Integer userId;
    private Integer classesId;
    private Integer batchId;

    @Id
    @Column(name = "teachId")
    public int getTeachId() {
        return teachId;
    }

    public void setTeachId(int teachId) {
        this.teachId = teachId;
    }

    @Basic
    @Column(name = "courseId")
    public Integer getCourseId() {
        return courseId;
    }

    public void setCourseId(Integer courseId) {
        this.courseId = courseId;
    }

    @Basic
    @Column(name = "userId")
    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    @Basic
    @Column(name = "classesId")
    public Integer getClassesId() {
        return classesId;
    }

    public void setClassesId(Integer classesId) {
        this.classesId = classesId;
    }

    @Basic
    @Column(name = "batchId")
    public Integer getBatchId() {
        return batchId;
    }

    public void setBatchId(Integer batchId) {
        this.batchId = batchId;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Teaching teaching = (Teaching) o;
        return teachId == teaching.teachId &&
                Objects.equals(courseId, teaching.courseId) &&
                Objects.equals(userId, teaching.userId) &&
                Objects.equals(classesId, teaching.classesId) &&
                Objects.equals(batchId, teaching.batchId);
    }

    @Override
    public int hashCode() {

        return Objects.hash(teachId, courseId, userId, classesId, batchId);
    }
}
