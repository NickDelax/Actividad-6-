package com.example.nicodelacruz.doctorappointment;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.Spinner;
import android.widget.Toast;

import java.lang.reflect.Array;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Spinner bloodTypeSpinner = (Spinner) findViewById(R.id.bloodtype);
        ArrayAdapter<CharSequence> bloodTypeAdapter =
        ArrayAdapter.createFromResource(this, R.array.bloodtype, android.R.layout.simple_spinner_item);

        bloodTypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);

        bloodTypeSpinner.setAdapter(bloodTypeAdapter);

        Button clickMe = (Button) findViewById(R.id.Enviar);
        clickMe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this, "Presionado", Toast.LENGTH_LONG).show();
            }
        });
    }
}
