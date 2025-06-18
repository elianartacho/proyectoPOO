import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;
import java.util.random.RandomGenerator;

import com.objetos.Mes;

public class Clima {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("introduce datos");
       

        ArrayList<Mes> meses = new ArrayList<Mes>();
        Random random = new Random();

       String[] nombresmeses = new String[] {"ENERO", "FEBRERO","MARZO", "ABRIL", "MAYO", "JUNIO", "JULIO" , "AGOSTO", "SEPTIEMBRE", "OCTUBRE", "NOVIEMBRE", "DICIEMBRE"};

       for (int i = 0; i < 12; i++) {
            Mes mes = new Mes();
           
       }


        //creamos un bucle para rellenar los 12 meses

        // for (int i = 0; i < 12; i++) {
        // Mes mes = new Mes();
        // System.out.println("Nombre mes ");
        // String nombre = teclado.nextLine();
        // System.out.println("Introduce temperatura maxima ");
        // int tempMax = Integer.parseInt(teclado.nextLine());
        // System.out.println("Introduce temperatura minima ");
        // int tempMin = Integer.parseInt(teclado.nextLine());    
        // mes.setNombre(nombre);
        // mes.setTemperaturaMax(tempMax);
        // mes.setTemperaturaMin(tempMin);
        //  meses.add(mes);
        // }
        //para que al final nos de todos los datos y calcule la media
        for(Mes m : meses){
            System.out.println(m);
        }
        
        
    }      

}
