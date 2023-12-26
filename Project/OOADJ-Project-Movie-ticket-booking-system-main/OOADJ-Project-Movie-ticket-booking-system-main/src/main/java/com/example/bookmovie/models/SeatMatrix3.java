package com.example.bookmovie.models;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Lob;
import javax.persistence.Table;

@Entity
@Table(name = "SeatMatrix3")
public class SeatMatrix3 {
    

    @Id
    @Column(name="colName")
    private Integer colName;
    @Column(name="value")
    private Integer value;
    
    public SeatMatrix3() {
    }

    public SeatMatrix3(Integer colName, Integer value) {
        this.colName = colName;
        this.value = value;
    }

    @Override
    public String toString() {
        return "SeatMatrix3 [colName=" + colName + ", value=" + value + "]";
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
