/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02;

import java.util.Random;

/**
 *
 * @author gabryelle.ssantos
 */
public class Exercicio07 {
    public static void main(String[] args) {
        int linha = 3;
        int coluna = 3;
        int numeroAleatorio = (int) (Math.random() * 101);
        int [][] matriz = new int[linha][coluna];
        
        for(int i = 0; i < 3; i++) {
            for(int j = 0; j < 3; j++) {
                matriz[i][j] = (int)(Math.random()*10);
                System.out.println(matriz[i]);
            }
        }
    }          
}
