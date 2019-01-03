package com.nonexistentware.igor.wallpapershq.Adapter;

import android.content.Context;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.nonexistentware.igor.wallpapershq.Fragment.CategoryFragment;
import com.nonexistentware.igor.wallpapershq.Fragment.DailyPopularFragment;
import com.nonexistentware.igor.wallpapershq.Fragment.GoogleFragment;
import com.nonexistentware.igor.wallpapershq.Fragment.RecentFragment;

public class FragmentAdapter extends FragmentPagerAdapter {

    private Context context;

    public FragmentAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;


    }

    @Override
    public Fragment getItem(int position) {
        if (position == 0)
            return CategoryFragment.getInstance();
        else if (position == 1)
            return DailyPopularFragment.getInstance();
        else if (position == 2)
            return RecentFragment.getInstance(context);
        else if (position == 3)
            return GoogleFragment.getInstance();
            return null;
    }

    @Override
    public int getCount() {
        return 3;
    }

    @Nullable
    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return "Category";
            case 1:
                return "Popular";
            case 2:
                return "Recent";
            case 3:
                return "Google";
        }
        return null;
    }
}
