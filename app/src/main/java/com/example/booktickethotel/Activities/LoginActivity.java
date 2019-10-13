package com.example.booktickethotel.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.booktickethotel.R;
import com.example.booktickethotel.model.user;

import java.util.ArrayList;

import static android.app.PendingIntent.getActivity;
import static android.widget.Toast.LENGTH_SHORT;
import static com.example.booktickethotel.R.layout.activity_login;

public class LoginActivity extends AppCompatActivity {
    private View.OnClickListener mListener;
    private EditText name,password;
    private  TextView info;
    private ImageView login;
    private int counter=3;

    public LoginActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        name = findViewById(R.id.enter_username);
        password = findViewById(R.id.enter_password);
        info = findViewById(R.id.userInfo);
        login = findViewById(R.id.button_login);
        info.setText("Number of attempts remaining: 3");
        login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                validate(name.getText().toString(),password.getText().toString());
            }
        });
//        final ArrayList<user> listUser = new ArrayList<user>();
//        listUser.add(new user("victor","victor"));
//        listUser.add(new user("Victor","Victor"));
    }
    private void validate(String Username, String Userpass){
        if((Username.equals("victor")) && (Userpass.equals("victor"))){
            Intent intent = new Intent(LoginActivity.this,MainActivity.class);
            startActivity(intent);
            finish();
        }else{
            counter--;
            info.setText("Number of attempt remaining: " + counter);
            if(counter==0){
                login.setEnabled(false);
            }
        }
    }


//    private void handlerLogin() {
//        startActivity(new Intent(LoginActivity.this,MainActivity.class));
//        finish();
    //}

    @Override
    public void onPointerCaptureChanged(boolean hasCapture) {

    }

//    public void handlerLogin(View view) {
//        startActivity(new Intent(LoginActivity.this,MainActivity.class));
//        finish();
//    }
}
