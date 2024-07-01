package com.example.myapplication;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;

import androidx.appcompat.app.AppCompatActivity;


public class ThirdActivity extends AppCompatActivity {
  @Override
  protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.actvity_third);
      Button btn = findViewById(R.id.gotofirst);
      btn.setOnClickListener(v -> {

          Intent intent = new Intent(this,MainActivity.class);
          startActivity(intent);

      });

  }
}
