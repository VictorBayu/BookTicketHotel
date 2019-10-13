package com.example.booktickethotel.Activities;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

import com.example.booktickethotel.Fragment.HomeFragment;
import com.example.booktickethotel.Fragment.hotel.Hotel1Fragment;
import com.example.booktickethotel.Fragment.OrderFragment;
import com.example.booktickethotel.Fragment.UserFragment;
import com.example.booktickethotel.Fragment.hotel.Hotel2Fragment;
import com.example.booktickethotel.Fragment.hotel.Hotel3Fragment;
import com.example.booktickethotel.Fragment.hotel.Hotel4Fragment;
import com.example.booktickethotel.Fragment.hotel.Hotel5Fragment;
import com.example.booktickethotel.R;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity implements
        BottomNavigationView.OnNavigationItemSelectedListener,
        HomeFragment.OnFragmentInteractionListener,
        OrderFragment.OnFragmentInteractionListener,
        Hotel1Fragment.OnFragmentInteractionListener,
        Hotel2Fragment.OnFragmentInteractionListener,
        Hotel3Fragment.OnFragmentInteractionListener,
        Hotel4Fragment.OnFragmentInteractionListener,
        Hotel5Fragment.OnFragmentInteractionListener
{
    private UserFragment userFragment;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        loadFragment(new HomeFragment());
        userFragment = UserFragment.newInstance("Victor");
        BottomNavigationView bottomNavigationView = findViewById(R.id.navigation);
        bottomNavigationView.setOnNavigationItemSelectedListener(this);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container,new HomeFragment())
                .commit();
    }
    private boolean loadFragment(Fragment fragment){
        if (fragment != null) {
            getSupportFragmentManager().beginTransaction()
                    .replace(R.id.fragment_container, fragment)
                    .addToBackStack(null)
                    .commit();
            return  true;
        }
        return false;
    }

    @Override
    public void onFragmentInteraction() {

    }

//    @Override
//    public void buttonLoginClicked() {
//        getSupportFragmentManager().beginTransaction()
//                .replace(R.id.fragment_container, new HomeFragment())
//                .commit();
//    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem menuItem) {
        Fragment fragment = null;
        switch (menuItem.getItemId()){
            case R.id.action_home:
                fragment = new HomeFragment();
                break;
            case R.id.action_order:
                fragment = new OrderFragment();
                break;
            case R.id.action_user:
                fragment = new UserFragment();
                break;
        }
        return loadFragment(fragment);
    }

    public void handlerHotel1(View view) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new Hotel1Fragment())
                .commit();
    }

    public void handlerHotel2(View view) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new Hotel2Fragment())
                .commit();
    }

    public void handlerHotel3(View view) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new Hotel3Fragment())
                .commit();
    }

    public void handlerHotel4(View view) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new Hotel4Fragment())
                .commit();
    }

    public void handlerHotel5(View view) {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new Hotel1Fragment())
                .commit();
    }
}
