import com.objetos.Persona;

public class App {
    public static void main(String[] args) throws Exception {
        //trabajar con dichas clases
      //Instanciamos el objeto persona
      Persona personaje = new Persona();
      //ya podemos usar a la persona que es mi objeto
      personaje.setNombre("Jon");
     System.out.println(personaje.getNombre());
     
    //   personaje.apellidos = "Lopez";
    //   personaje.edad =29;
    //   System.out.println(personaje.nombre + " " + personaje.apellidos
    //    + " Edad: " + personaje.edad );
    }
}
