package com.example.android.prasikuv11;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class FindCatAdoptionActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_find_cat_adoption);

        Spinner spinnerProvince = (Spinner) findViewById(R.id.cat_adoption_spinner_province);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> catAdoptionProvinceAdapter = ArrayAdapter.createFromResource(this, R.array.province_spinner, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        catAdoptionProvinceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerProvince.setAdapter(catAdoptionProvinceAdapter);

        Spinner spinnerCity = (Spinner) findViewById(R.id.cat_adoption_spinner_city);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> catAdoptionCityAdapter = ArrayAdapter.createFromResource(this, R.array.city_spinner, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        catAdoptionCityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerCity.setAdapter(catAdoptionCityAdapter);
    }
}
