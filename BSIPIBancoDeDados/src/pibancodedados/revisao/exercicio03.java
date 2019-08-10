/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pibancodedados.revisao;

import java.util.Scanner;

/**
 *
 * @author gabry
 */
public class exercicio03 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        
        int numeroDigitado = src.nextInt();
        int calc = 1;
        
        
        for(int i = 1; i <= numeroDigitado; i++) {
            calc *= i;
            System.out.println(calc);
        }
    }
    
}
