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
public class exercicio05 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        
        int [][] matriz = new int [3][3];
        int linhas = 3;
        int colunas = 3;
        int calc = 0;
        
        matriz[0][0] = 31;
        matriz[0][1] = 82;
        matriz[0][2] = 35;
        
        matriz[1][0] = 20;
        matriz[1][1] = 12;
        matriz[1][2] = 71;
        
        matriz[2][0] = 14;
        matriz[2][1] = 74;
        matriz[2][2] = 11;
        
        for(int i = 0; i < linhas; i++) {
            for(int j = 0; j < colunas; j++) {
                System.out.print(matriz[j][i] + " ");
                calc += matriz[j][i];
                
            }
            System.out.println();
        }
        
        System.out.println("A soma da matriz: " + calc);
    }
    
}
