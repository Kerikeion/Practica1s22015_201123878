/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import javax.swing.JLabel;
/**
 *
 * @author PDARML
 */
public class ListaCP {
    
    Nodo primero = null;
    Nodo ultimo = null;
    String modalidad = "" ;
    int correlativo = 0;
    String resumen = "";
    int suelo = 0;
    int hongo = 0;
    int goomba = 0;
    int pared = 0;
    int ficha = 0;
    int koopa = 0;
    
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
        suelo = 0;
        hongo = 0;
        goomba = 0;
        pared = 0;
        ficha = 0;
        koopa = 0;
        while(aux != null){
            if(aux.texto.equals("Suelo.jpg")){
                suelo ++;
            }
            else if(aux.texto.equals("Goomba.jpg")){
                goomba ++;
            }
            else if(aux.texto.equals("Ficha.jpg")){
                ficha ++;
            }
            else if(aux.texto.equals("Hongo.jpg")){
                hongo ++;
            }
            else if(aux.texto.equals("Mario.jpg")){
                resumen = resumen + "Mario: 1  \n";
            }
            else if(aux.texto.equals("Pared.jpg")){
                pared ++;
            }
            else if(aux.texto.equals("Koopa.jpg")){
                koopa ++;
            }
            else{ resumen = resumen + "Castillo: 1 \n"; }
            aux = aux.siguiente;
        }
        resumen = resumen + "Suelos : " + suelo + " \n";
        resumen = resumen + "Goombas: " + goomba + " \n";
        resumen = resumen + "Fichas: " + ficha + " \n";
        resumen = resumen + "Hongos: " + hongo + " \n";
        resumen = resumen + "Paredes: " + pared + " \n";
        resumen = resumen + "Koopas: " + koopa + " \n";
    }
    
    public Nodo siguienteCasilla(){
        if(modalidad.equals("pila")){
            Nodo auxiliar = ultimo;
            ultimo = ultimo.siguiente;
            return auxiliar;
        }
        else{
            Nodo auxiliar = primero;
            primero = primero.anterior;
            return auxiliar;
        }
    }
    
    public void resetear(){
        primero = null;
        ultimo = null;
        modalidad = "" ;
        correlativo = 0;
    }
}
