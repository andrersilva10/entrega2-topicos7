/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit_ex1;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andre
 */
public class OrdenadorTest {

    public OrdenadorTest() {
    }
    /**
     * Test of ordena method, of class Ordenador.
     */
    @Test
    public void testOrdena1() {
        System.out.println("ordena1");
        int[] arr = new int[]{2, 5, 1, 3, 4};
        int[] expResult = new int[]{1, 2, 3, 4, 5};
        boolean ascendente = true;
        Ordenador instance = new Ordenador();
        instance.ordena(arr, ascendente);
        assertArrayEquals(expResult, arr);
    }

    @Test
    public void testOrdena2() {
        System.out.println("ordena2");
        int[] arr = new int[]{2, 5, 1, 3, 4};
        int[] expResult = new int[]{5, 4, 3, 2, 1};
        boolean ascendente = false;
        Ordenador instance = new Ordenador();
        instance.ordena(arr, ascendente);
        assertArrayEquals(expResult, arr);
    }

    @Test
    public void testOrdena3() {
        System.out.println("ordena3");
        int[] arr = new int[]{2, 5, 1, 3, 4,-20,-1,-50,1000};
        int[] expResult = new int[]{-50,-20,-1,1,2,3,4,5,1000};
        boolean ascendente = true;
        Ordenador instance = new Ordenador();
        instance.ordena(arr, ascendente);
        assertArrayEquals(expResult, arr);
    }
}
