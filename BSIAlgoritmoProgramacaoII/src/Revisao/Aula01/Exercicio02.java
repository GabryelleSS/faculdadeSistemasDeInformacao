package Revisao.Aula01;

import java.util.Scanner;

public class Exercicio02 {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        int numero = 0;
        
        while(numero != 42) {
            System.out.println("Digite um numero:");
            numero = leitor.nextInt();
        }
    }
}
