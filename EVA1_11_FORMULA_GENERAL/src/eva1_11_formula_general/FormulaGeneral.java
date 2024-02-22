package eva1_11_formula_general;

public class FormulaGeneral {
    private  int a;
    private  int b;
    private int c;
    public FormulaGeneral() {
        a = 6;
        b = 8;
        c = 2;
    }

    public int getA() {
        return a;
    }

    public void setA(int valor) {
        a = valor;
    }

    public int getB() {
        return b;
    }

    public void setB(int valor) {
        b = valor;
    }

    public int getC() {
        return c;
    }

    public void setC(int valor) {
        c = valor;
    }
    private double calcularx1(){
        double x1;
        x1 = (-b -(Math.sqrt(Math.pow(b,2)- (4*a*c) )) ) / 2*a ;
        return x1;
    }
   public void imprimirDatos(){
       System.out.println("El valor de x1 despues de calcular la formula general es: " +calcularx1());
   }
}
