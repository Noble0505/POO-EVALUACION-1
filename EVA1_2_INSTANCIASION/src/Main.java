public class Main {
    public static void main(String[] args) {
        int valor = 100;
        //INSTANCIACION: crear el objeto --> darle memoria
        //CLASE, IDENTIFIFCADOR = new constructor ();
        //constructor --> Metodo con el mismo nombre de la clase.
        Persona perso1 = new Persona();//instanciacion
        System.out.println(perso1);
        //perso1 --> referencia --> direccion en memoria
        Vehiculo lamamalona = new Vehiculo();
        System.out.println(lamamalona);
        lamamalona.marca = "Ford";
        lamamalona.modelo = "Mustang";
        lamamalona.año = 1965;
        System.out.println("Marca: " + lamamalona.marca);
        System.out.println("Modelo: " + lamamalona.modelo);
        System.out.println("Año: " + lamamalona.año);
        }
}
class Persona{

}
class Vehiculo{
    //ATRIBUTOS
    String marca;
    int año;
    String modelo;
}