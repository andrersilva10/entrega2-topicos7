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
public class EuclidesTest {

    public EuclidesTest() {
    }

    /**
     * Test of mdc method, of class Euclides.
     */
    @Test
    public void testMdc1() {
        try {
            System.out.println("mdc1");
            int x = 12;
            int y = 9;
            Euclides instance = new Euclides();
            int expResult = 3;
            int result = instance.mdc(x, y);
            assertEquals(expResult, result);
        } catch (Exception err) {
            fail();
        }

    }

    @Test
    public void testMdc2() {
        try {
            System.out.println("mdc2");
            int x = 59;
            int y = 9;
            Euclides instance = new Euclides();
            int expResult = 1;
            int result = instance.mdc(x, y);
            assertEquals(expResult, result);
        } catch (Exception err) {
            fail();
        }
    }

    @Test
    public void testMdc3() {
        try {
            System.out.println("mdc3");
            int x = -59;
            int y = 9;
            Euclides instance = new Euclides();
            int expResult = 1;
            int result = instance.mdc(x, y);
            fail();
            
        } catch (Exception err) {
            assertTrue(true);
        }
    }
}
