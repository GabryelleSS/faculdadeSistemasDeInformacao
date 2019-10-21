package Revisao.Aula01;

import java.util.Random;

public class Exercicio03 {
    public static void main(String args[]) {
        numerosAleatorios(101);
    }
    
    public static int numerosAleatorios(int quantNumeros) {
        Random numeroAleatorio = new Random();
        
        for(int i = 0; i < 100; i++) {
            System.out.println(numeroAleatorio.nextInt(quantNumeros));
        }
        return 0;
    }
}
