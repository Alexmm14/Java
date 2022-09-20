/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gui_extra;

import javax.swing.JOptionPane;

/**
 *
 * @author al3xmm14
 * @version 14/09/2022
 */


public class GUI {
    public int x;
    public String nombre;
    public String primerApe;
    public  String segundoApe;
    
    
    public GUI(String nombre, String primerApellido, String segundoApe){
        this.nombre = nombre;
        this.primerApe = primerApellido;
        this.segundoApe = segundoApe;}
    
    
    
    public static void main(String[] args) {
        
        if (args.length == 0){
            JOptionPane.showMessageDialog(null, "No mandaste nada, meteme argumentos", "Aviso", JOptionPane.INFORMATION_MESSAGE );
            
        }
        else if (args.length < 3){
            JOptionPane.showMessageDialog(null, "Mandaste pocos elementos", "Aviso", JOptionPane.INFORMATION_MESSAGE );
        }else{
            
            GUI persona0 = new GUI(args[0], args[1], args[2]);
            JOptionPane.showMessageDialog(null, "Hola mundo " + persona0.nombre + " " +  persona0.primerApe + " " + persona0.segundoApe, "Datos personas", JOptionPane.INFORMATION_MESSAGE );
        }
        
    }
}
