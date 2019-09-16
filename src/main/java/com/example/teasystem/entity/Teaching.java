package com.example.teasystem.entity;

public class Teaching {
    public  int teachId;//教师编号
    public int courseId;//课程编号
    public  int userId;//用户编号
    public int classesId;//班级编号
    public int batchId;//学期编号

    public Teaching(int teachId, int courseId, int userId, int classesId, int batchId) {
        this.teachId = teachId;
        this.courseId = courseId;
        this.userId = userId;
        this.classesId = classesId;
        this.batchId = batchId;
    }

    public Teaching() {
    }

    public int getTeachId() {
        return teachId;
    }

    public void setTeachId(int teachId) {
        this.teachId = teachId;
    }

    public int getCourseId() {
        return courseId;
    }

    public void setCourseId(int courseId) {
        this.courseId = courseId;
    }

    public int getUserId() {
        return userId;
    }

    public void setUserId(int userId) {
        this.userId = userId;
    }

    public int getClassesId() {
        return classesId;
    }

    public void setClassesId(int classesId) {
        this.classesId = classesId;
    }

    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }
}
