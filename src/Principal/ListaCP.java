/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author PDARML
 */
public class ListaCP {
    
    Nodo primero = null;
    Nodo ultimo = null;
    String modalidad = "" ;
    int correlativo = 0;
    
    public ListaCP(){
    
    }
    
    public void Agregar(Nodo nuevo){
        correlativo ++;
        nuevo.numero = correlativo;
        if(primero == null){
            ultimo = nuevo;
            primero = nuevo;
        }
        else{
            nuevo.siguiente = ultimo;
            ultimo.anterior = nuevo;
            ultimo = nuevo;
        }
    }
    
    public void modoPila(){
        modalidad = "pila";
    }
    
    public void modoCola(){
        modalidad = "cola";
    }
    
    public void recorrer(){
        Nodo aux = ultimo;
        while(aux != null){
            System.out.println("Posicion 1: " + aux.texto);
            if(aux.numero == 1){
                primero = aux;
            }
            aux = aux.siguiente;
        }
        Nodo aux2 = primero;
        while(aux2 != null){
            System.out.println("Posicion 1: " + aux2.texto);
            aux2 = aux2.anterior;
        }
    }
    
    public void resetear(){
        primero = null;
        ultimo = null;
        modalidad = "" ;
        correlativo = 0;
    }
}
