/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicando5;

/**
 *
 * @author Jorge
 */
public class metodos {
    
    private int num1;
    private int numero = 0;
    private int cantidad;
    
    public metodos (int num1){
        //this.num1 = num1;
        this.setNum1(num1);
    }
    
    
    public int impre ()
    {
        return this.getNum1();
    }
    
    public int sumar(int num)
    {
        cantidad = this.getNum1()+num;
        return cantidad;
    }
    
    @Override
    public String toString() {
        return "Hola " + impre();
    }

    /**
     * @return the num1
     */
    public int getNum1() {
        return num1;
    }

    /**
     * @param num1 the num1 to set
     */
    public void setNum1(int num1) {
        this.num1 = num1;
    }
}
