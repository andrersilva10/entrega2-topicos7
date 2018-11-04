/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit_ex1;


import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author andre
 */
public class ValidaCPFTest {

    /**
     * valido
     */
    @Test
    public void testIsCPF1() {
        System.out.println("isCPF1");
        String CPF = "41352689863";
        ValidaCPF instance = new ValidaCPF();
        boolean expResult = true;
        boolean result = instance.isCPF(CPF);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsCPF2() {
        System.out.println("isCPF2");
        String CPF = "36158882003";
        ValidaCPF instance = new ValidaCPF();
        boolean expResult = true;
        boolean result = instance.isCPF(CPF);
        assertEquals(expResult, result);
    }

    @Test
    public void testIsCPF3() {
        System.out.println("isCPF3");
        String CPF = "1111111111";
        ValidaCPF instance = new ValidaCPF();
        boolean expResult = false;
        boolean result = instance.isCPF(CPF);
        assertEquals(expResult, result);
    }

    //existem letras
    @Test
    public void testIsCPF4() {
        System.out.println("isCPF4");
        String CPF = "413BRBR89863";
        ValidaCPF instance = new ValidaCPF();
        boolean expResult = false;
        boolean result = instance.isCPF(CPF);
        assertEquals(expResult, result);
    }

    //passou do limite de caracteres
    @Test
    public void testIsCPF5() {
        System.out.println("isCPF4");
        String CPF = "4131312314542343412313";
        ValidaCPF instance = new ValidaCPF();
        boolean expResult = false;
        boolean result = instance.isCPF(CPF);
        assertEquals(expResult, result);
    }
    
    //poucos caracteres
    @Test
    public void testIsCPF6() {
        System.out.println("isCPF6");
        String CPF = "413131";
        ValidaCPF instance = new ValidaCPF();
        boolean expResult = false;
        boolean result = instance.isCPF(CPF);
        assertEquals(expResult, result);
    }
}
