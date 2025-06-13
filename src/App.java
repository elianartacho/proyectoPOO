import com.objetos.Persona;

public class App {
    public static void main(String[] args) {
        //trabajar con dichas clases
      //Instanciamos el objeto persona

      try {
        Persona personaje = new Persona();
      //ya podemos usar a la persona que es mi objeto
        personaje.setNombre("Jon");
        System.out.println(personaje.getNombre());

        personaje.setApellidos("Nieve");
        System.out.println(personaje.getApellidos());

        personaje.setEdad(29);
        System.out.println(personaje.getEdad());

        personaje.setDni(2277299);
        System.out.println(personaje.getDni());

        personaje.getLetra();
        System.out.println(personaje.getLetra());

        personaje.setGenero(Persona.tipoGenero.MASCULINO );
        System.out.println(personaje.getGenero());

        System.out.println(personaje.getNombreCompleto());

       
        System.out.println(personaje.getNombreClompletoMayusculas());
        System.out.println(personaje.getNombreCompletoReves());
        System.out.println(personaje.getNombreCompletoSeparador(","));

      } catch (Exception e) {
        // nunca dejaremos  un catch vacio
        System.out.println("Error " + e.getMessage());
      }
      
   
    }
}
