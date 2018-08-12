package projecte_pila;

public class Principal {

    public static void main(String args[]) {
        Pila objPila = new Pila();

        objPila.intro();

        objPila.mostrarPrimero();
        objPila.mostrarUltimo();
        objPila.mostrarCant();

        objPila.eliminar();
    }
}
