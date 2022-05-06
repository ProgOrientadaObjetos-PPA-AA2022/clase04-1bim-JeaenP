/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

public class EjecutableDos {
    public static void main(String[] args) {
        // Se crea un objeto
        Computadora computadoraPersona1 = new Computadora(16);
        computadoraPersona1.establecerTipoProcesador("INTEL");
        Computadora computadoraPersona2 = new Computadora("INTEL");
        computadoraPersona2.establecerMemoria(16);
        Computadora computadoraPersona3 = new Computadora("AMD", 8);
        
        System.out.printf("%s\n", computadoraPersona1);
        System.out.printf("%s\n", computadoraPersona2);
        System.out.printf("%s\n", computadoraPersona3);

        
        // Se asigna valores particulares al objeto
        // a través de los métodos establecer
        
        
        // Se presenta valores en pantalla, rescatando los valores
        // que se necesita a través de los métodos obtener del
        // objeto 
        
//        System.out.printf("Computadora 1\n"
//                + "Procesador: %s\n"
//                + "Memoria: %.2f GB\n", 
//                computadoraPersona1.obtenerTipoProcesador(),
//                computadoraPersona1.obtenerMemoria());
//        System.out.println("-------------------------");
//        
//         System.out.printf("Computadora 2\n"
//                + "Procesador: %s\n"
//                + "Memoria: %.2f GB\n", 
//                computadoraPersona2.obtenerTipoProcesador(),
//                computadoraPersona2.obtenerMemoria());
//        System.out.println("-------------------------");
//        
//         System.out.printf("Computadora 3\n"
//                + "Procesador: %s\n"
//                + "Memoria: %.2f GB\n", 
//                computadoraPersona3.obtenerTipoProcesador(),
//                computadoraPersona3.obtenerMemoria());
//        System.out.println("-------------------------");
        
    }
}
