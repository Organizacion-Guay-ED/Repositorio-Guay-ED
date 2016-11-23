/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebaguay;

import java.util.Scanner;

/**
 *
 * @author sdiazr02
 */
public class PruebaGuay {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola equipo GUAY");
        System.out.println("Hola Aitor.");
        System.out.println("El repositorio guay tiene lagunas");
        System.out.println("27");
        System.out.println("Son mis años...");
        System.out.println("Hola putos");
        System.out.println("Se sienten coño!");
        
        // MIERDA DE ANDRES
        String respuesta;
        System.out.println("¿Desea ver el estado del repositorio?");
        String si = new String("si");
        String no = new String("no");
        do {
            Scanner entrada = new Scanner(System.in);
            respuesta=entrada.nextLine();
            if (respuesta==si) {
                System.out.println("seguimos trabajando en ello");
            }
        } while (respuesta!=no);
        
        System.out.println("Que te calles!");
    }
    
}
