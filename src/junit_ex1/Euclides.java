/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit_ex1;

/**
 *
 * @authors 
 * André Rodrigues da Silva 
 * Jean Marcos Francisco 
 * Renan Cleverson Laureano Flor da Rosa 
 * Rafael da Silva Andrade 
 * Carlos Henrique Gaspari
 */
public class Euclides {

    public int mdc(int x, int y) throws Exception{
        if(x < 0 || y < 0) throw new Exception ("Somente numeros naturais");
        int dividendo = x, divisor = y;
        if(divisor == 0){
            return dividendo;
        }else{
            return mdc(divisor, dividendo%divisor);
        }
    }
}
