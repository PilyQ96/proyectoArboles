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
public class Lista <T> {
    private Nodo list;

    public Lista() {
    }
    
    public Nodo inicio(){
        return list;
    }
    
    public boolean listaVacia(){
        return list==null;
    }
    
    public void insertarPri(T elem){
        Nodo x=new Nodo(elem);
        if (list!=null){
            x.setPs(list);
        }
        list=x;    
    }
    
    public Nodo quitar(Nodo p,Nodo ant){
        Nodo x=p;
        if (p==list){
            list=p.getPs();
        }else{
            ant.setPs(p.getPs());
        }
        return x;
    }
    
    public Nodo eliminar(T libro){
        Nodo x=null;
        Nodo p=list;
        Nodo ant=null;
        if(p==null){
            return x;
        }
        boolean b=false;
        while (p!=null && !b){
            Object elem = p.getDato();
            if(elem.equals(libro)){
                b=true;
            }else{
                ant=p;
                p=p.getPs();
            }
        }
        if (b==true){
            quitar(p,ant);
            x=p;
            System.out.println("Libro Eliminado");
        }else{
            System.out.println("Libro Inexistente");
        }
        return x;
    }
    
   public boolean buscarElem(T libro){
       Nodo p=list;
       if (p==null){
           return false;
       }
       while (p!=null){
           Object elem = p.getDato();
           if(elem.equals(libro)){
               return true;
           }else{
               p=p.getPs();
           }
       }
       return false;
   }
}

