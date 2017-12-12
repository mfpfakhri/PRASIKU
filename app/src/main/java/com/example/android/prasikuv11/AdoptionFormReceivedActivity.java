package com.example.android.prasikuv11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class AdoptionFormReceivedActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_adoption_form_received);
    }
    public void openUserAdoptionForm(View view){
        Intent useradoptionform = new Intent(this, UserAdoptionFormActivity.class);
        startActivity(useradoptionform);
    }
}
