package com.objetos;
 


public class Deportivo extends Coche {

    public Deportivo(){
        this.setVelocidadMaxima(320);
    }

    public int Turbo(){
        int Velocidad = super.getVelocidad();
        this.setVelocidad (getVelocidad()+ 40);
        if(this.getVelocidad()> this.getVelocidadMaxima()){
            this.setVelocidadMaxima(this.getVelocidadMaxima());
        }
        return Velocidad;
    }


    //necesitamos modificar el metodo de acelerar 
    @Override
    public int Acelerar(){
        if(this.getVelocidad() == 0){
            System.out.println("El coche esta parado");
            return 0 ;

        }else{
            int velocidadActual = this.getVelocidad();
            this.setVelocidad( velocidadActual + 50);
            if(this.getVelocidad() > this.getVelocidadMaxima()){
                this.setVelocidad(getVelocidadMaxima());
            }
            return this.getVelocidad();
            
            
        }
       
        
    }

}

