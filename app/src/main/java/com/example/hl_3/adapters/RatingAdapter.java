package com.example.hl_3.adapters;

import android.os.Bundle;

import androidx.annotation.NonNull;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.viewpager2.adapter.FragmentStateAdapter;

import com.example.hl_3.fragments.RatingFragment;

public class RatingAdapter extends FragmentStateAdapter {


    public RatingAdapter(@NonNull FragmentActivity fragmentActivity) {
        super(fragmentActivity);
    }

    @NonNull
    @Override
    public Fragment createFragment(int position) {
        Fragment fragment = new RatingFragment();
        //Bundle args = new Bundle();
        return fragment;
    }

    @Override
    public int getItemCount() {
        return 0;
    }
}
