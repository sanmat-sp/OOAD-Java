package com.example.bookmovie.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "SeatMatrix2")
public class SeatMatrix2 {
    @Id
    @Column(name="colName")
    private Integer colName;
    @Column(name="value")
    private Integer value;
    
    @Override
    public String toString() {
        return "SeatMatrix2 [colName=" + colName + ", value=" + value + "]";
    }

    public SeatMatrix2() {
    }

    public SeatMatrix2(Integer colName, Integer value) {
        this.colName = colName;
        this.value = value;
    }

    public Integer getColName() {
        return colName;
    }

    public void setColName(Integer colName) {
        this.colName = colName;
    }

    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

}
