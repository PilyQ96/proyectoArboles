/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estructura;

/**
 *
 * @author Usuario
 */
import interfaz.Comparador;
import ListaEncadenada.Nodo;
import proyecto2.Cliente;

// HEREDA metodos getRaiz, esVacio, preorden, entreorden, postorden, pertenece, 
// desengancharNodo, eliminarDosSubArbol, eliminarHoja y eliminarUnSubArbol
// REDEFINE metodo borrar
// APLICA el orden binario en sus operaciones

public class ArbolBinarioBusqueda extends ArbolBinario {

    public ArbolBinarioBusqueda() {
        super();
    }

    // Inserción en el árbol aplicando orden binario
    public void insertar(Object dato) {
        if (esVacio()) {
            raiz = new NodoA(dato, null);
        } else {
            insertarNodo(raiz, (Comparador) dato);
        }
    }
   
    // El nodo se inserta a la izq si es menor y a la der si es mayor
    private void insertarNodo(NodoA p, Comparador dato) {
        if (dato.mayorQue(p.getDato())) {
            if (p.getDcho() == null) {
                p.setDcho(new NodoA(dato, null));
            }else {
                insertarNodo(p.getDcho(), dato);
            }
        }else{
            if (p.getIzdo() == null) {
            p.setIzdo(new NodoA(dato, null));
            }else {
            insertarNodo(p.getIzdo(), dato);
            }
        }    
    }

    // Para buscar se considera el ordenamiento binario
    public NodoA buscar(Object buscado) {
        Comparador dato;
        dato = (Comparador) buscado;
        if (raiz == null) {
            return null;
        } else {
            return localizar(getRaiz(), dato);
        }
    }

    private NodoA localizar(NodoA raizSub, Comparador buscado) {
        if (raizSub == null) {
            return null;
        } else if (buscado.igualQue(raizSub.getDato())) {
            return raizSub;
        } else if (buscado.menorQue(raizSub.getDato())) {
            return localizar(raizSub.getIzdo(), buscado);
        } else {
            return localizar(raizSub.getDcho(), buscado);
        }
    }

    // Recorre el árbol de acuerdo a su orden para eliminar un nodo
    @Override
    public NodoA borrar(NodoA p, NodoA ant, Object dato, NodoA q) {
        Comparador buscado;
        buscado = (Comparador) dato;
        if (p != null) {
            if (buscado.igualQue(p.getDato())) {
                q = desengancharNodo(p, ant);
            } else {
                if (buscado.mayorIgualQue(p.getDato())) {
                    q = borrar(p.getDcho(), p, dato, q);
                } else {
                    q = borrar(p.getIzdo(), p, dato, q);
                }
            }
        }
        return q;
    }
   
}
