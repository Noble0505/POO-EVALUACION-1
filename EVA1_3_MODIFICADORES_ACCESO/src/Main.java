import otro_paquete.PruebaB;
import otro_paquete.la_otra_parte;

public class Main {
    public int x;
    protected int y;
    private int z;
    int w;

    public static void main(String[] args) {
       PruebaA objA = new PruebaA();
       //objA. --> puedo ver x(public)
        //puedo ver a y (protected)
        //puedo ver a w (default)
        la_otra_parte otroObj = new la_otra_parte();
        //otroObj.x --> se ve x porque es public
        //los demas no son visibles
        //Esta clase no es visible en este paquete:
        //PruebaB objB = new PruebaB();
    }
}
//CLASE CON ACCESO DEFAULT
class PruebaA{
    public int x;
    protected int y;
    private int z;
    int w;
}