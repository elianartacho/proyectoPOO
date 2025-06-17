package com.objetos;

public class Director extends Empleado {
    //este sobrescribe es decir sustituye a lo que ya exixte
    @Override
    public int getDiasVacaciones(){
    //debe,os llamar a la clase Super de empleado para recuperar el 22
    int vacas =super.getDiasVacaciones();
    System.out.println("Vacaciones director ");
     return vacas + 8 ;

    }
    public void mandar(){
        System.out.println("obedeced todos ,subditos!!!");
    }

    //IMPLEMENTTA crea algo nuevo
    public int getDiasVacaciones(int diasExtra){
        return  30 + diasExtra;
    }
       
    
    public Director (){
        int salarioMinimo = super.getSalarioMinimo();
        //debemos indicar el salario minimo
       this.setSalarioMinimo(salarioMinimo + 200);
    }

}
