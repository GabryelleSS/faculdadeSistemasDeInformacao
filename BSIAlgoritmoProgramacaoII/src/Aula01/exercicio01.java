package Aula01;

import java.util.Scanner;

public class exercicio01 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        
        int num01;
        int num02;
        int num03;
        String frase = "Digite um numero";
        
        System.out.println(frase);
        num01 = src.nextInt();
        
        System.out.println(frase);
        num02 = src.nextInt();
        
        System.out.println(frase);
        num03 = src.nextInt();
    }
}
