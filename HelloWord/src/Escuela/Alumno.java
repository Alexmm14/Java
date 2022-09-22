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
public class Alumno {
    private int x;
    private String numeCuenta;
    private String nombre;
    private String fecha;
    private int edad;

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public String getNumeCuenta() {
        return numeCuenta;
    }

    public void setNumeCuenta(String numeCuenta) {
        this.numeCuenta = numeCuenta;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }
    
    

    public Alumno(String numeCuenta, String nombre, String fecha, int edad) {
        this.numeCuenta = numeCuenta;
        this.nombre = nombre;
        this.fecha = fecha;
        this.edad = edad;
    }

    public Alumno() {
        x = 0;
    }
    
    
    public static void main(String[] args) {
       //Alumno a0 = new Alumno(args[0], args[1], args[2], args[3]);
       Alumno a1 = new Alumno("766", "Alejandro Molina", "14/02/2002", 20);
        //Alumno a2 = new  Alumno();
        
        System.out.println(" Numero de cuenta: " + a1.numeCuenta + "\n" + "Nombre: " + a1.nombre + "\n" + "Fecha nacimiento: " + a1.fecha + "\n" + "edad: " + a1.edad);
        //JOptionPane.showMessageDialog(null, " Numero de cuenta: " + a0.numeCuenta + "\n" + "Nombre: " + a0.nombre + "\n" + "Fecha nacimiento: " + a0.fecha + "\n" + "edad: " + a0.edad, JOptionPane.INFORMATION_MESSAGE);
        //JOptionPane.showMessageDialog(null, " Numero de cuenta: " + a2.numeCuenta + "\n" + "Nombre: " + a2.nombre + "\n" + "Fecha nacimiento: " + a2.fecha + "\n" + "edad: " + a2.edad, "Valores alumno 2", JOptionPane.INFORMATION_MESSAGE);
        
        
    }
    @Override
        public String toString(){
        return getClass().getName() + "@" + Integer.toHexString(hashCode()) + "Numero Cuenta: " + numeCuenta + "\n " + "Nombre: " + nombre + "\n " + "Fecha: " + fecha + "\n "+ "Edad: " + edad;
        /*Por lo que entendi, estamos modificando el metodo de la clase Alumno, entonces asi como podemos modificar el metodo
        Podemos usar sus atributos sin haber instaciado un objeto.
        
        
        
        */
}

    
}



