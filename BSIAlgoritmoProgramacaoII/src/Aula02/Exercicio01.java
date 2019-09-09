<<<<<<< HEAD
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
=======
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02;

/**
 *
 * @author gabryelle.ssantos
 */
public class Exercicio01 {
    public static void main(String[] args) {
        int number = 65000;
        int conversao = (short)number;
        
        System.out.println(conversao);
>>>>>>> 2f85e427f9c2e343928b18ec61f5e4c2dc446098
    }
}
