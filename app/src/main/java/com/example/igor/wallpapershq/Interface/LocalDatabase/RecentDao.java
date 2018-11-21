package com.example.igor.wallpapershq.Interface.LocalDatabase;

import android.arch.persistence.room.Dao;
import android.arch.persistence.room.Delete;
import android.arch.persistence.room.Insert;
import android.arch.persistence.room.Query;
import android.arch.persistence.room.Update;

import com.example.igor.wallpapershq.Database.Recent;

import java.util.List;

import io.reactivex.Flowable;

@Dao
public interface RecentDao {
    @Query("SELECT * FROM recent ORDER BY saveTime DESC LIMIT 10")
    Flowable<List<Recent>> getALlRecent();

    @Insert
    void insertRecent(Recent...recent);

    @Update
    void updateRecent(Recent...recent);

    @Delete
    void deleteRecent(Recent...recent);

    @Query("DELETE from recent")
    void deleteAllRecent();
}
