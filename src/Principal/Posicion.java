/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Principal;
import javax.swing.JLabel;
import javax.swing.TransferHandler;
/**
 *
 * @author PDARML
 */
public class Posicion {
    
    int horizontal = 0;
    int vertical = 0;
    private final int DIMENSION = 50;
    Posicion derecha = null;
    Posicion izquierda = null;
    Posicion arriba = null;
    Posicion abajo = null;
    JLabel cuadro;
    
    public Posicion(){}
    
    public Posicion(int x, int y){
        horizontal = x;
        vertical = y;
        int a = x; a--;
        int b = y; b--;
        cuadro = new JLabel();
        cuadro.setTransferHandler(new TransferHandler("icon"));
        cuadro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/Fondo.jpg")));
        cuadro.setBounds(a*DIMENSION, b*DIMENSION, DIMENSION, DIMENSION);
    }
    
    public void Dibujar(String ruta){
        cuadro = new JLabel();
        cuadro.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Principal/" + ruta)));
        cuadro.setBounds(horizontal*DIMENSION, vertical*DIMENSION, DIMENSION, DIMENSION);
    }
}
