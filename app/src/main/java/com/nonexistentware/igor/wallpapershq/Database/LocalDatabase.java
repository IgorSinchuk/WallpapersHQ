package com.nonexistentware.igor.wallpapershq.Database;

import android.content.Context;

import androidx.room.Database;
import androidx.room.Room;
import androidx.room.RoomDatabase;

import com.nonexistentware.igor.wallpapershq.Interface.LocalDatabase.RecentDao;



import static com.nonexistentware.igor.wallpapershq.Database.LocalDatabase.DATABASE_VERSION;

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
