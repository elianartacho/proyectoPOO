package com.objetos;

public class Empleado extends Persona{

    //Este metodo corta la sobreescritura(final es el comando que lo corta)
    public final void metodoFinal(){
        System.out.println("soy un metodo final ");
    }

    //creamos un metodo para mostrar las vacaciones
    public int getDiasVacaciones(){
        System.out.println("Vacaciones de empleado ");
        return 22;
    }
   
    private int sueldo;
    private int salarioMinimo;

    public int getSalarioMinimo() {
        return this.salarioMinimo;
    }

    public void setSalarioMinimo(int salarioMinimo) {
        this.salarioMinimo = salarioMinimo;
    }
   
    public Empleado(){
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

    @Override
    public String toString(){
        return this.getNombreCompleto() + "Salario minimo " + this.getSalarioMinimo();
    }
    
    // public Empleado(String nombre, String apellidos){
    //     super(nombre,apellidos);
    //     System.out.println("Constructor nombre y apellidos Empleado ");
       
    // }
    
}
