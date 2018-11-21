package com.example.igor.wallpapershq.Database;

import com.example.igor.wallpapershq.Interface.DataSource.RecentDataSource;

import java.util.List;

import io.reactivex.Flowable;

public class RecentRepository implements RecentDataSource {

    private RecentDataSource localDataSource;
    private static RecentRepository instance;

    public RecentRepository(RecentDataSource localDataSource) {
        this.localDataSource = localDataSource;
    }

    public static RecentRepository getInstance(RecentDataSource localDataSource) {
        if (instance == null)
            instance = new RecentRepository(localDataSource);
        return instance;
    }

    @Override
    public Flowable<List<Recent>> getALlRecent() {
        return localDataSource.getALlRecent();
    }

    @Override
    public void insertRecent(Recent... recent) {
        localDataSource.insertRecent(recent);
    }

    @Override
    public void updateRecent(Recent... recent) {
        localDataSource.updateRecent(recent);
    }

    @Override
    public void deleteRecent(Recent... recent) {
        localDataSource.deleteRecent(recent);
    }

    @Override
    public void deleteAllRecent() {
        localDataSource.deleteAllRecent();
    }
}
