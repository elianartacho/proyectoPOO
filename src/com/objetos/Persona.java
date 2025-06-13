package com.objetos;

public class Persona {
   //debemos declarar las variables privadas de
   //cada propiedad
   private String nombre;
   private String apellidos;
   private int edad;
   private int dni;
   

    public int getDni(){
        return this.dni;
    }
    public void setDni(int dni){
        this.dni = dni;
    }

    public char getLetra(){
         int resultado = (dni - (dni /23) * 23);
         String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKET ";
         char letra = letrasDni.charAt(resultado); 
        return letra;
    }

    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidos() {
        return this.apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public int getEdad() {
        return this.edad;
    }

    public void setEdad(int edad)throws Exception {

        //debemos controlar la edad y realizar la accion que mas nos guste
        //error silencioso el programador no sabe 
        //que ha echo mal,simplemente lo soluciono aqui
        if(edad < 0 ){
          throw new Exception("la edad no puede ser negativa");
        }else{
             this.edad = edad;
        }
       
       
    }

     public enum tipoGenero {
            FEMENINO, MASCULINO , OTROS
        }
        private tipoGenero genero;

    public tipoGenero getGenero() {
        return this.genero;
    }

    public void setGenero(tipoGenero genero) {
        this.genero = genero;
    }
    //metodo para devolver nombre y apellido
    public String getNombreCompleto(){
        return this.nombre+ " " + this.apellidos;
    }

    //metodo para devolver nombre y apellidos en mayusculas
    public String getNombreClompletoMayusculas(){
        return this.nombre.toUpperCase()
        + " " + this.apellidos.toUpperCase();
    }

    //metodo para devolver apellidos y nombre
    public String getNombreCompletoReves(){
        return this.apellidos + " " + this.nombre;
    }

    //metodo para devolver nombre y apellidos recibiendo
    //el separador que deseemos
    public String getNombreCompletoSeparador(String separador){
        return this.nombre + separador + this.apellidos;

    }



    }
    //solo puedo tener un nombre de metodo asi que solo varian los parametros en funcion de lo que quiera
    //entre los parentesis pongo el parametro a poner y dentro del metodo lo que este haga

    //por cada propiedad tendremos dos metodos get y set 
    //Get y Set solo prodiedades
    //metodos solo get 

    //el get para recuperar y son public
    // public String getNombre() {
    //     return nombre;
    // }

    //     //set para establecer un valor
    //     public void setNombre(String valor) {
    //         nombre = valor;

     //   }


