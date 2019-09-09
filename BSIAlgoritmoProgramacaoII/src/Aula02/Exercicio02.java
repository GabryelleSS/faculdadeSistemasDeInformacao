/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula02;

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
        
    }
}
