package CuentaBancaria;

public class CuentaApp {
 
    public static void main(String[] args) {
         
        Cuenta cuenta_1 = new Cuenta("456789654321", 3000);
         
        //Ingresa o retira dinero en las cuentas
        cuenta_1.ingresar(300);
        System.out.println(cuenta_1);
        cuenta_1.ingresar(150);
        System.out.println(cuenta_1);
        
        cuenta_1.retirar(500);
        System.out.println(cuenta_1);
        
        cuenta_1.ingresar(3200);
        System.out.println(cuenta_1);
        
        cuenta_1.retirar(100);
        System.out.println(cuenta_1);         
    }     
}
