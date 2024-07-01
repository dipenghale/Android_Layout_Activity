package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
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
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText etName = findViewById(R.id.etName);

        Button btn = findViewById(R.id.regButton);
        btn.setOnClickListener(v -> {
            String name = etName.getText().toString();
            if(name.isEmpty()) {
                //DO SOMETHING! {RUN SOME FUNCTION ... DO CHECKS... ETC}
                Toast toast = Toast.makeText(this,"Full Name is empty.",Toast.LENGTH_LONG);
                toast.show();
            }
            else {
                Intent intent = new Intent(this,SecondActivity.class);
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
}