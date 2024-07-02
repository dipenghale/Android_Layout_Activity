package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class
MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d((String) "MainActivity", "onCreate");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etName = findViewById(R.id.etName);
        EditText etEmail = findViewById(R.id.etEmail);

        Button btn = findViewById(R.id.regButton);
        btn.setOnClickListener(v -> {
            String name = etName.getText().toString();
            String email = etEmail.getText().toString();
            if(name.isEmpty()) {
                //DO SOMETHING! {RUN SOME FUNCTION ... DO CHECKS... ETC}
                Toast toast = Toast.makeText(this,"Full Name is empty.",Toast.LENGTH_LONG);
                toast.show();
            }
            else {
                Intent intent = new Intent(this,SecondActivity.class);
                intent.putExtra("full_name",name);
                intent.putExtra("email_address",email);
                startActivity(intent);
            }
        });


/*
        Spinner spinner = (Spinner) findViewById(R.id.spinner);
// Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> adapter = ArrayAdapter.createFromResource(this,
                R.array.country_array, android.R.layout.simple_spinner_item);
// Specify the layout to use when the list of choices appears
        adapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
// Apply the adapter to the spinner
        spinner.setAdapter(adapter);

 */


    }

    @Override
    public void onStart(){
        super.onStart();
        Log.d((String) "MainActivity", "onStart");
    }

    @Override
    public void onPause(){
        super.onPause();
        Log.d((String) "MainActivity", "onPause");
    }

    @Override
    public void onResume(){
        super.onResume();
        Log.d((String) "MainActivity", "onResume");
    }

    @Override
    public void onStop(){
        super.onStop();
        Log.d((String) "MainActivity", "onStop");
    }

    @Override
    public void onDestroy(){
        super.onDestroy();
        Log.d((String) "MainActivity", "onDestroy");
    }

    @Override
    public void onRestart(){
        super.onRestart();
        Log.d((String) "MainActivity", "onRestart");
    }

}