package com.example.logingroup6;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    EditText username, password;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        username=findViewById(R.id.username);
        password=findViewById(R.id.password);

    }

    public void verifydata(View view) {
        String strusername = username.getText().toString();
        String strpassword = password.getText().toString();


        if (strusername.equals("rhona@gmail.com") && strpassword.equals("rhona2020")){

            Intent intent = new Intent(this, RhonaData.class);
            startActivity(intent);

        }else if (strusername.equals("alex@gmail.com") && strpassword.equals("alex2020")){

            Intent intent = new Intent(this, AlexData.class);
            startActivity(intent);

        }else if (strusername.equals("christian@gmail.com") && strpassword.equals("christian2020")){

            Intent intent = new Intent(this, ChristianData.class);
            startActivity(intent);

        }else if (strusername.equals("shiela@gmail.com") && strpassword.equals("shiela2020")){

            Intent intent = new Intent(this, ShielaData.class);
            startActivity(intent);

        }else{

            Toast.makeText(this, "Username or Password is Incorrect!", Toast.LENGTH_SHORT).show();

        }

    }

    @Override
    public void onBackPressed() {
        super.onBackPressed();
        this.finish();
    }
}