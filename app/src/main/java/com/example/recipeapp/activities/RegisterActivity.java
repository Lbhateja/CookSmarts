package com.example.recipeapp.activities;

import android.content.Intent;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.example.recipeapp.R;

public class RegisterActivity extends AppCompatActivity {

    EditText username, password,repassword;
    Button  btnsignup;
    DBHelper DB;
    public void onBackPressed() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
            finishAndRemoveTask();
        }
        this.finishAffinity();
    }
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.register);

        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);
        EditText repassword = (EditText) findViewById(R.id.repassword);
        Button btnsignup = (Button) findViewById(R.id.btnsignup);
        DB = new DBHelper(this);


        btnsignup.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String user = username.getText().toString();
                String pass = password.getText().toString();
                String repass = repassword.getText().toString();

                if(pass.equals("") || user.equals("") || repass.equals("")){
                    Toast.makeText(RegisterActivity.this, "Please fill out all the given Fields", Toast.LENGTH_LONG).show();
                }
                else
                if(pass.equals(repass)){
                    Boolean checkuser = DB.checkusername(user);
                    if (checkuser==false){
                        Boolean insertdata = DB.insertData(user,pass);
                        if(insertdata == true){
                            Toast.makeText(RegisterActivity.this, "Registered Successfully", Toast.LENGTH_LONG).show();
                            Intent intent = new Intent(getApplicationContext(), LoginActivity.class);
                            startActivity(intent);
                        }
                        else{
                            Toast.makeText(RegisterActivity.this, "Registration failed.", Toast.LENGTH_SHORT).show();
                        }

                    }
                    else {
                        Toast.makeText(RegisterActivity.this, "User already exists.", Toast.LENGTH_SHORT).show();
                    }

                }
                else{
                    Toast.makeText(RegisterActivity.this, "Entered Password does not match.", Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}