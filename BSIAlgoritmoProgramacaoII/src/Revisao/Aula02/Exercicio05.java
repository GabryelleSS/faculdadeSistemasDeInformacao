package Revisao.Aula02;

import java.util.Random;

public class Exercicio05 {
    public static void main(String args[]) {
        Random numeroAleatorio = new Random();
        int linhas = 3;
        int colunas = 5;
        int vetor[][] = new int[linhas][colunas];
        int i, j;
        
        for(i = 0; i < linhas; i++) {
            for(j = 0; j < colunas; j++) {
                System.out.print(vetor[i][j] = numeroAleatorio.nextInt(10));
            }
            System.out.println();
        }
    }
}
