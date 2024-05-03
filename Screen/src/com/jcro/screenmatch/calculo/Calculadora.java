package com.jcro.screenmatch.calculo;

import com.jcro.screenmatc.modelos.Pelicula;
import com.jcro.screenmatc.modelos.Serie;
import com.jcro.screenmatc.modelos.Titulo;

public class Calculadora {

    private int tiempototal;

    public int getTiempototal() {
        return tiempototal;
    }

    public void incluye(Titulo titulo){
        this.tiempototal += titulo.getDuracionEnMinutos();
    }

}
