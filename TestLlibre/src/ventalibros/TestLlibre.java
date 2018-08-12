/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ventalibros;

import java.util.Scanner;

/**
 *
 * @author Jorge
 */
public class TestLlibre {

    private static final Scanner teclado = new Scanner(System.in);

    public static void main(String[] args) {
        Llibre llistaLlibres[] = new Llibre[5];
        Autor llistaAutor[] = new Autor[5];
        String busqueda;
        
        int i;
        int j;
        int k;
        int cantidad = 0;
        String autorEncontrado;
        String resultadoBusqueda = "";

        llistaAutor[0] = new Autor("Matt", "email1@gmail.com", 'M');
        llistaAutor[1] = new Autor("Scott", "email2@gmail.com", 'F');
        llistaAutor[2] = new Autor("Clara", "email3@gmail.com", 'F');
        llistaAutor[3] = new Autor("Jason", "email4@gmail.com", 'M');
        llistaAutor[4] = new Autor("Morgan", "email5@gmail.com", 'M');
        
        llistaLlibres[0] = new Llibre("Apocalipsis", llistaAutor[0].getNom(), 50, 12);
        llistaLlibres[1] = new Llibre("Manhattan", llistaAutor[1].getNom(), 35, 5);
        llistaLlibres[2] = new Llibre("Terminator", llistaAutor[2].getNom(), 28, 10);
        llistaLlibres[3] = new Llibre("Matrix", llistaAutor[3].getNom(), 40, 7);
        llistaLlibres[4] = new Llibre("Big", llistaAutor[4].getNom(), 20, 30);

        System.out.println("Introduce tu búsqueda: ");
        busqueda = teclado.next();

        for (i = 0; i < llistaAutor.length; i++) {

            autorEncontrado = llistaAutor[i].getNom();
            if(busqueda.equals(autorEncontrado)){
                System.out.println("Encontrado!");
                resultadoBusqueda = autorEncontrado;
            }
        }
        
        for (j = 0; j < llistaLlibres.length; j++) {

            autorEncontrado = llistaLlibres[j].getAutor();
            if(resultadoBusqueda.equals(autorEncontrado)){
                System.out.println("-Título:  " + llistaLlibres[j].getNom());
                System.out.println("-Autor:  " + llistaLlibres[j].getAutor());
                System.out.println("-Precio:  " + llistaLlibres[j].getPreu());
                System.out.println("-Cantidad:  " + llistaLlibres[j].getQuantitat());
            }
        }
        
        for (k = 0; k < llistaLlibres.length; k++) {            
            cantidad += llistaLlibres[k].getQuantitat();
        }
        System.out.println("Resultado: " + cantidad);
        
    }
}
