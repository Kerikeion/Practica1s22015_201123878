/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author PDARML
 */
public class Nodo {
    
    Nodo siguiente = null;
    Nodo anterior = null;
    String texto = "";
    int numero = 0;
    String entrada = "";
    
    public Nodo(String entrada){
        this.entrada = entrada;
    }
    
}
