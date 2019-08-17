/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ues.edu.sv.prn335.boundary;

import org.junit.Test;
import static org.junit.Assert.*;
import org.junit.Before;

/**
 *
 * @author Noé
 */
public class OperacionTest {

    public OperacionTest() {
    }

    @Test
    public void testSepararNumeros() {
        Operacion instancia = new Operacion();
        int esperado[] = {5, 4, 3};
        int devolucion[] = instancia.serpararNumeros("5+4-3");
        assertArrayEquals(esperado, devolucion);
        //fail("Aquí va a fallar");

    }

    @Test
    public void testSepararSimbolos() {
        Operacion instacia = new Operacion();
        String esperado[] = {"+", "-"};
        String devuelto[] = instacia.separarSimbolos("5+4-3");
        assertArrayEquals(esperado, devuelto);
        //fail("esto es un fail");
    }

}
