package com.example.ejer1_final;

/**
 * Created by DIDACT on 20/02/2018.
 */

public class ArrayLvReservas {

    //Atributos
    String nombre;
    String hora;
    String dia;
    int persona;

    //Constructor

    public ArrayLvReservas(String nombre, String hora, String dia, int persona) {
        this.nombre = nombre;
        this.hora = hora;
        this.dia = dia;
        this.persona = persona;
    }


    //Getters and Setters


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getDia() {
        return dia;
    }

    public void setDia(String dia) {
        this.dia = dia;
    }

    public int getPersona() {
        return persona;
    }

    public void setPersona(int persona) {
        this.persona = persona;
    }
}
