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

    public void setVelocidad(int velocidad) {
        this.velocidad = velocidad;
    }

    public int getVelocidadMaxima() {
        return this.velocidadMaxima;
    }

    public void setVelocidadMaxima(int velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

        public int Arrancar(){   
         System.out.println("Estas arrancando");
            return this.velocidad = 10;
        }
    
        public int Frenar(){
            //se puede realizar asi pero es mejor mas simple directamente con el this
            // int fr = getVelocidad();
            // return fr - 10;
            
            return this.velocidad - 10;

        }
        public void Frenar(boolean frenadoTotal){
            if(frenadoTotal == true){
                 System.out.println("has pararado el coche");

            }else{
                Frenar();
            } 
            
        }
        public int Acelerar(){
            if ((this.velocidad + Acelerar()) > velocidadMaxima) {
                System.out.println("Has superado la velocidad maxima frena");
            }else
            if (velocidad == 0) {
                System.out.println("Con el coche parado no puedes acelerar");
            }return this.velocidad + 20;
            

        }
}
