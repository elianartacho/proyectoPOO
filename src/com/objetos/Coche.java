package com.objetos;

public class Coche {

    

    private String marca;
    private String modelo;
    private int velocidad;
    private int velocidadMaxima = 180;

    public String getMarca() {
        return this.marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return this.modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getVelocidad() {
        return this.velocidad;
    }

    protected void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    //protected para que otro coche pueda cambiar la velocidad si hereda de la clase coche
    protected void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

        public int Arrancar(){   
         System.out.println("Estas arrancando");
            return this.velocidad = 10;
        }
    
        public int Frenar(){
            this.velocidad -= 10;
           
            
            return this.velocidad ;

        }
        public void Frenar(boolean frenadoTotal){
            this.velocidad = 0;
            System.out.println("has pararado el coche");
            
        }

        public int Acelerar(){
            this.velocidad += 20;
            if (this.velocidad > velocidadMaxima) {
                System.out.println("Has superado la velocidad maxima frena");
            }else
            if (velocidad == 0) {
                System.out.println("Con el coche parado no puedes acelerar");
            }
            return this.velocidad;
            
        }
        @Override
        public String toString(){
            return this.marca + " " + this.modelo + " Velocidad " + this.velocidad;
        }

}
