package com.objetos;

public class Director extends Empleado {
    protected Director (){
        int salarioMinimo = super.getSalarioMinimo();
        //debemos indicar el salario minimo
       this.setSalarioMinimo(salarioMinimo + 200);
    }

}
