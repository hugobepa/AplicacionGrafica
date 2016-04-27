/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciongrafica;

/**
 *
 * crear Nueva  JFrame
 */
public class AplicacionGrafica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        ventana v =  new ventana();
        Ventana2 v2= new Ventana2();
        Ventana4 v4= new Ventana4();
        //para ser visible
        v.setVisible(true);
        //x, y posicion inicio. Width ancho y height Alto en px
        v.setBounds(200, 200, 400, 250);
        
        //para ser visible
        v2.setVisible(true);
        //x, y posicion inicio. Width ancho y height Alto en px
        v2.setBounds(200, 200, 400, 250);
        
        //para ser visible
        v4.setVisible(true);
        //x, y posicion inicio. Width ancho y height Alto en px
        v4.setBounds(200, 200, 400, 250);
    }
    
}
