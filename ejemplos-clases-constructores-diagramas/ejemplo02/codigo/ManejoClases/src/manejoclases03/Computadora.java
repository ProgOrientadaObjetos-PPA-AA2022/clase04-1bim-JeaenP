/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package manejoclases03;

public class Computadora {
    private String tipoProcesador;
    private double memoria;
    
    // métodos establecer para cada atributo
    public Computadora(double m) {
        memoria = m;
    }
    
    public Computadora(String tipo) {
        tipoProcesador = tipo;
    }
    
    public Computadora(String tipo, double m) {
        tipoProcesador = tipo;
        memoria = m;
    }
    
    public void establecerTipoProcesador(String n){
        tipoProcesador = n;
    }
    
    public void establecerMemoria(double n){
        memoria = n;
    }
    
    public String obtenerTipoProcesador(){
        return tipoProcesador;
    }
    
    public double obtenerMemoria(){
        return memoria;
    }
    
    public String toString() {
        String cadena = String.format("Procesador: %s\n"
                + "Memoria: %.2f GB\n", 
                obtenerTipoProcesador(),
                obtenerMemoria());
        return cadena;
    }
}
