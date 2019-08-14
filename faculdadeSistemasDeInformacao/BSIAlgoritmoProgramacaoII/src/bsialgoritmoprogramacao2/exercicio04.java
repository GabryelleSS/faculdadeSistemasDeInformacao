/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bsialgoritmoprogramacao2;

import java.util.Scanner;

/**
 *
 * @author gabry
 */
public class exercicio04 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        
        String frase = "Digite um numero";
        int numb01 = 0;
        int numb02 = 0;
        int numb03 = 0;
        
        System.out.println(frase);
        numb01 = src.nextInt();
        
        System.out.println(frase);
        numb02 = src.nextInt();
        
        System.out.println(frase);
        numb03 = src.nextInt();
        
        System.out.println(ordenandoNumeros(numb01, numb02, numb03));
    }
    
    public static String ordenandoNumeros(int numb01, int numb02, int numb03) {
        String ordem;
        if(numb01 >= numb02 && numb01 >= numb03) {
            if(numb02 >= numb03) {
                return ordem = "1: " + numb01 + "\n2: " + numb02 + "\n3: " + numb03;
            }
            else {
                return ordem = "1: " + numb01 + "\n2: " + numb03 + "\n3: " + numb02;
            }
        }
        else if(numb02 >= numb01 && numb02 >= numb03) {
            if(numb01 >= numb03) {
                return ordem = "1: " + numb02 + "\n2: " + numb01 + "\n3: " + numb03;
            }
            else {
                return ordem = "1: " + numb02 + "\n2: " + numb03 + "\n3: " + numb01;
            }
        }
        else {
            if(numb01 >= numb02) {
                return ordem = "1: " + numb03 + "\n2: " + numb01 + "\n3: " + numb02;
            }
            else {
                return ordem = "1: " + numb03 + "\n2: " + numb02 + "\n3: " + numb01;
            }
        }
    }
}
