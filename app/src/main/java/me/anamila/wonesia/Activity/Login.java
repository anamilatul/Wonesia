package me.anamila.wonesia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.content.SharedPreferences;
import android.os.Bundle;
import android.preference.PreferenceManager;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import me.anamila.wonesia.DatabaseHelper;
import me.anamila.wonesia.R;

public class Login extends AppCompatActivity {
    EditText username,password;
    TextView create;
    Button btnlogin;
    DatabaseHelper DB;
    //tambahan
//    SharedPreferences sharedPref;
//    static  String KEY_USER = "nama_user";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        username = findViewById(R.id.edtUsername);
        password = findViewById(R.id.edtPassword);
        create = findViewById(R.id.tvCreate);
        btnlogin = findViewById(R.id.btnLogin);
        DB = new DatabaseHelper(this);

        create.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), Register.class);
                startActivity(it);
            }
        });

        btnlogin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String user = username.getText().toString();
                String pass = password.getText().toString();

                if(user.equals("")||pass.equals("")){
                    Toast.makeText(Login.this,"Please enter all the fields",Toast.LENGTH_SHORT).show();
                }
                else{
                    Boolean checkUserPass = DB.checkUsernamePassword(user,pass);
                    if(checkUserPass==true){
                        Toast.makeText(Login.this,"Login Successfull & You are login as "+user,Toast.LENGTH_SHORT).show();
                        Intent intent = new Intent(getApplicationContext(), Dashboard.class);
                        startActivity(intent);
                    }
                    else{
                        Toast.makeText(Login.this,"Invalid Credentials",Toast.LENGTH_SHORT).show();
                    }
                }
            }
        });
    }
}