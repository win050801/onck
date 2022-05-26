package com.example.onthi;

import androidx.room.Database;
import androidx.room.RoomDatabase;
@Database(entities = {entity.class},version = 1)
public abstract class DataBase extends RoomDatabase {
    public abstract entityDao entityDao();
}
