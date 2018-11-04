/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package junit_ex1;

import java.util.*;

/**
 *
 * @authors 
 * André Rodrigues da Silva 
 * Jean Marcos Francisco 
 * Renan Cleverson Laureano Flor da Rosa 
 * Rafael da Silva Andrade 
 * Carlos Henrique Gaspari
 */
public class EquacaoGeralReta {

    private String ponto1 = "";
    private String ponto2 = "";

    private String xPonto1;
    private String yPonto1;

    private String xPonto2;
    private String yPonto2;

    private String[][] matriz;
    
    public EquacaoGeralReta() {
    }

    public EquacaoGeralReta(String ponto1, String ponto2) throws Exception {
        setPonto1(ponto1);
        setPonto2(ponto2);
    }

    public String getPonto1() {
        return ponto1;
    }

    public void setPonto1(String ponto1) throws Exception{
        ponto1 = ponto1.replaceAll("\\s","");
        if(!ponto1.matches("^-?[0-9]+,-?[0-9]+$")) throw new Exception("Ponto 1 não veio no formato correto");
        this.ponto1 = ponto1;
        String[] pontos = ponto1.split(",");
        xPonto1 = pontos[0];
        yPonto1 = pontos[1];
    }

    public String getPonto2() {
        return ponto2;
    }

    public void setPonto2(String ponto2)throws Exception {
        ponto2 = ponto2.replaceAll("\\s","");
        if(!ponto2.matches("^-?[0-9]+,-?[0-9]+$")) throw new Exception("Ponto 2 não veio no formato correto");
        this.ponto2 = ponto2;
        String[] pontos = ponto2.split(",");
        xPonto2 = pontos[0];
        yPonto2 = pontos[1];
    }

    private void geraMatriz() {
        this.matriz = new String[][] 
        {
            {xPonto1,yPonto1,"1",xPonto1,yPonto1},
            {xPonto2,yPonto2,"1",xPonto2,yPonto2},
            {"x",   "y",     "1",    "x",    "y"}
        };
    }
    
    private String getExpressaoDiagonal(int diagonal,boolean diagonalPrincipal){
        String expressaoNumero = "";
        String expressaoLetra = "";
        String retorno;
        List<String> lst = new ArrayList<String>();
        if(diagonalPrincipal){
            lst.add(matriz[0][diagonal]);
            lst.add(matriz[1][diagonal+1]);
            lst.add(matriz[2][diagonal+2]);
        }else{
            lst.add(matriz[0][4 - diagonal]);
            lst.add(matriz[1][3 - diagonal]);
            lst.add(matriz[2][2 - diagonal]);
        }
        for(String aux:lst){
            String regexNumero = "-?\\d+";
            if(aux.matches(regexNumero)){ //é numero
                int n = Integer.parseInt(aux);
                expressaoNumero = expressaoNumero.isEmpty() ? aux : (Integer.parseInt(expressaoNumero) * n) + "";
            }else {//é letra
                expressaoLetra = aux;
            }
            
            
        }
        return expressaoNumero + expressaoLetra;
    }
    
    
    public String calcula() throws Exception{
        if(ponto1.isEmpty() || ponto1.isEmpty()) throw new Exception("Não foi informado os pontos");
        if(ponto2.isEmpty() || ponto2.isEmpty()) throw new Exception("Não foi informado os pontos");
        
        geraMatriz();
        
        List<String> diagonalPrincipal = new ArrayList<String>();
        diagonalPrincipal.add(getExpressaoDiagonal(0, true));
        diagonalPrincipal.add(getExpressaoDiagonal(1, true));
        diagonalPrincipal.add(getExpressaoDiagonal(2, true));
        
        List<String> diagonalSecundaria = new ArrayList<>();
        diagonalSecundaria.add(getExpressaoDiagonal(0, false));
        diagonalSecundaria.add(getExpressaoDiagonal(1, false));
        diagonalSecundaria.add(getExpressaoDiagonal(2, false));
        
        //Ja da pra saber quem vai somar com quem
        
        //soma de x
        int x = 0;
        int x1 = Integer.parseInt(diagonalPrincipal.get(1).replace("x",""));
        int x2 = Integer.parseInt(diagonalSecundaria.get(2).replace("x","")) * -1;
        x =  (x1 + x2);
        
        //soma de y
        int y = 0;
        int y1 = Integer.parseInt(diagonalPrincipal.get(2).replace("y",""));
        int y2 = Integer.parseInt(diagonalSecundaria.get(1).replace("y","")) * -1;
        y = (y1 + y2);
        
        //soma de numeros normais
        int n = 0;
        int n1 = Integer.parseInt(diagonalPrincipal.get(0));
        int n2 = Integer.parseInt(diagonalSecundaria.get(0)) * -1;
        n = (n1 + n2);
        
        
        return ((x >= 0 ? "+" : "") + x + "x" ) + ((y >= 0 ? "+" : "") + y + "y" ) + ((n >= 0 ? "+" : "") + n) + "=0";
    }
}
