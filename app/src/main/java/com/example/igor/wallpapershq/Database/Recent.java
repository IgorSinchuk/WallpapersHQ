package com.example.igor.wallpapershq.Database;

import android.arch.persistence.room.ColumnInfo;
import android.arch.persistence.room.Entity;
import android.support.annotation.NonNull;


@Entity(tableName = "recent", primaryKeys = {"imageLink", "categoryId"})
public class Recent {

    @ColumnInfo(name = "imageLink")
    @NonNull
    private String imageLink;

    @ColumnInfo(name = "categoryId")
    @NonNull
    private String categoryId;

    @ColumnInfo(name = "saveTime")
    private String saveTime;

    public Recent(String imageLink, String categoryId, String saveTime) {
        this.imageLink = imageLink;
        this.categoryId = categoryId;
        this.saveTime = saveTime;
    }
    @NonNull
    public String getImageLink() {
        return imageLink;
    }

    public void setImageLink(@NonNull String imageLink) {
        this.imageLink = imageLink;
    }

    @NonNull
    public String getCategoryId() {
        return categoryId;
    }

    public void setCategoryId(@NonNull String categoryId) {
        this.categoryId = categoryId;
    }
    public String getSaveTime() {
        return saveTime;
    }

    public void setSaveTime(String saveTime) {
        this.saveTime = saveTime;
    }
}
