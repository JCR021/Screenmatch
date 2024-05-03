package com.jcro.screenmatc.modelos;

import com.jcro.screenmatch.calculo.Clasificacion;

public class Pelicula  extends Titulo implements Clasificacion {
    private String director;

    public void setDirector(String director) {
        this.director = director;
    }

    @Override
    public int getClasificacion() {
        return (int) (calculaMedia() / 2);
    }
}