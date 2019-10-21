package Aula08;

import java.util.Arrays;

public class bubbleSurt {
    public static void main(String[] args) {
        int[] vetor = {55, 26, 54, 1, 5, 78, 3, 15, 69};
        
        bolha(vetor);
        
        System.out.println(Arrays.toString(vetor));
    }
    
    public static void bolha(int[] vetor) {
        for(int ultimaPosicao = vetor.length - 1; ultimaPosicao > 0; ultimaPosicao--) {
            for(int i = 0; i < ultimaPosicao; i++) {
                if(vetor[i] > vetor[i +1]) {
                    trocar(vetor, i, i + 1);
                }
            }
        }
    }
    
    public static void trocar(int[] vetor, int i, int j) {
        int aux = vetor[i];
        vetor[i] = vetor[j];
        vetor[j] = aux;
    }
}
