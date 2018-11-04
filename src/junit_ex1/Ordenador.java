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
public class Ordenador {

    public void ordena(int[] arr, boolean ascendente) {
        for (int i = 0; i < arr.length; i++) {
            for (int j = i; j < arr.length; j++) {
                if (ascendente) {
                    if (arr[i] > arr[j]) {
                        int aux = arr[i];
                        arr[i] = arr[j];
                        arr[j] = aux;
                    }
                } else {
                    if (arr[i] < arr[j]) {
                        int aux = arr[i];
                        arr[i] = arr[j];
                        arr[j] = aux;
                    }
                }
            }
        }
        System.out.println("");
    }
}
