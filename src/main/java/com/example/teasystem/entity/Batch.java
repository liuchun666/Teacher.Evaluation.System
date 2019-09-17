package com.example.teasystem.entity;

import javax.persistence.Basic;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Objects;

@Entity
public class Batch {
    private int batchId;
    private String batchName;
    private Integer batchState;

    @Id
    @Column(name = "batchId")
    public int getBatchId() {
        return batchId;
    }

    public void setBatchId(int batchId) {
        this.batchId = batchId;
    }

    @Basic
    @Column(name = "batchName")
    public String getBatchName() {
        return batchName;
    }

    public void setBatchName(String batchName) {
        this.batchName = batchName;
    }

    @Basic
    @Column(name = "batchState")
    public Integer getBatchState() {
        return batchState;
    }

    public void setBatchState(Integer batchState) {
        this.batchState = batchState;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {return true;}
        if (o == null || getClass() != o.getClass()) {return false;}
        Batch batch = (Batch) o;
        return batchId == batch.batchId &&
                Objects.equals(batchName, batch.batchName) &&
                Objects.equals(batchState, batch.batchState);
    }

    @Override
    public int hashCode() {

        return Objects.hash(batchId, batchName, batchState);
    }
}
