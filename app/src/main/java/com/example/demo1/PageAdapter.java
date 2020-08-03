package com.example.demo1;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentStatePagerAdapter;

public class PageAdapter extends FragmentStatePagerAdapter {
    int counttab;
    public PageAdapter(FragmentManager fm, int counttab){
        super(fm);
        this.counttab=counttab;
    }
    @NonNull
    @Override
    public Fragment getItem(int i) {
        switch (i) {
            case 0:
                ThemChiTieuFragment themChiTieuFragment= new ThemChiTieuFragment();
                return themChiTieuFragment;
            case 1:
                ThemThuNhapFragment themThuNhapFragment = new ThemThuNhapFragment();
                return themThuNhapFragment;
            default:
                return null;

        }
    }

    @Override
    public int getCount() {
        return counttab;
    }
}
