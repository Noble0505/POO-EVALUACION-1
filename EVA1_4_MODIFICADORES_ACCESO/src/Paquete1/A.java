package Paquete1;

import Paquete2.B;
import Paquete2.C;


public class A {
    public static void main(String[] args) {
       One obj1 =  new One();
       System.out.println(obj1);
       B objb = new B();
        System.out.println(objb);
        //Two obj2 = new Two(); --> no se puede usar
                             //--> porque no es accesible
                             //--> tiene modificador default
       C objc = new C();
        System.out.println(objc);
        //Three obj3 = new Three();


    }
}
class One{

}