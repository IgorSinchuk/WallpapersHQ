package com.example.igor.wallpapershq.Interface.DataSource;

import com.example.igor.wallpapershq.Database.Recent;

import java.util.List;

import io.reactivex.Flowable;

public interface RecentDataSource {
    Flowable<List<Recent>> getALlRecent();
    void insertRecent(Recent...recent);
    void updateRecent(Recent...recent);
    void deleteRecent(Recent...recent);
    void deleteAllRecent();
}
