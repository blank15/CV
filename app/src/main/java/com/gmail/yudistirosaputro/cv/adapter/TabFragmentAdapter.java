package com.gmail.yudistirosaputro.cv.adapter;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import com.gmail.yudistirosaputro.cv.fragmentTabs.KemampuanFragment;
import com.gmail.yudistirosaputro.cv.fragmentTabs.PendidikanFragment;

/**
 * Created by Yudis on 10/29/2017.
 */

public class TabFragmentAdapter extends FragmentPagerAdapter {
    private String title[] = new String[]{"Pendidikan","Kemampuan"};

    public TabFragmentAdapter(FragmentManager fm) {
        super(fm);
    }

    @Override
    public Fragment getItem(int position) {

        Fragment fragment = null;

        switch (position){

            case 0:
                fragment = new PendidikanFragment();
                break;
            case 1:
                fragment = new KemampuanFragment();
                break;
            default:
                fragment = null;
                break;
        }

        return fragment;
    }

    @Override
    public CharSequence getPageTitle(int position) {
        return title[position];
    }

    @Override
    public int getCount() {
        return title.length;
    }
}
