package com.nonexistentware.igor.wallpapershq.Interface.LocalDatabase;


import androidx.room.Dao;
import androidx.room.Delete;
import androidx.room.Insert;
import androidx.room.Query;
import androidx.room.Update;

import com.nonexistentware.igor.wallpapershq.Database.Recent;

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
