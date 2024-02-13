package eva1_6_Vehiculo;
public class Main {
    public static void main(String[] args) {
     Vehiculo carro = new Vehiculo();
     carro.setMarca("Ford");
     carro.setModelo("f150");
     carro.setAño(2024);
     carro.setColor("rojo");
     carro.setPrecio(500000);
        System.out.println("Marca: " +carro.getMarca());
        System.out.println("Modelo: " +carro.getModelo());
        System.out.println("Año: " +carro.getAño());
        System.out.println("Color: " +carro.getColor());
        System.out.println("Precio: " +carro.getPrecio());
    }

}