import java.util.ArrayList;

import com.objetos.Director;
import com.objetos.Empleado;
import com.objetos.Persona;
import com.objetos.Persona.tipoGenero;

public class App {
    public static void main(String[] args) {
        //trabajar con dichas clases
      //Instanciamos el objeto persona

      try{

        Empleado emp = new Empleado();
        // System.out.println("Salario minimo de  Empleado " + emp.getSalarioMinimo());
        // System.out.println("Vacaciones empleado " + emp.getDiasVacaciones());
        emp.setNombre(" Santos ");
        emp.setApellidos(" Cerdan ");
        System.out.println(emp.toString());
       

        Director dr = new Director();
        

        // System.out.println("Salario minimo de Director " + dr.getSalarioMinimo());
        // System.out.println("Vacaciones director " + dr.getDiasVacaciones());

        // Empleado emp2 = new Empleado("eli","Martin");
       
       

      //   Persona tyrion = new Persona("Tyrion", "Lanister");
      //   System.out.println(tyrion.getNombreCompleto());

      //   Persona personaje = new Persona();
      


      // //ya podemos usar a la persona que es mi objeto
      //   personaje.setNombre("Jon");
      //   System.out.println(personaje.getNombre());

      //   personaje.setApellidos("Nieve");
      //   System.out.println(personaje.getApellidos());

      //   personaje.setEdad(29);
      //   System.out.println(personaje.getEdad());

      //   personaje.setDniCompleto("2277299T");
      //   System.out.println(personaje.getDDniCompleto());

      //   //Aqui recibimos el numero dni
      //   // personaje.setDni(2277299);
      //   // System.out.println(personaje.getDni());

      //   //Aqui devolvemos la letra que corresponde al dni
      //   // personaje.getLetra();
      //   // System.out.println(personaje.getLetra());

      //   personaje.setGenero(Persona.tipoGenero.MASCULINO );
      //   System.out.println(personaje.getGenero());

      //   System.out.println(personaje.getNombreCompleto());

       
      //   System.out.println(personaje.getNombreClompletoMayusculas());
      //   System.out.println(personaje.getNombreCompletoReves());
      //   System.out.println(personaje.getNombreCompletoSeparador(","));

      } catch (Exception e) {
        // nunca dejaremos  un catch vacio
        System.out.println("Error " + e.getMessage());
      }
       //creamos una coleccion para almecenar empleados
       ArrayList<Persona> empleados = new ArrayList<Persona>();
       Empleado emp1 = new Empleado();
       Empleado emp2 =new Empleado();

       emp1.setNombre("Empleado1");
       emp1.setApellidos("Apellidos1");
       empleados.add(emp1);
       System.out.println("emp1 "+ emp1.getClass());

       //dibujamos la clase de la coleccion 
       System.out.println("coleccion 0"+ empleados.get(0))          ;

       emp2.setNombre("Empleado2");
       emp2.setApellidos("apellidos2");
       empleados.add(emp2);

       Director dr1 = new Director();
       dr1.setNombre("Director");
       dr1.setApellidos("Apellido director");
      empleados.add(dr1);




      for(Persona emp: empleados){
        System.out.println(emp.getNombreCompleto());
      }
    }
  }
