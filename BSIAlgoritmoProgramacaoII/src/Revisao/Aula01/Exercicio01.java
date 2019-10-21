package Revisao.Aula01;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String args[]) {
        SolicitaNumero();
    }
    
    public static int[] SolicitaNumero() {
        Scanner leitor = new Scanner(System.in);
        int [] numeros = new int[3];
        int i;
        
        for(i = 0; i < 3; i++) {
            System.out.println("Digite um numero:");
            numeros[i] = leitor.nextInt();
        }
        
        for(i = 0; i < 3; i++){
            System.out.print(numeros[i] + " ");
        }
        
        return numeros;
    }
}
