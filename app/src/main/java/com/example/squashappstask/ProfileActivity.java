package com.example.squashappstask;

import androidx.appcompat.app.AppCompatActivity;
import androidx.viewpager.widget.ViewPager;

import com.example.squashappstask.adapter.ViewPagerAdapter;
import com.example.squashappstask.fragments.LikesFragment;
import com.example.squashappstask.fragments.VideoFragment;
import com.google.android.material.tabs.TabLayout;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageButton;
import android.widget.PopupMenu;

import java.util.Objects;


public class ProfileActivity extends AppCompatActivity {

    ViewPager viewPager;
    TabLayout tabLayout;
    ImageButton popUp;
    private int[] tabIcons = {
            R.drawable.videos,
            R.drawable.likes,
    };

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_profile);

        viewPager = findViewById(R.id.viewPager);
        tabLayout = findViewById(R.id.tabLayout);
        popUp = findViewById(R.id.popUp);

        addTabs(viewPager);
        tabLayout.setupWithViewPager(viewPager);
        setupTabIcons();

        popUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                showPopUpListener(v);
            }
        });
    }

    private void showPopUpListener(View v) {
        PopupMenu popup = new PopupMenu(ProfileActivity.this, v);
        popup.getMenuInflater().inflate(R.menu.activity_profile_menu, popup.getMenu());

        popup.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
            public boolean onMenuItemClick(MenuItem item) {
                return true;
            }
        });
        popup.show();

    }

    private void addTabs(ViewPager viewPager) {
        ViewPagerAdapter adapter = new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFrag(new VideoFragment(), "09 Videos");
        adapter.addFrag(new LikesFragment(), "Liked");
        viewPager.setAdapter(adapter);
    }

    private void setupTabIcons() {
        Objects.requireNonNull(tabLayout.getTabAt(0)).setIcon(tabIcons[0]);
        Objects.requireNonNull(tabLayout.getTabAt(1)).setIcon(tabIcons[1]);
    }
}