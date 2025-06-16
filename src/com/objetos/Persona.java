package com.objetos;

public class Persona {

    
    //el constructor lleva el nombre de la clase
    public Persona(){
        //CUANDO PONGA new Persona() entra en este codigo
        super();
        System.out.println("Soy constructor vacio de  persona");
        this.setGenero(tipoGenero.FEMENINO);
    }

    // OTRO CONSTRUCTOR que recibira nombre y  apellidos
    public Persona(String nombre ,String apellidos){
        this.nombre = nombre;
        this.apellidos = apellidos;
      
        System.out.println("Contructor con nombre y apellidos Persona");
         
    }

    //1) Constructores de clase
    //2) Campos de propiedad
    //3) Getter y Setter
    //4)Metodos


   //debemos declarar las variables privadas de
   //cada propiedad
   private String nombre;
   private String apellidos;
   private int edad;
 //  private int dni;
   private String dniCompleto;

   public String getDDniCompleto(){
    return this.dniCompleto;
   }
   public void setDniCompleto(String dniCompleto)throws Exception{

     char letraDni = dniCompleto.charAt(dniCompleto.length() - 1);
        String temp = dniCompleto.substring(0, dniCompleto.length() -1);
         int numeroDni = Integer.parseInt(temp);
         int resultado = (numeroDni - (numeroDni /23) * 23);
          String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKET ";
        char letra= letrasDni.charAt(resultado);

    if (letraDni == letra) {
          this.dniCompleto = dniCompleto;

    }else{
        throw new Exception("La letra del Dni es incorrecta");
    }

      
   }


   //aqui declaramos la variable dni  y el metodo letra para recibir el numero y decirle la letra
    // public int getDni(){
    //     return this.dni;
    // }
    // public void setDni(int dni){
    //     this.dni = dni;
    // }

    // public char getLetra(int dni ){
    //      int resultado = (dni - (dni /23) * 23);
    //      String letrasDni = "TRWAGMYFPDXBNJZSQVHLCKET ";
    //      char letra = letrasDni.charAt(resultado); 
    //     return letra;
    // }

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


