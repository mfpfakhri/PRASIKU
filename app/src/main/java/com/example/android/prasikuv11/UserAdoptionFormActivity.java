package com.example.android.prasikuv11;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ArrayAdapter;
import android.widget.Spinner;

public class UserAdoptionFormActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_user_adoption_form);

        Spinner spinnerHouseType = (Spinner) findViewById(R.id.user_adoption_spinner_house_type);
        // Create an ArrayAdapter using the string array and a default spinner layout
        ArrayAdapter<CharSequence> userAdoptionHouseTypeAdapter = ArrayAdapter.createFromResource(this, R.array.house_type_spinner, android.R.layout.simple_spinner_item);
        // Specify the layout to use when the list of choices appears
        userAdoptionHouseTypeAdapter.setDropDownViewResource(android.R.layout.simple_spinner_dropdown_item);
        // Apply the adapter to the spinner
        spinnerHouseType.setAdapter(userAdoptionHouseTypeAdapter);
    }
}
