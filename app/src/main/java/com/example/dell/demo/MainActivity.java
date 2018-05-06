package com.example.dell.demo;

import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.Menu;
import android.view.MenuItem;
import android.widget.Button;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        setSupportActionBar(toolbar);

        initView();
    }

    private void initView() {
        EditText et_username, et_password;
        Button bt_login;

        et_username = findViewById(R.id.et_username);
        et_password = findViewById(R.id.et_password);

        bt_login = findViewById(R.id.bt_login);

        bt_login.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {


                //Check for username and password validation then goTo Registration Activity.


                Intent startRegistrationActivity = new Intent(MainActivity.this, RegistrationActivity.class);
                startActivity(startRegistrationActivity);
            }
        });
    }

}
