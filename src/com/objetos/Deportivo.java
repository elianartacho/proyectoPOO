package com.objetos;

public class Deportivo extends Coche {
    public int Turbo(){
        int Velocidad = super.getVelocidad();
        this.setVelocidad( + 40);
        return Velocidad;
    }

    public int AcelerarMucho(){
        
    }


}
