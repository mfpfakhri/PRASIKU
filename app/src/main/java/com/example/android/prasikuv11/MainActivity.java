package com.example.android.prasikuv11;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
    public void openSignUp(View view){
        Intent signup = new Intent(this, SignUpActivity.class);
        startActivity(signup);
    }
    public void openResetPassword(View view){
        Intent resetpass = new Intent(this, ForgotPasswordActivity.class);
        startActivity(resetpass);
    }
    public void openHome(View view){
        Intent home = new Intent(this, HomeActivity.class);
        startActivity(home);
    }
}
