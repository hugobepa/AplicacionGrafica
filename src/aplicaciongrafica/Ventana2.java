/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aplicaciongrafica;

/**
 *
 * @author hugo
 */
//importar trabajar JFrame
import javax.swing.*;
//importar basica para trabajar con layouts
import java.awt.BorderLayout;//bordes
import java.awt.GridLayout;//tablas
import java.awt.FlowLayout;//fluidos

public class Ventana2 extends JFrame{
    //crear paneles
    private JPanel panel1;
    private JPanel panel2;
    
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9;
    //contrucctor pantalla
    public Ventana2()
    {   //para definir orientacion layouts
        this.setLayout( new BorderLayout());
        //InicilizarPanales
        panel1= new JPanel();
        panel2= new JPanel();
        //layoutde tabla Filas, columnas y espacios entre ellos( espacio filas, espacioColumnas
        panel2.setLayout(new GridLayout(3,3,5,10));
        //añadir a la interface
        this.add(panel1);
        this.add(panel2);
        
        
        //instaciar botones
        b1= new JButton("Prueba");
        b2= new JButton("Prueba");
        b3= new JButton("Prueba");
        b4= new JButton("Prueba");
        b5= new JButton("Prueba");
        b6= new JButton("Prueba");
        b7= new JButton("Prueba");
        b8= new JButton("Prueba");
        b9= new JButton("Prueba");
        
        //La orientacion añadir layouts a JFrame
        this.add(panel1,BorderLayout.NORTH);
        this.add(panel2,BorderLayout.SOUTH);
        //añadir botones a las capas
        panel2.add(b1);
        panel2.add(b2);
        panel2.add(b3);
       
        
        panel2.add(b5);
        panel2.add(b6);
        panel2.add(b7);
        panel1.add(b8);
        panel1.add(b9);
        
    }
}
