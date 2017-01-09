package com.lukasz.viewpagerlab;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.List;

/**
 * Created by Lukasz on 2017-01-07.
 */

public class TabPagerAdapter extends FragmentPagerAdapter {

    List<Fragment> fragments;



    public TabPagerAdapter(FragmentManager fm, List<Fragment> f) {
        super(fm);
        fragments=f;
    }


    @Override
    public Fragment getItem(int position) {
        return fragments.get(position);
    }

    @Override
    public int getCount() {
        return fragments.size();
    }

    @Override
    public CharSequence getPageTitle(int position) {// chcemy nazwę dla toolbara

        switch(position){
            case 0:return "pierwszy";
            case 1:return "szukajka";
            case 2:return "koszyk chyba";
        }
        return "błąd";
    }
}
