/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package txt;

/**
 * @author al3xmm14
 * @version 23/08/2022
 *
 */
public class HellowordTxt {
    public static void main(String args[]) {
        if (args.length == 0){
            System.out.println("No mandaste nada, meteme argumentos");
        }
        else if (args.length < 3){
            System.out.println("Mandaste pocos elementos");
        }
        else{
            System.out.println("Hello word " + args[0] + " " + args[1]+ " " + args[2]);
        }
    }
}