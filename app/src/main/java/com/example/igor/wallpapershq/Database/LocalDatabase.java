package com.example.igor.wallpapershq.Database;

import android.arch.persistence.room.Database;
import android.arch.persistence.room.Room;
import android.arch.persistence.room.RoomDatabase;
import android.content.Context;

import com.example.igor.wallpapershq.Interface.LocalDatabase.RecentDao;



import static com.example.igor.wallpapershq.Database.LocalDatabase.DATABASE_VERSION;

@Database(entities = Recent.class, version = DATABASE_VERSION)
public abstract class LocalDatabase extends RoomDatabase {
    public static final int DATABASE_VERSION = 1;
    public static final String DATABASE_NAME = "wallpaperapp-f3ae6";

    public abstract RecentDao recentDao();

    private static LocalDatabase instance;

    public static LocalDatabase getInstance(Context context) {
        if (instance == null) {
            instance = Room.databaseBuilder(context, LocalDatabase.class, DATABASE_NAME)
                    .fallbackToDestructiveMigration()
                    .build();
        }

        return instance;
    }
}
