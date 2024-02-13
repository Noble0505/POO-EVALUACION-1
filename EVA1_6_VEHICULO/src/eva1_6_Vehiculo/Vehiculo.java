package eva1_6_Vehiculo;

public class Vehiculo {
    /*
      Marca
      Modelo
      Año
      Color
      Placas
      Valor
     */
    private String marca;
    private String modelo;
    private int año;
    private String color;
    private double precio;

    public String getMarca() {
        return marca;
    }
    public void setMarca(String valor) {
        marca = valor;
    }
    public String getModelo() {
        return modelo;
    }
    public void setModelo(String valor) {
        modelo = valor;
    }
    public int getAño() {
        return año;
    }

    public void setAño(int valor) {
        año = valor;
    }

    public String getColor() {
        return color;
    }
    public void setColor(String valor) {
        color = valor;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double valor) {
        precio = valor;
    }
}
