package com.example.keuangan.database;

import androidx.room.Database;
import androidx.room.RoomDatabase;

import com.example.keuangan.database.dao.DatabaseDao;
import com.example.keuangan.model.ModelDatabase;

@Database(entities = {ModelDatabase.class}, version = 1)
public abstract class AppDatabase extends RoomDatabase {
    public abstract DatabaseDao databaseDao();
}