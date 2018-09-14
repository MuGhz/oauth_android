package com.example.mughz.oauth;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.gms.auth.api.signin.GoogleSignInAccount;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        Toast.makeText(getApplicationContext(), "Login Success", Toast.LENGTH_LONG);
        Intent intent = getIntent();
        String name = intent.getStringExtra("name");
        String email = intent.getStringExtra("email");
        String id = intent.getStringExtra("idToken");
        String auth = intent.getStringExtra("auth");
        TextView tv = findViewById(R.id.home_tv);
        tv.setText(name+" - "+email+" - "+id+" - "+auth);
    }
}
