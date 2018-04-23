package com.example.android.tourguide;

import android.content.Context;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

/**
 * Created by Capri on 03.04.2018.
 */

public class PagerAdapter extends FragmentPagerAdapter {

    private Context context;

    public PagerAdapter(FragmentManager fm, Context context) {
        super(fm);
        this.context = context;
    }

    @Override
    public Fragment getItem(int position) {
        return PlaceFragment.newInstance(position);
    }

    @Override
    public int getCount() {
        return 4;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        switch (position) {
            case 0:
                return context.getString(R.string.quizzes);
            case 1:
                return context.getString(R.string.quests);
            case 2:
                return context.getString(R.string.museums);
            case 3:
                return context.getString(R.string.theatres);
            default:
                return null;
        }
    }
}
