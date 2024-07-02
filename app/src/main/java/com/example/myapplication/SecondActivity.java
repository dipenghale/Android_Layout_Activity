package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;

public class SecondActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        TextView display_fullname = findViewById(R.id.display_fullname);
        TextView display_email = findViewById(R.id.display_email);

        //Receive data sent from Main Activity
        Bundle bundle = getIntent().getExtras();
        String full_name = bundle.getString("full_name");
        String email_address = bundle.getString("email_address");

        //set received data to textview in layout
        display_fullname.setText(full_name);
        display_email.setText(email_address);

        //Go to Main activity after button clicked
        Button btn = findViewById(R.id.gotothird);
        btn.setOnClickListener(v -> {

                Intent intent = new Intent(this,ThirdActivity.class);
                startActivity(intent);

        });

    }
}