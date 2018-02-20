package com.example.ejer1_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ArrayAdapter;
import android.widget.EditText;
import android.widget.Spinner;
import android.widget.Toast;

public class ReservaActivity extends AppCompatActivity {

    static final String EXTRA_DATOS_RESERVA = "DATOSRESERVA";
    EditText EtNombre, EtPersonas, EtObservaciones;
    Spinner SpDia, SpHora;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_reserva);

        EtNombre = (EditText)findViewById(R.id.ArEtNombre);
        EtPersonas = (EditText)findViewById(R.id.ArEtPersonas);
        EtObservaciones = (EditText)findViewById(R.id.ArEtObservaciones);
        SpDia = (Spinner)findViewById(R.id.ArSpDia);
        SpHora = (Spinner)findViewById(R.id.ArSpHora);

        String [] dias = {"Selecciona","Lunes","Martes","Miercoles","Jueves","Viernes","Sabado"
                };
        ArrayAdapter<String> adaptDias = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,dias);
        SpDia.setAdapter(adaptDias);

        String [] hora = {"","13:30","14:00","14:30","15:00","15:30",
                "20:30","21:00","21:30","22:00","22:30","23:00","23:30","00:00",};
        ArrayAdapter<String> adaptHoras = new ArrayAdapter<String>(this,
                android.R.layout.simple_expandable_list_item_1,hora);
        SpHora.setAdapter(adaptHoras);



    }//FIN onCreate

    public void clickArReservar (View view){

        String nombre = EtNombre.getText().toString();
        String persona = EtPersonas.getText().toString();
        String observacion = EtObservaciones.getText().toString();
        String diaSelec = SpDia.getSelectedItem().toString();
        String horaSelec= SpHora.getSelectedItem().toString();

        if (nombre.equals("") || persona.equals("") || diaSelec.equals("Selecciona") || horaSelec.equals("")) {

            Toast.makeText(getApplicationContext(), "Todos los campos son obligatorios menos " +
                    "Observacion", Toast.LENGTH_LONG).show();

        }else{

            int numPersonas = Integer.parseInt(persona);

            if (numPersonas > 0 && numPersonas < 20){

                ParceableReservaActivity datosReserva = new ParceableReservaActivity(nombre, numPersonas,
                        diaSelec, horaSelec, observacion);

                Intent i = new Intent(getApplicationContext(), InfoReservaActivity.class);

                i.putExtra(EXTRA_DATOS_RESERVA, datosReserva);

                startActivity(i);
            }else{

                Toast.makeText(getApplicationContext(),
                        "El número de personas debe ser entre 1 y 19",
                        Toast.LENGTH_LONG).show();
            }
        }

    }


}//FIN MainActivity
