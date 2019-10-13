package com.example.booktickethotel.Activities;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import com.example.booktickethotel.R;
import com.example.booktickethotel.model.user;

import java.util.ArrayList;

import static android.app.PendingIntent.getActivity;
import static com.example.booktickethotel.R.layout.activity_login;

public class LoginActivity extends AppCompatActivity {
    private View.OnClickListener mListener;
    String userr,pass;

    public LoginActivity() {
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(activity_login);
        ImageView btnLogin = findViewById(R.id.button_login);
        final EditText username = findViewById(R.id.enter_username);
        EditText password = findViewById(R.id.enter_password);
        final TextView User = findViewById(R.id.textView4);
        final TextView Pass = findViewById(R.id.textView5);
//        final ArrayList<user> listUser = new ArrayList<user>();
//        listUser.add(new user("victor","victor"));
//        listUser.add(new user("Victor","Victor"));

        btnLogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                userr = User.getText().toString();
                pass = Pass.getText().toString();
                Bundle b = new Bundle();
                b.putString("u",userr);
                b.putString("p",pass);
                Intent intent = new Intent(LoginActivity.this,MainActivity.class);
               intent.putExtras(b);
                startActivity(intent);
            }
        });
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
