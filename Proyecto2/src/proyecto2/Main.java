/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyecto2;

import EntradaSalida.Consola;
import ListaEncadenada.*;
import estructura.*;
import interfaz.Comparador;

/**
 *
 * @author Usuario
 */
public class Main {

    ArbolBinarioBusqueda ABB;
    Lista L;
    
    public Main() {
        ABB = new ArbolBinarioBusqueda();
        L = new Lista();
    }
    

    public void mostrarOpciones() {
        System.out.println("MENU DE OPCIONES");
        System.out.println("1-Cargar cliente");
        System.out.println("2-Actualizar saldo");
        System.out.println("3-Mostrar cliente");
        System.out.println("0-salir");
    }    
    
    public void menu() {
        int op = 9;
        do {
            switch (op) {
                case 1:
                    //cargar();
                    break;
                case 2:
                    //eliminarLibros();
                    break;
                case 3:
                    //mostrar1();
                    break;
            }
            mostrarOpciones();
            System.out.println("Ingrese una opcion");
            System.out.println("--->");
            op = Consola.leerInt();
        } while (op != 0);
    }

    
    public static void main(String[] args) {
        Main app = new Main();
        app.menu();     
    }
    
}
