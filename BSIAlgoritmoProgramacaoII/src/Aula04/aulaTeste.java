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
public class aulaTeste {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        Random r = new Random();
        
        int n = 1000;
        int i = 0;
        int valor = 0;  
        
        int[] vetor = new int[n];
        
        System.out.println("Digite um número para a busca:");
        int numeroASerBuscado = src.nextInt();
        
//      Mesmo algoritmo, mas feito com "while";
        while(i < n) {
            vetor[i] = r.nextInt(100);
            valor = vetor[i];
            if(valor == numeroASerBuscado) {
                break;
            }
            i++;
        }
        if(numeroASerBuscado == valor) {
            System.out.println("O numero " + vetor[i] + " na posicao " + i);
        }
        else {
            System.out.println("Numero nao encontrado");
        }
    }
}
