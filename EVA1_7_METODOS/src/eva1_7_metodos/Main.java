package eva1_7_metodos;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

     Persona perso = new Persona();
     perso.setNombre("Pedro");
     perso.setApellido("Picapiedra");
     perso.setEdad(58);
        System.out.println("El nombre es: " +perso.generarNombreCom());
        System.out.println("Nacio en el año: " +perso.calcularAñoNac());
        //------
        Persona[] grupo = new Persona[5];
        //HAY QUE CREAR CADA OBJETO
        for (int i = 0; i < grupo.length; i++){
            Scanner input = new Scanner(System.in);
            grupo[i] = new Persona();
            //UNA VEZ CREADO EL OBJETO HAY QUE LLAMARLOS
            System.out.println("Introduce el nombre: ");
            String nombre = input.nextLine();
            grupo[i].setNombre(nombre);

            System.out.println("Introduce el apellido: ");
            String apellido = input.nextLine();
            grupo[i].setApellido(apellido);

            System.out.println("Introduce la edad: ");
            int edad = input.nextInt();
            grupo[i].setEdad(edad);
        }
        //Leer
        for (int i = 0; i < grupo.length; i++){
            System.out.println("El nombre es: " +grupo[i].generarNombreCom());
            System.out.println("Nacio en el año: " +grupo[i].calcularAñoNac());
        }
    }
}