package com.example.android.abrilcultural;

import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;

import java.util.ArrayList;

/**
 * Created by INTEL on 04/03/2017.
 */

public class AdaprterPageView extends FragmentPagerAdapter {

    private static final int CANTIDAD=2;
    private  BlankFragment fragment1;
    private  BlankFragment2 fragment2;
    private ArrayList<Fragment> lista;
    public AdaprterPageView(FragmentManager fm) {
        super(fm);
        lista=new ArrayList<Fragment>();

        fragment1=new BlankFragment();
        fragment2=new BlankFragment2();
        lista.add(fragment1);
        lista.add(fragment2);
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
