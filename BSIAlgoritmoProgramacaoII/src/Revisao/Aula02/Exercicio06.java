package Revisao.Aula02;

import java.util.Random;

public class Exercicio06 {
    public static void main(String args[]) {
        Random numeroAleatorio = new Random();
        
        int linhas = 4;
        int colunas = 4;
        int i, j;
        int [][] matriz = new int[linhas][colunas];
        for(i = 0; i < linhas; i++) {
            for(j = 0; j < colunas; j++) {
                System.out.print(matriz[i][j] = numeroAleatorio.nextInt(10));
                System.out.print(" ");
            }
            System.out.println();
        }
        
        for(i = 0; i < matriz.length; i++) {
            for(j = 0; j < matriz[i].length; j++) {
                if(i == j) {
                    System.out.print(matriz[i][j]);
                }
            }
            
        }
        
        System.out.println();
        
        for(i = 0; i < matriz.length; i++) {
            for(j = 0; j < matriz[i].length; j++) {
                if(j == colunas - 1 - i) {
                    System.out.print(matriz[i][j]);
                }
            }
        }
        
//                        if(i == 2 && j == 3) {;
//                    System.out.print("Elemento(2, 3): " + matriz[i][j]);
//                }
    }
}
