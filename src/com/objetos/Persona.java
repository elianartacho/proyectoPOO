package com.objetos;

public class Persona {
   //debemos declarar las variables privadas de
   //cada propiedad
   private String nombre;
   private String apellidos;
   private int edad;

    //por cada propiedad tendremos dos metodos get y set 

    //el get para recuperar y son public
    public String getNombre() {
        return nombre;
    }

        //set para establecer un valor
        public void setNombre(String valor) {
            nombre = valor;

        }

}
