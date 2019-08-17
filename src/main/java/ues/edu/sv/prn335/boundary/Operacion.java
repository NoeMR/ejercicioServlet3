/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.prn335.boundary;

/**
 *
 * @author Noé
 */
public class Operacion {

    public void Operacion(){
        
    }
    
    public int[] serpararNumeros(String numeros){
        int tamanio = 0;
        int contador = 0;
        for (int i = 0; i < numeros.length(); i++) {
            if(Character.isDigit(numeros.charAt(i))){
                tamanio = tamanio + 1;
            }
        }
        int vector[] = new int[tamanio];
        for (int i = 0; i < numeros.length(); i++) {
             if(Character.isDigit(numeros.charAt(i))){
                vector[contador] = Integer.parseInt(String.valueOf(numeros.charAt(i)));
                contador = contador + 1;
            }
        }
        return vector;
    }
    
    public String[] separarSimbolos(String simbolos){
        int tamanio = 0;
        int contador = 0;
        for (int i = 0; i < simbolos.length(); i++) {
            if (String.valueOf(simbolos.charAt(i)).equals("+") || String.valueOf(simbolos.charAt(i)).equals("-")) {
                tamanio = tamanio + 1 ;
            }            
        }
        String vectorSimbolos[] = new String[tamanio];
         for (int i = 0; i < simbolos.length(); i++) {
            if (String.valueOf(simbolos.charAt(i)).equals("+") || String.valueOf(simbolos.charAt(i)).equals("-")) {
                vectorSimbolos[contador] = String.valueOf(simbolos.charAt(i));
                contador = contador + 1 ;
            }            
        }
        return vectorSimbolos;
    } 
}
