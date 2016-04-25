package com.gai.aleksej_gudkov;


import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.NavigationView;
import android.support.design.widget.Snackbar;
import android.support.design.widget.TabLayout;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.view.GravityCompat;
import android.support.v4.view.ViewPager;
import android.support.v4.widget.DrawerLayout;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.text.method.LinkMovementMethod;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.TextView;
import java.util.ArrayList;
import java.util.List;

import com.gai.aleksej_gudkov.data.DataBase;
import com.gai.aleksej_gudkov.fragments.InprogressFragment;
import com.gai.aleksej_gudkov.fragments.WaitingFragment;


public class MainActivity extends AppCompatActivity implements
        NavigationView.OnNavigationItemSelectedListener {

    private DrawerLayout mDrawer;
    private FloatingActionButton mFab;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);
        toolbar.setNavigationIcon(R.drawable.ic_menu);
        toolbar.setNavigationOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                mDrawer.openDrawer(GravityCompat.START);
            }
        });

        mFab = (FloatingActionButton) findViewById(R.id.fab);
        mFab.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Snackbar.make(view, "Replace with your own action", Snackbar.LENGTH_LONG) //[Comment] Hardcode
                        .setAction("Action", null).show();
            }
        });

        ViewPager viewPager = (ViewPager) findViewById(R.id.viewpager);
        createViewPager(viewPager);

        TabLayout tabLayout = (TabLayout) findViewById(R.id.tabs);
        tabLayout.setupWithViewPager(viewPager);

        mDrawer = (DrawerLayout) findViewById(R.id.econtact_drawer_layout);

        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        navigationView.setNavigationItemSelectedListener(this);

        TextView poweredText = (TextView)findViewById(R.id.powered_by);
        poweredText.setMovementMethod(LinkMovementMethod.getInstance());
    }

    public void hideFab(){

        mFab.hide();
    }


    public void showFab(){

        mFab.show();
    }


    @Override
    public boolean onNavigationItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.all_ref) {

            // do something

        } else if (id == R.id.map_ref) {

            // do something
        } else if (id == R.id.login_item) {

            // do something
        }

        mDrawer.closeDrawer(GravityCompat.START);
        return true;
    }


    /**
     * Close the drawer under the Back pressing
     * in order to prevent unexpected the app exit
     */
    @Override
    public void onBackPressed() {

        if (mDrawer.isDrawerOpen(GravityCompat.START)) {
            mDrawer.closeDrawer(GravityCompat.START);
        } else {
            super.onBackPressed();

        }
    }


    @Override
    public boolean onCreateOptionsMenu(Menu menu) {

        getMenuInflater().inflate(R.menu.menu_main, menu);
        return true;
    }


    @Override
    public boolean onOptionsItemSelected(MenuItem item) {

        int id = item.getItemId();

        if (id == R.id.action_filter) {
            return true;
        }

        return super.onOptionsItemSelected(item);
    }


    private void createViewPager(ViewPager viewPager) {

        ViewPagerAdapter adapter =
                new ViewPagerAdapter(getSupportFragmentManager());
        adapter.addFragment(InprogressFragment.newInstance(
                DataBase.getCard(DataBase.INPROGRESS_STATUS)), getResources().getString(R.string.in_progress));
        adapter.addFragment(InprogressFragment.newInstance(
                DataBase.getCard(DataBase.EXECUTED_STATUS)), getResources().getString(R.string.executed));
        adapter.addFragment(WaitingFragment.newInstance(
                DataBase.getCard(DataBase.WAITING_STATUS)), getResources().getString(R.string.waiting));

        viewPager.setAdapter(adapter);
    }


    class ViewPagerAdapter extends FragmentPagerAdapter { //[Comment] Should be external

        private final List<Fragment> mFragmentList = new ArrayList<>();
        private final List<String> mFragmentTitleList = new ArrayList<>();


        public ViewPagerAdapter(FragmentManager manager) {
            super(manager);
        }


        @Override
        public Fragment getItem(int position) {

            return mFragmentList.get(position);
        }


        @Override
        public int getCount() {

            return mFragmentList.size();
        }


        public void addFragment(Fragment fragment, String title) {

            mFragmentList.add(fragment);
            mFragmentTitleList.add(title);
        }


        @Override
        public CharSequence getPageTitle(int position) {

            return mFragmentTitleList.get(position);
        }
    }
}
