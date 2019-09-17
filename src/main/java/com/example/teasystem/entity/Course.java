package com.example.teasystem.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Course {
    private int courseId;
    private Integer deId;
    private String courseName;

    @Id
    @Column(name = "courseId")
    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    @Basic
    @Column(name = "deId")
    public Integer getDeId() {
        return deId;
    }

    public void setDeId(Integer deId) {
        this.deId = deId;
    }

    @Basic
    @Column(name = "courseName")
    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()){ return false;}
        Course course = (Course) o;
        return courseId == course.courseId &&
                Objects.equals(deId, course.deId) &&
                Objects.equals(courseName, course.courseName);
    }

    @Override
    public int hashCode() {

        return Objects.hash(courseId, deId, courseName);
    }
}
