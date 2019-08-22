package Aula03;

import java.util.Random;

public class Exercicio01 {
    
        int meuVetor = 10;
        
        int[] vetor = new int[meuVetor];
        Random numeroAleatorio = new Random();
        int variavelDeApoio; 
        int inverso = 9;
        
        System.out.println("Vetor antigo: ");
        for(int i = 0; i < meuVetor; i++) {
            vetor[i] = numeroAleatorio.nextInt(meuVetor);
            System.out.print(vetor[i] + ", ");
        }
        
        System.out.println(" ");
        
        for(int i = 0; i < meuVetor / 2; i++) {
            variavelDeApoio = vetor[i];
            vetor[i] = vetor[inverso];
            vetor[inverso] = variavelDeApoio;
            inverso--;
        }
        
        for(int i = 0; i < meuVetor; i++) {
            System.out.print(vetor[i] + ", ");
        }


    }
}
