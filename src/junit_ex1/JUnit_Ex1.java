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
public class JUnit_Ex1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws Exception{
        //EquacaoGeralReta teste = new EquacaoGeralReta("1,2", "2,1");
        EquacaoGeralReta teste = new EquacaoGeralReta("-2,-2", "-5,-8");
        teste.geraMatriz();
        
        System.out.println(teste.getExpressaoDiagonal(0, true));
        System.out.println(teste.getExpressaoDiagonal(1, true));
        System.out.println(teste.getExpressaoDiagonal(2, true));
        
        
        System.out.println(teste.getExpressaoDiagonal(0, false));
        System.out.println(teste.getExpressaoDiagonal(1, false));
        System.out.println(teste.getExpressaoDiagonal(2, false));
       
        System.out.println(teste.calcula());
        
        int[] arr = new int[]{2,3,1,5,4,7};
        new Ordenador().ordena(arr, false);
    }
    
}
