package com.example.android.prasikuv11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void openBreeds(View view){
        Intent catbreeds = new Intent(this, CatBreedsActivity.class);
        startActivity(catbreeds);
    }
    public void openCatAdoption(View view){
        Intent catadoption = new Intent(this, FindCatAdoptionActivity.class);
        startActivity(catadoption);
    }
    public void openUploadAnimal(View view){
        Intent catadoption = new Intent(this, UploadAnimalActivity.class);
        startActivity(catadoption);
    }
    public void openAdoptionFormReceived(View view){
        Intent catadoption = new Intent(this, AdoptionFormReceivedActivity.class);
        startActivity(catadoption);
    }
}
