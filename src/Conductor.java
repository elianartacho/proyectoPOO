

import com.objetos.Coche;
import com.objetos.Deportivo;

public class Conductor {
    public static void main(String[] args) {
        
      //   Coche ch1 = new Coche();
      //   ch1.setMarca("Toyota");
      //   ch1.setModelo("Yaris");

      //   ch1.Arrancar();
      //   ch1.Acelerar();
      //   ch1.Acelerar();
      //   ch1.Acelerar();
      //   ch1.Frenar();
      //   ch1.Frenar();
      //  ch1.Frenar(true);

      //  System.out.println(ch1);

       Deportivo car = new Deportivo();
      car.setMarca("Rayo");
      car.setModelo("McQueen");
    

      car.Arrancar();
      car.Acelerar();
      car.Acelerar();
      car.Turbo();
      car.Frenar();
      car.Frenar(true);
      

      System.out.println("true");
    }

}
