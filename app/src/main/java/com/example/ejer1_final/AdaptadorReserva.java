package com.example.ejer1_final;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.annotation.Nullable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;

import com.example.ejer1_final.ArrayLvReservas;
import com.example.ejer1_final.R;

import java.util.ArrayList;


/**
 * Created by Melania on 20/02/2018.
 */

public class AdaptadorReserva extends ArrayAdapter<ArrayLvReservas> {
    ArrayList<ArrayLvReservas> reservas;
    Context c;

    public AdaptadorReserva(Context c, ArrayList<ArrayLvReservas> reservas) {
        super(c, R.layout.item_reservas, reservas);
        this.c = c;
        this.reservas = reservas;
    }


    @NonNull
    @Override
    public View getView(int position, @Nullable View convertView, @Nullable ViewGroup parent) {

        LayoutInflater inflater = LayoutInflater.from(getContext());
        View item = inflater.inflate(R.layout.item_reservas,null);

        //TextView

        TextView tvNombre = (TextView)item.findViewById(R.id.IrTvNombre);
        tvNombre.setText(reservas.get(position).getNombre());

        TextView tvHora = (TextView)item.findViewById(R.id.IrTvHora);
        tvHora.setText(reservas.get(position).getHora());

        TextView tvDia = (TextView)item.findViewById(R.id.IrTvDia);
        tvDia.setText(reservas.get(position).getDia());

        TextView tvPersonas = (TextView)item.findViewById(R.id.IrTvPersonas);
        tvPersonas.setText(reservas.get(position).getPersona());

        return item;
    }
}

