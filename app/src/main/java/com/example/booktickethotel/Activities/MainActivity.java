package com.example.booktickethotel.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.net.Uri;
import android.os.Bundle;

import com.example.booktickethotel.Fragment.HomeFragment;
import com.example.booktickethotel.Fragment.LoginFragment;
import com.example.booktickethotel.Fragment.OrderFragment;
import com.example.booktickethotel.Fragment.UserFragment;
import com.example.booktickethotel.R;

public class MainActivity extends AppCompatActivity implements LoginFragment.OnFragmentInteractionListener,
        HomeFragment.OnFragmentInteractionListener,
        OrderFragment.OnFragmentInteractionListener,
        UserFragment.OnFragmentInteractionListener {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new LoginFragment())
                .commit();
    }

    @Override
    public void onFragmentInteraction() {

    }

    @Override
    public void buttonLoginClicked() {
        getSupportFragmentManager().beginTransaction()
                .replace(R.id.fragment_container, new HomeFragment())
                .commit();
    }

    @Override
    public void onFragmentInteraction(Uri uri) {

    }

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }
}
