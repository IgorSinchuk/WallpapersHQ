package com.nonexistentware.igor.wallpapershq.Database;

import com.nonexistentware.igor.wallpapershq.Interface.LocalDatabase.RecentDao;

import java.util.List;

import io.reactivex.Flowable;

public class RecentDataSource implements com.nonexistentware.igor.wallpapershq.Interface.DataSource.RecentDataSource {

    private RecentDao recentDao;
    private static RecentDataSource instance;

    public RecentDataSource(RecentDao recentDao) {
        this.recentDao = recentDao;
    }

    public static RecentDataSource getInstance(RecentDao recentDao) {
        if (instance == null)
            instance = new RecentDataSource(recentDao);
        return instance;
    }

    @Override
    public Flowable<List<Recent>> getALlRecent() {
        return recentDao.getALlRecent();
    }

    @Override
    public void insertRecent(Recent... recent) {
        recentDao.insertRecent(recent);
    }

    @Override
    public void updateRecent(Recent... recent) {
        recentDao.updateRecent(recent);
    }

    @Override
    public void deleteRecent(Recent... recent) {
        recentDao.deleteRecent(recent);
    }

    @Override
    public void deleteAllRecent() {
        recentDao.deleteAllRecent();
    }
}
