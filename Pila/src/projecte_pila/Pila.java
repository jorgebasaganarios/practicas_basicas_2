package projecte_pila;

import java.util.*;

public class Pila {

    // Creamos la pila    
    Stack pila = new Stack();

    // Se agregan varios números a la pila
    public void intro() {
        for (int x = 1; x <= 3; x++) {
            pila.push(Integer.toString(x));
        }
    }

    // Vaciamos la pila
    public void eliminar() {
        while (this.empty() == 1) {
            System.out.println("Vaciamos la pila: " + pila.pop());
        }
        System.out.println("La pila esta vacía.");
    }

    // Mostrar el primer elemento que se agregó a la pila
    public void mostrarPrimero() {
        System.out.println("El primer elemento agregado es: " + pila.firstElement().toString());
    }

    // Mostrar el último elemento que se agregó a la pila
    public void mostrarUltimo() {
        System.out.println("El último elemento agregado es: " + pila.lastElement().toString());
    }

    // Mostrar el número de elementos que hay en la pila
    public void mostrarCant() {
        System.out.println("La cantidad de elementos es: " + pila.size());
    }

    // Si la pila está vacía devuelve 0.
    public int empty() {
        int valid = 1;
        if (!pila.empty()) {
            valid = 1;
        } else if (pila.empty()) {
            valid = 0;
        }
        return valid;
    }
}
