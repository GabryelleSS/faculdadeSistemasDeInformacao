package buscasequencial;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class BuscaSequencial {
    public static void main(String[] args) {
        Scanner leitor = new Scanner(System.in);
        System.out.println("Digite o valor que deseja encontrar:");
        int x = leitor.nextInt();
        int n = 100;
        int [] v = new int[n];
        
//        x é a chave procurada
//        v é o vetor de entrada
//        n a quantidade de elementos nele.
        linear_search(x, v, n);
    }
    
    public static void linear_search(int x, int v[], int n) {
        Random numeroAleatorio = new Random();
        int i;
        
//      Vetor com numeros desordenados    
        for(i = 0; i < n; i++) {
            v[i] = numeroAleatorio.nextInt(10000);
            System.out.println("[" + i + "] " + v[i]);
        }
        System.out.println();
        
//      Vetor com os numeros organizados em forma crescente
        System.out.println("Array novo");
        Arrays.sort(v);
        for(i = 0; i < v.length; i++) {
            System.out.println("[" + i + "] " + Arrays.asList(v[i]));
        }
        
        for(i = 0; i < v.length; i++) {
            if(x == v[i]) {
                System.out.println("O valor de " + x + " foi encontrado na posição " + i);
                break;
            }
        }
    }
    
}
