/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Aula04;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author gabryelle.ssantos
 */
public class aula01 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        Random r = new Random();
        
        int n = 1000;
        int i, valor = 0;  
        
        int[] vetor = new int[n];
        
        System.out.println("Digite um número para a busca:");
        int numeroASerBuscado = src.nextInt();
        
        for(i = 0; i < n; i++) {
            vetor[i] = r.nextInt(100);
//            System.out.println((i + 1) + ") " + vetor[i]);

            valor = vetor[i];
            if(valor == numeroASerBuscado) {
                break;
            }
        }
        
        if(numeroASerBuscado == valor) {
            System.out.println("O número " + vetor[i] + " na posicao " + i);
        }
        else {
            System.out.println("Número nao encontrado");
        }
       
    }
}
