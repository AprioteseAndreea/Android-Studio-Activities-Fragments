package com.example.tema1android.activities;

import android.content.Intent;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import com.example.tema1android.R;
import com.example.tema1android.interfaces.ActivityFragmentCommunication;

public class MainActivity extends AppCompatActivity implements ActivityFragmentCommunication {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }

    @Override
    public void openSecondActivity() {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
        finish();
    }

    @Override
    public void replaceF2A2() {

    }

    @Override
    public void replaceF3A2() {

    }

    @Override
    public void removeF1A2() {

    }


}
