package com.jcro.screenmatc.modelos;

import com.jcro.screenmatch.calculo.Clasificacion;

public class Episodio implements Clasificacion {

    private int numero;
    private String nombre;
    private Serie serie;
    private int totalVisua;


    public int getTotalVisua() {
        return totalVisua;
    }

    public void setTotalVisua(int totalVisua) {
        this.totalVisua = totalVisua;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Serie getSerie() {
        return serie;
    }

    public void setSerie(Serie serie) {
        this.serie = serie;
    }

    @Override
    public int getClasificacion() {
        if (totalVisua > 100){

            return  4;

        }else {
            return 2;
        }
    }
}
