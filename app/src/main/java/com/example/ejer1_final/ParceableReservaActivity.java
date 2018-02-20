package com.example.ejer1_final;

import android.os.Parcel;
import android.os.Parcelable;

/**
 * Created by DIDACT on 20/02/2018.
 */

public class ParceableReservaActivity implements Parcelable {

    //Atributos

    String nombre;
    int persona;
    String dia;
    String hora;
    String observacion;

    //Constructor

    public ParceableReservaActivity(String nombre, int persona, String dia, String hora, String observacion) {
        this.nombre = nombre;
        this.persona = persona;
        this.dia = dia;
        this.hora = hora;
        this.observacion = observacion;
    }

    public ParceableReservaActivity (Parcel p){
        readFromParcel(p);
    }

    //CREATOR

    public static final Creator<ParceableReservaActivity> CREATOR = new
            Creator<ParceableReservaActivity>() {

        @Override
        public ParceableReservaActivity createFromParcel(Parcel in) {
            return new ParceableReservaActivity(in);
        }

        @Override
        public ParceableReservaActivity[] newArray(int size) {
            return new ParceableReservaActivity[size];
        }
    };

    //Getters and Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getObservacion() {
        return observacion;
    }

    public void setObservacion(String observacion) {
        this.observacion = observacion;
    }

    @Override
    public int describeContents() {
        return 0;
    }

    @Override
    public void writeToParcel(Parcel dest, int flags) {

        dest.writeString(this.nombre);
        dest.writeInt(this.persona);
        dest.writeString(this.dia);
        dest.writeString(this.hora);
        dest.writeString(this.observacion);

    }

    private void readFromParcel (Parcel p){

        this.nombre = p.readString();
        this.persona = p.readInt();
        this.dia = p.readString();
        this.hora = p.readString();
        this.observacion = p.readString();

    }
}
