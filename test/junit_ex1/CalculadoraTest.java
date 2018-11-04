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
public class CalculadoraTest {

    public CalculadoraTest() {
    }

    /**
     * Dois numeros positivos
     */
    @Test
    public void testAdd1() {
        System.out.println("add1");
        double x = 2;
        double y = 5;
        Calculadora instance = new Calculadora();
        double expResult = 7;
        double result = instance.add(x, y);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Um numero negativo e um positivo
     */
    @Test
    public void testAdd2() {
        System.out.println("add2");
        double x = -2;
        double y = 5;
        Calculadora instance = new Calculadora();
        double expResult = 3;
        double result = instance.add(x, y);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Um numero inteiro negativo e um positivo
     */
    @Test
    public void testAdd3() {
        System.out.println("add3");
        double x = 2;
        double y = -8;
        Calculadora instance = new Calculadora();
        double expResult = -6;
        double result = instance.add(x, y);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Soma de numeros reais
     */
    @Test
    public void testAdd4() {
        System.out.println("add4");
        double x = 5.5;
        double y = 4.4;
        Calculadora instance = new Calculadora();
        double expResult = 9.9;
        double result = instance.add(x, y);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Sub de numeros reais
     */
    @Test
    public void testSub1() {
        System.out.println("sub1");
        double x = 10.5;
        double y = 25.5;
        Calculadora instance = new Calculadora();
        double expResult = -15;
        double result = instance.sub(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Sub de dois numeros inteiros
     */
    @Test
    public void testSub2() {
        System.out.println("sub2");
        double x = 10;
        double y = 25;
        Calculadora instance = new Calculadora();
        double expResult = -15;
        double result = instance.sub(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }
    /**
     * Sub de um numero inteiro positivo e um negativo
     */
    @Test
    public void testSub3() {
        System.out.println("sub3");
        double x = 10;
        double y = -25;
        Calculadora instance = new Calculadora();
        double expResult = 35;
        double result = instance.sub(x, y);
        assertEquals(expResult, result, 0.0);
        // TODO review the generated test code and remove the default call to fail.
    }

    /**
     * Mult de 2 numeros inteiros positivos
     */
    @Test
    public void testMult1() {
        System.out.println("mult1");
        double x = 5;
        double y = 4;
        Calculadora instance = new Calculadora();
        double expResult = 20;
        double result = instance.mult(x, y);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Mult de dois numeros reais positivos
     */
    @Test
    public void testMult2() {
        System.out.println("mult2");
        double x = 20.5;
        double y = 40.2;
        Calculadora instance = new Calculadora();
        double expResult = 824.1;
        double result = instance.mult(x, y);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Mult de dois numeros inteiros negativos
     */
    @Test
    public void testMult3() {
        System.out.println("mult3");
        double x = -20;
        double y = -3;
        Calculadora instance = new Calculadora();
        double expResult = 60;
        double result = instance.mult(x, y);
        assertEquals(expResult, result, 0.0);
    }

    /**
     * Divisao de dois numeros inteiros
     */
    @Test
    public void testDiv1() {
        System.out.println("div1");
        double x = 20;
        double y = 2;
        Calculadora instance = new Calculadora();
        double expResult = 10;
        double result = instance.div(x, y);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Um numero negativo e um positivo
     */
    @Test
    public void testDiv2() {
        System.out.println("div2");
        double x = -15;
        double y = 2.5;
        Calculadora instance = new Calculadora();
        double expResult = -6;
        double result = instance.div(x, y);
        assertEquals(expResult, result, 0.0);
    }
    /**
     * Divisão por zero
     */
    @Test
    public void testDiv3() {
        try {
            System.out.println("div3");
            double x = 20;
            double y = 0;
            Calculadora instance = new Calculadora();
            double expResult = 10;
            double result = instance.div(x, y);
            fail();
        } catch (Exception err) {
            assertTrue(true);
        }

    }
    /**
     * Divisão de dois numeros negativos
     */
    @Test
    public void testDiv4() {
        System.out.println("div4");
        double x = -600;
        double y = -2;
        Calculadora instance = new Calculadora();
        double expResult = 300;
        double result = instance.div(x, y);
        assertEquals(expResult, result, 0.0);
    }
}
