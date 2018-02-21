package com.example.ejer1_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class InfoReservaActivity extends AppCompatActivity {

    TextView tvDatosReserva;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_info_reserva);

        tvDatosReserva = (TextView)findViewById(R.id.AirTvDatosReserva);

        Bundle b = getIntent().getExtras();
        if (b!=null){

            ParceableReservaActivity p = b.getParcelable(ReservaActivity.EXTRA_DATOS_RESERVA);

            tvDatosReserva.setText(
                    "Nombre: " + p.getNombre() +
                    "\nNº de personas: " + p.getPersona() +
                    "\nDia: "+ p.getDia() +
                    "\nHora: " + p.getHora() +
                    "\nObservaciones: " + p.getObservacion());

            tvDatosReserva.setText(b.getString("RESERVA"));
        }

    }//FIN onCreate

    public void clickAirAceptar (View view){

        Intent i = new Intent(getApplicationContext(),MainActivity.class);
        startActivity(i);

    }

}//FIN MainActivity
