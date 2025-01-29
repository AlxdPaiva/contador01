/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package contador01;

/**
 *
 * @author alxdr
 */
public class Contador01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int cc = 1;
        while (cc <= 20) {
            if (cc < 20) {
                System.out.println("Contei " + cc + " vez...");
            } else {
                System.out.println("Contei " + cc + " e acabou!");
            }            
            cc++;
        }
    }
    
}
