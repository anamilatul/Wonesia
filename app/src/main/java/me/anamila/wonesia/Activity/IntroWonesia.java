package me.anamila.wonesia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import me.anamila.wonesia.R;

public class IntroWonesia extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_intro_wonesia);

    }
    public void btnStart(View view){
        Intent it = new Intent(this, Register.class);
        startActivity(it);
    }
}