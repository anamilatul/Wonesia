package me.anamila.wonesia.Activity;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import me.anamila.wonesia.DatabaseHelper;
import me.anamila.wonesia.R;

public class Register extends AppCompatActivity {
    EditText name,username,email,password,rePassword;
    TextView tvLog;
    Button signUp;
    DatabaseHelper DB;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        name = findViewById(R.id.edtName);
        username = findViewById(R.id.edtUsername);
        email = findViewById(R.id.edtEmail);
        password = findViewById(R.id.edtPassword);
        rePassword = findViewById(R.id.edtRePassword);
        signUp = findViewById(R.id.btnRegister);
        tvLog = findViewById(R.id.tvLog);
        DB = new DatabaseHelper(this);

        signUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String nmUser = name.getText().toString();
                String user = username.getText().toString();
                String mail = email.getText().toString();
                String pass = password.getText().toString();
                String repass = rePassword.getText().toString();

                if(nmUser.equals("")||user.equals("")||mail.equals("")||pass.equals("")||repass.equals("")){
                    Toast.makeText(Register.this, "Please enter all the fields",Toast.LENGTH_SHORT).show();
                }
                else{
                    if(pass.equals(repass)){
                        Boolean checkUser = DB.checkUsername(user);
                        if(checkUser==false){
                            Boolean insert = DB.insertDataUsPass(nmUser,user,mail,pass);
                            if(insert==true){
                                Toast.makeText(Register.this,"Registered successfully, please Login!",Toast.LENGTH_SHORT).show();
                                Intent intent = new Intent(getApplicationContext(),Login.class);
                                startActivity(intent);
                            }else{
                                Toast.makeText(Register.this,"Registration Failed",Toast.LENGTH_SHORT).show();
                            }
                        }else{
                            Toast.makeText(Register.this,"User already exists! please Login",Toast.LENGTH_SHORT).show();
                        }
                    }else{
                        Toast.makeText(Register.this,"Password not matching",Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });
        tvLog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent it = new Intent(getApplicationContext(), Login.class);
                startActivity(it);
            }
        });
    }
}