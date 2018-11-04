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
 * @authors 
 * André Rodrigues da Silva 
 * Jean Marcos Francisco 
 * Renan Cleverson Laureano Flor da Rosa 
 * Rafael da Silva Andrade 
 * Carlos Henrique Gaspari
 */
public class EquacaoGeralRetaTest {

    public EquacaoGeralRetaTest() {
    }

    /**
     * Test of calcula method, of class EquacaoGeralReta.
     */
    @Test
    public void testCalcula1() throws Exception {
        System.out.println("calcula1");
        EquacaoGeralReta instance = new EquacaoGeralReta("-1,2", "-2,5");
        String expResult = "-3x-1y-1";
        String result = instance.calcula();
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcula2() throws Exception {
        System.out.println("calcula2");
        EquacaoGeralReta instance = new EquacaoGeralReta("1,2", "3,8");
        String expResult = "-6x+2y+2";
        String result = instance.calcula();
        assertEquals(expResult, result);
    }

    @Test
    public void testCalcula3() throws Exception {
        try {
            System.out.println("calcula3");
            EquacaoGeralReta instance = new EquacaoGeralReta();
            String expResult = "-6x+2y+2";
            String result = instance.calcula();
            fail();
        } catch (Exception err) {
            assertTrue(true);
        }
    }

    @Test
    public void testCalcula4() throws Exception {
        try {
            System.out.println("calcula4");
            EquacaoGeralReta instance = new EquacaoGeralReta("formato errado1","formato errado2");
            String expResult = "-6x+2y+2";
            String result = instance.calcula();
            fail();
        } catch (Exception err) {
            assertTrue(true);
        }
    }
    
    @Test
    public void testCalcula5() throws Exception {
        try {
            System.out.println("calcula5");
            EquacaoGeralReta instance = new EquacaoGeralReta("1.5","2.5");
            String expResult = "-6x+2y+2";
            String result = instance.calcula();
            fail();
        } catch (Exception err) {
            assertTrue(true);
        }
    }
}
