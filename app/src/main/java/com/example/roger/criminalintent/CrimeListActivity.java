package com.example.roger.criminalintent;

import android.support.v4.app.Fragment;

/**
 * Created by Roger on 8/29/2016.
 */
public class CrimeListActivity extends SingleFragmentActivity {

    @Override
    protected Fragment createFragment() {
        return new CrimeListFragment();
    }
}
