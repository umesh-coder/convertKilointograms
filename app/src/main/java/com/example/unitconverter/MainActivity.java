package com.example.unitconverter;

import android.health.connect.datatypes.units.Length;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {

    TextView gramas;
    Button convertintograms;
    EditText weightintkilo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        initializeViews();

        convertintograms.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                //that convert kilo into grams
                convertintograms();


            }
        });


    }

    private void convertintograms() {
        float kilo=0,grams=0;

        //1kg = 1000 grams

        kilo= Float.parseFloat(weightintkilo.getText().toString());

//        Toast.makeText(this,""+weightintkilo.getText(),Toast.LENGTH_LONG).show();

        //calculate the grams
        grams=kilo*1000;


//set the text
        gramas.setText(""+grams+" grams");


    }

    private void initializeViews() {
        gramas = findViewById(R.id.grams);
        convertintograms = findViewById(R.id.converter);
        weightintkilo=findViewById(R.id.weight_kilo);

    }
}