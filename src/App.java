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
        System.out.println("Salario minimo de  Empleado " + emp.getSalarioMinimo());


        Director dr = new Director();
        System.out.println("Salario minimo de Director " + dr.getSalarioMinimo());


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
      
   
    }
  }
