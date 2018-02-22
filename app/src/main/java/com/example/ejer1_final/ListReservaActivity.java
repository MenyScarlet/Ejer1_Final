package com.example.ejer1_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.AdapterView.OnItemClickListener;
import android.widget.ListView;

import java.util.ArrayList;

public class ListReservaActivity extends AppCompatActivity {
    static final String EXTRA_DATOS_RESERVA = "DATOSRESERVA";
    ListView lvReservas;
    ArrayList<Reserva> lista_reservas = new ArrayList<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_list_reserva);

        cargarDatos();

        lvReservas = (ListView)findViewById(R.id.AlrLvReservas);
        AdaptadorReserva adaptador = new AdaptadorReserva(this,lista_reservas);
        lvReservas.setAdapter(adaptador);
        lvReservas.setOnItemClickListener(new OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {

                Reserva r =((Reserva)adapterView.getItemAtPosition(i));
                Intent intent = new Intent(getApplicationContext(), InfoReservaActivity.class);

                intent.putExtra(EXTRA_DATOS_RESERVA, r);

                startActivity(intent);
            }
        });
    }



    private void cargarDatos(){

        lista_reservas.add(new Reserva("Ricardo",1,"15:00", "Viernes", ""));
        lista_reservas.add(new Reserva("Ricardo",1,"15:00", "Viernes", ""));
        lista_reservas.add(new Reserva("Ricardo",1,"15:00", "Viernes", ""));
        lista_reservas.add(new Reserva("Ricardo",1,"15:00", "Viernes", ""));
        lista_reservas.add(new Reserva("Ricardo",1,"15:00", "Viernes", ""));
        lista_reservas.add(new Reserva("Ricardo",1,"15:00", "Viernes", ""));




    }
}
