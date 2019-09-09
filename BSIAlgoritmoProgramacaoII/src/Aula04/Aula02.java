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
public class Aula02 {
    public static void main(String[] args) {
        Scanner meuLeitor = new Scanner(System.in);
        Random meuNumeroAleatorio = new Random();
        
        int quantidadeDeNumeros = 10000;
        int i;
        
        int[] meuVetor = new int[quantidadeDeNumeros + 1];
        
        System.out.println("Digite o numero para ser encontrado:");
        int numeroEscolhido = meuLeitor.nextInt();
        
        meuVetor[quantidadeDeNumeros] = numeroEscolhido;
        
        for(i = 0; i < quantidadeDeNumeros; i++) {
             meuVetor[i] = meuNumeroAleatorio.nextInt(100);
        }
        
        i = 0;
        
        while(numeroEscolhido != meuVetor[i]) {
            i++;
        }
        
        if(i < quantidadeDeNumeros) {
            System.out.println("Voce achou");
        }
        else {
            System.out.println("Nao achou");
        }
    }
}
