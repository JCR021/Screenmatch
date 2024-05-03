package com.jcro.screenmatch.calculo;

public class Recomend {

    public void filtra(Clasificacion clasificacion){
        if(clasificacion.getClasificacion() >= 4){
            System.out.println("Buena chaval");

        } else if (clasificacion.getClasificacion() >= 2) {
            System.out.println("Popular chaval");
        }else {
            System.out.println("Miratelo aunque no este bueno chaval");
        }


    }

}
