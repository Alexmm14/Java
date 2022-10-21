/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui;
import java.awt.Color;
import java.awt.event.WindowAdapter;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.io.File;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.plaf.metal.OceanTheme;

/**
 *
 * @author al3xmm14
 */
public class OtraVentana extends WindowAdapter {
    JFrame ov;
    JButton btn;
    
    
    public OtraVentana(){
        ov = new JFrame("Ejercicio");
        ov.setLayout(null);
        ov.setBackground(Color.yellow);
        ov.setResizable(true);
        ov.setLocationRelativeTo(null);
        ov.setSize(600, 300);
        ov.addWindowListener(this);
        ov.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        
        
        //Boton.
        btn = new JButton("push-me");
        btn.setBounds(10, 50, 100, 30);
        
        //Agregar bo
        ov.add(btn);
        
    //ImageIcons iconSalir = new ImageIcon("png"+File.separator + "003-cancelar.png");    
        
        
        
        
        
        
        
        //Debe de ser la ultima.
        ov.setVisible(true);
        
        
    }
    
    
    
    public static void main(String[] args) {
        new  OtraVentana();
        
    }
    
    @Override
     public void windowClosing(WindowEvent e){
      //System.out.println("Cerrando la ventana");
      if (JOptionPane.showConfirmDialog(null, "Deseas salir?", "Confirmacion", JOptionPane.YES_NO_OPTION) == JOptionPane.YES_OPTION){
          ov.dispose();
          System.exit(0);        }
    }
    
}





