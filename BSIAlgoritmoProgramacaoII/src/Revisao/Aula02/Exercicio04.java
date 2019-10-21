package Revisao.Aula02;

import java.util.Random;

public class Exercicio04 {
    public static void main(String args[]) {
        int tamanhoVetor = 50;
        int [] vetor = new int[tamanhoVetor];
        int i;
        
        Random numeroAleatorio = new Random();
        
        for(i = 0; i < tamanhoVetor; i++) {
            vetor[i] = numeroAleatorio.nextInt(10);
        }
        
        for(i = 0; i < vetor.length; i++) {
            if(i % 10 == 0) {
                System.out.println();
            }
            else {
                System.out.println(vetor[i] + " ");
            }
        }
    }
}
