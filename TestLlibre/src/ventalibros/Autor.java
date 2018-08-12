/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventalibros;

/**
 *
 * @author Jorge
 */
public class Autor {
    private String nom;
    private String email;
    private char genere;
    private String busqueda;
    private boolean resultado;
    
    public Autor (String busqueda){
        this.busqueda = busqueda;
    }
    
    public Autor (String nom, String email, char genere){
        this.nom = nom;
        this.email = email;
        this.genere = genere;
    }
    
    public String getNom(){
        return nom;
    }
       
    public String getEmail(){
        return email;
    }
    public void setEmail(String email){
        this.email = email;
    }
    
    public char getGenere(){
        return genere;
    }
    
    public void buscarAutor(String busqueda){
        if(this.nom == busqueda){
           resultado = true;
        }else{
            resultado = false;
        }
    }
    
    @Override
    public String toString() {
        return "Este autor está en la BBDD: " + resultado;
    }
}