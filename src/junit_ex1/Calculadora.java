/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit_ex1;

/**
 *
 * @author andre
 */
public class Calculadora {
    
    
    public double add(double x, double y){
        return x + y;
    }
    public double sub(double x, double y){
        return x - y;
    }
    public double mult(double x, double y){
        return x * y;
    }
    public double div(double x, double y) throws IllegalArgumentException{
        if(y == 0) throw new IllegalArgumentException("Divisão por zero !");
        return x/y;
    }
}
