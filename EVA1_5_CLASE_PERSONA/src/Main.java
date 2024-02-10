public class Main {
    public static void main(String[] args) {
      Persona perso1 = new Persona();
      perso1.setNombre("Ballitas fraude");
        System.out.println(perso1.getNombre());
        perso1.setApellidos("Mamon Racista");
        System.out.println(perso1.getApellidos());
        perso1.setEdad(18);
        System.out.println(perso1.getEdad());

    }
}
class Persona{
    //ATRIBUTOS --> ESTADO DEL OBJETO
    //NO DEBEN SER ACCESIBLES DIRECTAMENTE
   private String nombre;
   private String apellidos;
   private int edad;

   //METODOS;}
    //PUBLICOS --SON LA INTERFAZ
    //SI SON PARA MANIPULAR LOS ATRIBUTOS HAY UN ESTANDAR EN JAVA
    //SON OPCIONALES,NO ES NECESARIO COLOCAR SET O GET
    //METODOS SET(ESCRITURA) Y GET(LECTURA)
    //LEER NOMBRE:
    public String getNombre() {
        return nombre;
    }
    //ESCRIBIR NOMBRE
    public void setNombre(String valor) {
        nombre = valor;
    }
    //APELLIDO
    public String getApellidos() {
        return apellidos;
    }
    public void setApellidos(String valor) {
        apellidos = valor;
    }
    //EDAD
    public int getEdad() {
        return edad;
    }
    public void setEdad(int valor) {
        edad = valor;
    }
}