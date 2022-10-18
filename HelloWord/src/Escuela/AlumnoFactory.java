/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Escuela;

import javax.swing.JOptionPane;

/**
 *
 * @author al3xmm14
 */
public class AlumnoFactory {
    public static void main(String[] args) {
       //Alumno a0 = new Alumno(args[0], args[1], args[2], args[3]);
       Alumno a0= new Alumno("666", "Alejandro Molina", "14/02/2002", 20);
        Alumno a2 = new  Alumno();
        
        //System.out.println(" Numero de cuenta: " + a1.numeCuenta + "\n" + "Nombre: " + a1.nombre + "\n" + "Fecha nacimiento: " + a1.fecha + "\n" + "edad: " + a1.edad);
        //JOptionPane.showMessageDialog(null, " Numero de cuenta: " + a0.getNumeCuenta() + "\n" + "Nombre: " + a0.getNombre() + "\n" + "Fecha nacimiento: " + a0.getFecha() + "\n" + "edad: " + a0.getEdad(), "Valores alumno 1", JOptionPane.INFORMATION_MESSAGE);
        
       // JOptionPane.showMessageDialog(null, " Numero de cuenta: " + a2.numeCuenta + "\n" + "Nombre: " + a2.nombre + "\n" + "Fecha nacimiento: " + a2.fecha + "\n" + "edad: " + a2.edad, "Valores alumno 2", JOptionPane.INFORMATION_MESSAGE);
        
     
       System.out.println( a0.toString());
       System.out.println( a2.toString());
               }
    public void alcanzarNunca(){}
    
    public static void alcanzarSiempre(){}
    
}
