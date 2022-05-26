package com.example.onthi;

import androidx.room.Entity;
import androidx.room.PrimaryKey;

@Entity
public class entity {
    @PrimaryKey(autoGenerate = true)
    int id ;
    String ten;
    String tien;


    public entity(String ten, String tien) {
        this.ten = ten;
        this.tien = tien;
    }

    public entity() {

    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String getTien() {
        return tien;
    }

    public void setTien(String tien) {
        this.tien = tien;
    }
}
