/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package txt_Extra;

import javax.swing.JOptionPane;

/**
 *
 * @author al3xmm14
 * @version 14/09/2022
 */
public class TXT_extra {
    public int x;
    public String nombre;
    public String primerApe;
    public  String segundoApe;
    
    
    public TXT_extra(String nombre, String primerApellido, String segundoApe){
        this.nombre = nombre;
        this.primerApe = primerApellido;
        this.segundoApe = segundoApe;}
    
    
    
    public static void main(String[] args) {
        
        if (args.length == 0){
            System.out.println("No mandaste nada, meteme argumentos");
        }
        else if (args.length < 3){
            System.out.println("Mandaste pocos elementos");
        }else{
            
            TXT_extra persona0 = new TXT_extra(args[0], args[1], args[2]);
            System.out.println("Nombre: " + persona0.nombre + "\n" + "Primer apellido: " +  persona0.primerApe  + "\n" + "Segundo apellido: " + persona0.segundoApe);
        }
        
    }
}
