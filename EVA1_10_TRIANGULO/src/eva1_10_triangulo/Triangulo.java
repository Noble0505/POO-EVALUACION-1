package eva1_10_triangulo;

public class Triangulo {
    private double base;
    private  double altura;

    public Triangulo(){
        base = -1;
        altura = -1;
    }

    public double getBase() {
        return base;
    }

    public void setBase(double valor) {
        base = valor;
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double valor) {
        this.altura = valor;
    }
    private double calcularArea(){
        return (base * altura) / 2;
    }
    private double calcularPermietro(){
        double peri;
        //suma de los tres lados. falta el lado mayor (hipotenusa
        //peri = ??????????
        peri = base + altura + (Math.sqrt(Math.pow(base,2)+Math.pow(altura,2)));
        return peri;
    }
    public void imprimirDatos(){
        System.out.println("Base: " +base);
        System.out.println("Altura: "+altura);
        System.out.println("El area del triangulo es: " +calcularArea());
        System.out.println("El preimetro del triangulo es: "+calcularPermietro());
    }
}
