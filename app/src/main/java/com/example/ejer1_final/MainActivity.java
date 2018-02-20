package com.example.ejer1_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

    }//FIN onCreate

    public void clickAmReservar (View view){

        Intent i = new Intent(getApplicationContext(),ReservaActivity.class);
        startActivity(i);

    }

    public void clickAmVerReservas (View view){

        Intent i = new Intent(getApplicationContext(),ListReservaActivity.class);
        startActivity(i);

    }

}//FIN MainActivity
