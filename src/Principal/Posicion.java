/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author PDARML
 */
public class Posicion {
    
    int horizontal = 0;
    int vertical = 0;
    Posicion derecha = null;
    Posicion izquierda = null;
    Posicion arriba = null;
    Posicion abajo = null;
    
    public Posicion(){}
    
    public Posicion(int x, int y){
        horizontal = x;
        vertical = y;
    }
}
