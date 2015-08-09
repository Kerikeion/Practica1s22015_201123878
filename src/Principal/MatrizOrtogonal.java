/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;

/**
 *
 * @author PDARML
 */
public class MatrizOrtogonal {
    
    Posicion inicio;
    Posicion recorredor;
    int columnas = 0;
    int filas = 0;
    
    public MatrizOrtogonal(){
        inicio = new Posicion(0,0);
    }
    
    public void nuevaCol(){
        Posicion aux = inicio;
        int y = 1;
        columnas ++;
        while(aux.derecha != null){
            aux = aux.derecha;
            y ++;
        }
        Posicion Columna = new Posicion(y,0);
        aux.derecha = Columna;
        Columna.izquierda = aux;
    }
    
    public void nuevaFila(){
        Posicion aux = inicio;
        int x = 1;
        filas ++;
        while(aux.abajo != null){
            aux = aux.abajo;
            x ++;
        }
        Posicion Fila = new Posicion(0,x);
        aux.abajo = Fila;
        Fila.arriba = aux;
    }
    
    public Posicion Localizar(int x, int y){
        Posicion temporal = inicio;
        int i = 1;
        int j = 1;
        if(x == 0){
            recorredor = temporal.abajo;
        }
        else if(y == 0){
            recorredor = temporal.derecha;
        }
        else{
            recorredor = temporal.derecha.abajo;
        }
        while (i < x) {
            recorredor = recorredor.derecha;
            i++;
        }
        while (j < y) {
            recorredor = recorredor.abajo;
            j++;
        }
        return recorredor;
    }
    
    public void Agregar(int x, int y, Posicion nueva){
        if(x == 1 && y ==1){
            Posicion auxiliar1 = inicio.derecha;
            Posicion auxiliar2 = inicio.abajo;
            auxiliar2.derecha = nueva;
            auxiliar1.abajo = nueva;
            nueva.izquierda = auxiliar2;
            nueva.arriba = auxiliar1;
        }
        else{
            x--;
            Posicion anterior = Localizar(x,y);
            System.out.println(anterior.horizontal + "," + anterior.vertical);
            Posicion sobre = anterior.arriba.derecha;
            anterior.derecha = nueva;
            sobre.abajo = nueva;
            nueva.izquierda = anterior;
            nueva.arriba = sobre;
        }
    }

    public void EliminarCol(){
        recorredor = inicio;
        while (recorredor.derecha != null){
            recorredor = recorredor.derecha;
        }
        recorredor = recorredor.izquierda;
        while(recorredor != null){
            recorredor.derecha = null;
            recorredor = recorredor.abajo;
        }
        columnas --;
    }
    
    public void EliminarFilas(){
        recorredor = inicio;
        while (recorredor.abajo != null){
            recorredor = recorredor.abajo;
        }
        recorredor = recorredor.arriba;
        while(recorredor != null){
            recorredor.abajo = null;
            recorredor = recorredor.derecha;
        }
        filas --;
    }
    
    public void imprimirse(){
        Posicion auxiliar = inicio;
        Posicion auxiliar2 = inicio;
        int i = 0;
        while (auxiliar2 != null) {
            System.out.println("Fila: " + i); 
            while (auxiliar != null) {
                System.out.print(" (" + auxiliar.horizontal + "," + auxiliar.vertical + ")  ,");
                auxiliar = auxiliar.derecha;
            }
            System.out.print("\n");
            auxiliar2 = auxiliar2.abajo;
            auxiliar = auxiliar2;
            i ++;
        }
    }
}
