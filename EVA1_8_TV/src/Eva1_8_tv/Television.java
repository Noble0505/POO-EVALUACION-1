package Eva1_8_tv;

public class Television {
    private boolean estaEncendido= false;
    private int volumen;
    private int canal;
    //CONTRUCTORES
    //CONSTRUCTOR SIN ARGUMENTOS: CONSTRUCTOR DEFAULT
    //metodo para inicializar los objetos
    public Television(){
        //NO ES OBLIGATORIO
        volumen = 30;
        canal = 5;
        estaEncendido = false;
    }

    public void subirVolumen(){
        if (estaEncendido && (volumen < 100))
            volumen += 1;
            //volumen = volumen + 1
            //volumen++
    }
    public void bajarVolumen(){
        if (estaEncendido && (volumen > 0))
            volumen -= 1;
            //volumen = volumen - 1
            //volumen--

    }
    public void subirCanal(){
        if (estaEncendido && (canal < 100))
                canal += 1;

        }

    public void bajarCanal(){
        if (estaEncendido && (canal > 0))
            canal-=1;
    }
    public void cambiarCanal(int noCanal){
        if (estaEncendido && !(noCanal < 0))
        canal = noCanal;
    }
    public void power() {
    /*
    if (estaEncendido == true)

        estaEncendido = false;
    else
        estaEncendido =true;*/
        estaEncendido = !estaEncendido;
    }
    public void  imprimirConfig(){
        System.out.println("volumen: "+volumen);
        System.out.println("canal: "+canal);
        System.out.println("power: "+estaEncendido);
    }
}
