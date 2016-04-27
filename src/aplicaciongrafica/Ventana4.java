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
import java.awt.event.ActionEvent;
import javax.swing.*;
import java.awt.event.ActionListener;

public class Ventana4 extends JFrame implements ActionListener{
    
    //declaramos elementos
    JPanel panel;
    JButton boton, boton1;
    JLabel texto;
    JTextField input;
    
    public Ventana4()
    {
        //inicializar elementos
        panel =new JPanel();
        boton = new JButton("pulsar");
        boton1 = new JButton("apretar");
        texto = new JLabel();
        input =  new JTextField("Escribe algo");
        
        //añadimos panel a JFrame
         this.add(panel);
        // añadir a panel
        panel.add(boton);
        panel.add(boton1);
        panel.add(texto);
        panel.add(input);
    
        //Jlabel cambiar texto
        
        
        
        //Para cerar aplicacion auromaticamnete
        this.setDefaultCloseOperation(this.EXIT_ON_CLOSE);
        //lamar Actividades
        this.boton.addActionListener(this);
        this.boton1.addActionListener(this);
        
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        
        
        if(e.getSource().equals(boton)){
        this.texto.setText(this.input.getText());
        }
        if(e.getSource().equals(boton1)){
        this.texto.setText("has oorimido el 2");
        }
         //To change body of generated methods, choose Tools | Templates.
    }
    
}
