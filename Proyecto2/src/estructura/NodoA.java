/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura;

import ListaEncadenada.Nodo;
/**
 *
 * @author Usuario
 */
public class NodoA {
    private Object dato;
    private Nodo referencia;
    private NodoA izdo;
    private NodoA dcho;

    public NodoA(Object valor, Nodo ref) {
        dato = valor;
        referencia = ref;
        izdo = dcho = null;
    }

    public NodoA(NodoA ramaIzdo, Object valor, NodoA ramaDcho) {
        dato = valor;
        izdo = ramaIzdo;
        dcho = ramaDcho;
    }
    //  operaciones de acceso

    public Nodo getReferencia() {
        return referencia;
    }

    public void setReferencia(Nodo referencia) {
        this.referencia = referencia;
    }

    public Object getDato() {
        return dato;
    }

    public NodoA getIzdo() {
        return izdo;
    }

    public NodoA getDcho() {
        return dcho;
    }

    public void setDato(Object d) {
        dato = d;
    }

    public void setIzdo(NodoA n) {
        izdo = n;
    }

    public void setDcho(NodoA n) {
        dcho = n;
    }

    public void imprimirDato() {
        System.out.print(dato.toString() + "\n\n");
    }
}