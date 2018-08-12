/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package practicando2;
/**
 *
 * @author Jorge
 */
public class Persona {
    
    private String nombre = "";
    private int edad = 0;
    private String DNI;
    private String sexo = "";
    private double peso = 0;
    private int altura = 0;

    public Persona(String nombre, int edad, String DNI, String sexo, double peso, int altura){
        this.nombre = nombre;
        this.edad = edad;
        this.DNI = DNI;
        this.sexo = sexo;
        this.peso = peso;
        this.altura = altura;
    }
    public double getPeso(){
        return peso;
    }
    public void setPeso(double peso){
        this.peso = peso;
    }
    
    public double calcularIMC(){
        //Calculamos el peso de la persona
        double pesoActual = peso / (Math.pow(altura, 2));
        //Segun el peso, devuelve un codigo
        return pesoActual;
    }  
    
    public boolean esMayorDeEdad(){
        boolean mayor = false;
        if(edad>=18){
            mayor = true;
        }
        return mayor;
    }
    
    @Override
    public String toString(){
        return "Persona: " + calcularIMC() + " / " + esMayorDeEdad();
    }    
}
