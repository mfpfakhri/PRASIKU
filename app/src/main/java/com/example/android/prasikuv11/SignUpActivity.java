package com.example.android.prasikuv11;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class SignUpActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sign_up);

        Spinner spinnerProvince = (Spinner) findViewById(R.id.signup_spinner_province);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> signUpProvinceAdapter = ArrayAdapter.createFromResource(this, R.array.province_spinner, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        signUpProvinceAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerProvince.setAdapter(signUpProvinceAdapter);

        Spinner spinnerCity = (Spinner) findViewById(R.id.signup_spinner_city);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> signUpCityAdapter = ArrayAdapter.createFromResource(this, R.array.city_spinner, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        signUpCityAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerCity.setAdapter(signUpCityAdapter);
    }
}
