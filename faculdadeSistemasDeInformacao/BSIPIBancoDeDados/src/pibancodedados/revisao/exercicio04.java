/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pibancodedados.revisao;

import java.util.Scanner;

/**
 *
 * @author gabry
 */
public class exercicio04 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        
        String nomeDoJogo;
        String sair = "sair";
        int notaDoJogo, maiorNota = 0, comparacao = 0;
        
        for(int i = 1; i <= 10; i++) {;
            System.out.println("Digite o nome do jogo");;
            nomeDoJogo = src.nextLine();
            
            if(nomeDoJogo.equals(sair)) {
                break;
            };
            
            System.out.println("A nota do jogo ");
            notaDoJogo = src.nextInt();
            src.nextLine();
            
            if(notaDoJogo > comparacao) {
                maiorNota = notaDoJogo;
            }
            else {
                maiorNota = comparacao;
            }
            
            comparacao = maiorNota;
        }
        
        System.out.println("A maior nota do jogo é : " + maiorNota);
    }
    
}
