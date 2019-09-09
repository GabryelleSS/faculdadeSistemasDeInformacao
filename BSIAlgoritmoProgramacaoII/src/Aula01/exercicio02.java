/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula01;

import java.util.Scanner;

/**
 *
 * @author gabry
 */
public class exercicio02 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        
        int numb = 0;
        
        while(numb != 42) {
            System.out.println("Digite um numero:");
            numb = src.nextInt();
        }
    }
}
