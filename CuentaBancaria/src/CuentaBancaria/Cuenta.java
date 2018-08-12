package CuentaBancaria;

public class Cuenta {
 
    //Atributos
    private String numeroCompte;
    private double saldo;
 
    //Constructores
    public Cuenta(String numeroCompte) {
        this(numeroCompte, 0); //Sobrecarga
    }
 
    public Cuenta(String numeroCompte, double saldo) {
        this.numeroCompte = numeroCompte;
        this.saldo = saldo;
        //Si la cantidad es menor que cero, lo ponemos a cero
        if (saldo < 0) {
            this.saldo = 0;
        } else {
            this.saldo = saldo;
        }
    }
    //Metodos
    public String getNumeroCompte() {
        return numeroCompte;
    }
 
    public void setNumeroCompte(String numeroCompte) {
        this.numeroCompte = numeroCompte;
    }
 
    public double getSaldo() {
        return saldo;
    }
 
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
    /**
     * Ingresa dinero en la cuenta.    
     */
    public void ingresar(double saldo) {
        if(saldo > 0){
            this.saldo = this.saldo + saldo;   
        }
    }
    /**
     * Retira una cantidad en la cuenta.
     */
    public void retirar(double saldo) {
        if ((this.saldo - saldo) < 0) {
            this.saldo = 0;
        } else {
            this.saldo = this.saldo - saldo;
        }
    }
 
    @Override
    public String toString() {
        return "Cuenta número: " + numeroCompte + " tiene " + saldo + " euros en la cuenta";
    }
}