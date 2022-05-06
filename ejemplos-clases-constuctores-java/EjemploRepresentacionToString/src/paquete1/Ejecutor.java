/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package paquete1;

public class Ejecutor {
    public static void main(String[] args) {
        // Se crea un objeto haciendo referencia al constructor sin 
        // argumentos
        FacturaTelefonica fac = new FacturaTelefonica();
        // se llama al método que calcula el valor de la factura
        fac.calcularValorFactura(); 
        FacturaTelefonica fac2 = new FacturaTelefonica("1231231111", 10, 1.56);

        System.out.printf("%s\n", fac);
        System.out.printf("%s\n", fac2);
    }
}
