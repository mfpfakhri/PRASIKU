package com.example.android.prasikuv11;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class CatBreedsActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_cat_breeds);

        Spinner spinnerCatBreeds = (Spinner) findViewById(R.id.spinner_cat_breeds);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> catBreedsSpinnerAdapter = ArrayAdapter.createFromResource(this, R.array.cat_breeds_spinner, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        catBreedsSpinnerAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerCatBreeds.setAdapter(catBreedsSpinnerAdapter);
    }
}
