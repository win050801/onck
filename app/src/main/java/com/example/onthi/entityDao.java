package com.example.onthi;

import androidx.room.Dao;
import androidx.room.Insert;
import androidx.room.Query;

import java.util.List;

@Dao
public interface entityDao {
    @Insert
    void Them(entity entity);
    @Query("select * from entity")
    List<entity> getAll();
}
