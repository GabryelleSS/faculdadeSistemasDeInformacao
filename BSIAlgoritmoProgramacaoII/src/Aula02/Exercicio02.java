/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02;

<<<<<<< HEAD
import java.util.Scanner;

/**
 *
 * @author gabry
 */
public class Exercicio02 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        
        int number = 0;
        
        while(number != 42) {
            System.out.println("Digite um numero:");
            number = src.nextInt();
        }
        
=======
/**
 *
 * @author gabryelle.ssantos
 */
public class Exercicio02 {
    public static void main(String[] args) {
        double number = 1234.5678901;
        float conversaro = (float)number;
        
        System.out.println(conversaro);
>>>>>>> 2f85e427f9c2e343928b18ec61f5e4c2dc446098
    }
}
