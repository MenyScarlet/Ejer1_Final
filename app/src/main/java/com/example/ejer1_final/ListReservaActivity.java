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

    ListView lvReservas;
    ArrayList<ArrayLvReservas> lista_reservas = new ArrayList<>();

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

                Intent intent = new Intent(getApplicationContext(), InfoReservaActivity.class);

                intent.putExtra("RESERVA", lvReservas.getItemAtPosition(i).toString());

                startActivity(intent);
            }
        });
    }



    private void cargarDatos(){

        lista_reservas.add(new ArrayLvReservas("Ricardo","15:00", "Viernes", 3));
        lista_reservas.add(new ArrayLvReservas("Lorena","15:30", "Lunes", 6));
        lista_reservas.add(new ArrayLvReservas("Maria","16:00", "Martes", 3));
        lista_reservas.add(new ArrayLvReservas("Vicente","16:30", "Miercoles", 8));
        lista_reservas.add(new ArrayLvReservas("Alonso","14:00", "Sabado", 2));
        lista_reservas.add(new ArrayLvReservas("Macarena","14:30", "Lunes", 5));



    }
}
