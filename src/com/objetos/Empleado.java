package com.objetos;

public class Empleado extends Persona{

    private int sueldo;
    private int salarioMinimo;

    public int getSalarioMinimo() {
        return this.salarioMinimo;
    }

    public void setSalarioMinimo(int salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }
   
    protected Empleado(){
        super();
        System.out.println("Constructor vacio empleado");
        this.salarioMinimo = 1600;
    }

    

    public int getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }
    
    // public Empleado(String nombre, String apellidos){
    //     super(nombre,apellidos);
    //     System.out.println("Constructor nombre y apellidos Empleado ");
       
    // }
    
}
