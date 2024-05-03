package com.jcro.screenmatc.modelos;

public class Serie extends Titulo{
    int temp;
    int epis_temp;
    int minutos_episo;

    public int getDuracionEnMinutos() {
        return temp = epis_temp * minutos_episo;
    }

    public int getTemp() {
        return temp;
    }

    public void setTemp(int temp) {
        this.temp = temp;
    }

    public int getEpis_temp() {
        return epis_temp;
    }

    public void setEpis_temp(int epis_temp) {
        this.epis_temp = epis_temp;
    }

    public int getMinutos_episo() {
        return minutos_episo;
    }

    public void setMinutos_episo(int minutos_episo) {
        this.minutos_episo = minutos_episo;
    }


}
