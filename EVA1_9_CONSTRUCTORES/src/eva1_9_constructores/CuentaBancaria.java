package eva1_9_constructores;

public class CuentaBancaria {
          private int noCuenta;
          private double saldo;
          private String cliente;

          //CONSTRUCTOR
    public CuentaBancaria(){
        noCuenta = 0;
        cliente = "SIN CLIENTE";
        saldo = 1000000;

    }
          //get y set
    public int getNoCuenta() {
        return noCuenta;
    }

    public void setNoCuenta(int cuenta) {
        noCuenta = cuenta;
    }

    public String getCliente() {
        return cliente;
    }

    public void setCliente(String nomcliente) {
        cliente = nomcliente;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double dinero) {
        saldo = dinero;
    }

    public void retirar (double monto){
        if (saldo >= monto)//hay que tener dinero
            saldo = saldo - monto;
    }
    public void depositar(double deposito){
        saldo = saldo + deposito;
    }
}
