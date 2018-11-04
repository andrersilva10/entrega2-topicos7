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
public class EquacaoGeralRetaTest {
    
    public EquacaoGeralRetaTest() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of getPonto1 method, of class EquacaoGeralReta.
     */
    @Test
    public void testGetPonto1() {
        System.out.println("getPonto1");
        EquacaoGeralReta instance = new EquacaoGeralReta();
        String expResult = "";
        String result = instance.getPonto1();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPonto1 method, of class EquacaoGeralReta.
     */
    @Test
    public void testSetPonto1() {
        System.out.println("setPonto1");
        String ponto1 = "";
        EquacaoGeralReta instance = new EquacaoGeralReta();
        instance.setPonto1(ponto1);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getPonto2 method, of class EquacaoGeralReta.
     */
    @Test
    public void testGetPonto2() {
        System.out.println("getPonto2");
        EquacaoGeralReta instance = new EquacaoGeralReta();
        String expResult = "";
        String result = instance.getPonto2();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of setPonto2 method, of class EquacaoGeralReta.
     */
    @Test
    public void testSetPonto2() {
        System.out.println("setPonto2");
        String ponto2 = "";
        EquacaoGeralReta instance = new EquacaoGeralReta();
        instance.setPonto2(ponto2);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of geraMatriz method, of class EquacaoGeralReta.
     */
    @Test
    public void testGeraMatriz() {
        System.out.println("geraMatriz");
        EquacaoGeralReta instance = new EquacaoGeralReta();
        instance.geraMatriz();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of getExpressaoDiagonal method, of class EquacaoGeralReta.
     */
    @Test
    public void testGetExpressaoDiagonal() {
        System.out.println("getExpressaoDiagonal");
        int diagonal = 0;
        boolean diagonalPrincipal = false;
        EquacaoGeralReta instance = new EquacaoGeralReta();
        String expResult = "";
        String result = instance.getExpressaoDiagonal(diagonal, diagonalPrincipal);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of calcula method, of class EquacaoGeralReta.
     */
    @Test
    public void testCalcula() throws Exception {
        System.out.println("calcula");
        EquacaoGeralReta instance = new EquacaoGeralReta();
        String expResult = "";
        String result = instance.calcula();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
