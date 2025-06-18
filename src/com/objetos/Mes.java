package com.objetos;

public class Mes {
    private int temperaturaMax;
    private int temperaturaMin;
    private String Nombre;

    public int getTemperaturaMax() {
        return this.temperaturaMax;
    }

    public void setTemperaturaMax(int temperaturaMax) {
        this.temperaturaMax = temperaturaMax;
    }

    public int getTemperaturaMin() {
        return this.temperaturaMin;
    }

    public void setTemperaturaMin(int temperaturaMin) {
        this.temperaturaMin = temperaturaMin;
    }

    public String getNombre() {
        return this.Nombre;
    }

    public void setNombre(String Nombre) {
        this.Nombre = Nombre;
    }

    public double mediaMensual(){
       double suma = this.temperaturaMax + this.temperaturaMin;
       double resultado = suma /2;
       return resultado;
    }

    @Override
    public String toString(){
        return this.Nombre + " max " + this.temperaturaMax + " min " + this.temperaturaMin + " media " + this.mediaMensual();
    }

    
}
