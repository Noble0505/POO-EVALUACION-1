package eva1_7_metodos;

public class Persona {
   private int edad;
   private String apellido;
   private String nombre;

   //metodos get y set

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String valor) {
        nombre = valor;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String valor) {
        apellido = valor;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int valor) {
        edad = valor;
    }
    //reglas para el nombre de los metodos en java
    //es un verbo, empieza en minusculas
    public String generarNombreCom(){

        return nombre + " " + apellido;
    }
    //calcula año de nacimiento
    public int calcularAñoNac(){
        return 2024 - edad;
    }
}
