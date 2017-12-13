package com.example.android.prasikuv11;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class UploadAnimalActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_upload_animal);

        Spinner spinnerProvince = (Spinner) findViewById(R.id.cat_upload_spinner_province);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> catUploadProvinceAdapter = ArrayAdapter.createFromResource(this, R.array.province_spinner, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        catUploadProvinceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerProvince.setAdapter(catUploadProvinceAdapter);

        Spinner spinnerCity = (Spinner) findViewById(R.id.cat_upload_spinner_city);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> catUploadCityAdapter = ArrayAdapter.createFromResource(this, R.array.city_spinner, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        catUploadCityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerCity.setAdapter(catUploadCityAdapter);

        Spinner spinnerReason = (Spinner) findViewById(R.id.cat_upload_spinner_reason);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> catUploadReasonAdapter = ArrayAdapter.createFromResource(this, R.array.reason_spinner, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        catUploadReasonAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerReason.setAdapter(catUploadReasonAdapter);
    }
}
