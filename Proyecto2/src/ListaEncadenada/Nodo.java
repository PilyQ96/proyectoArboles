/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ListaEncadenada;

/**
 *
 * @author Usuario
 */
public class Nodo <T> {
    private T dato;
    private Nodo <T> ps;

    public Nodo(T dato) {
        this.dato = dato;
        this.ps = null;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

    public Nodo<T> getPs() {
        return ps;
    }

    public void setPs(Nodo<T> ps) {
        this.ps = ps;
    }
    
    
 
}
