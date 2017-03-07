package com.example.android.abrilcultural;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentStatePagerAdapter;

import java.util.ArrayList;

/**
 * Created by INTEL on 04/03/2017.
 */

public class AdaprterPageView extends FragmentStatePagerAdapter {

    private static final int CANTIDAD=4;
    private  BlankFragment fragment1;
    private  BlankFragment fragment2;
    private  BlankFragment fragment3;
    private  BlankFragment fragment4;
    private ArrayList<Fragment> lista;
    public AdaprterPageView(FragmentManager fm) {
        super(fm);
        lista=new ArrayList<Fragment>();

        fragment1= BlankFragment.newInstance("1");
        fragment2= BlankFragment.newInstance("2");
        fragment3= BlankFragment.newInstance("3");
        fragment4= BlankFragment.newInstance("4");
        lista.add(fragment1);
        lista.add(fragment2);
        lista.add(fragment3);
        lista.add(fragment4);
    }

    @Override
    public Fragment getItem(int position) {

       return  lista.get(position);
       // return new BlankFragment();
        /*switch (position) {
            case 1:
                return new BlankFragment();
            case 2:
                return new BlankFragment();
            case 3:
                return new BlankFragment();
            default: return null;
        }*/

    }

    @Override
    public int getCount() {
        return CANTIDAD;
    }
}
