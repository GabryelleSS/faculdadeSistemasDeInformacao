package Aula02;

import java.util.Scanner;

public class Exercicio01 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
     
        String frase = "Digite um numero:";
        int number01;
        int number02;
        int number03;
        
        System.out.println(frase);
        number01 = src.nextInt();
        
        System.out.println(frase);
        number02 = src.nextInt();
        
        System.out.println(frase);
        number03 = src.nextInt();
        
        System.out.println("Numeros: " + number01 + ", " + number02 + ", " + number03);
    }
}
