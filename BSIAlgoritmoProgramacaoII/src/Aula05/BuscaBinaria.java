package Aula05;

import java.util.Scanner;

public class BuscaBinaria {
    public static void main(String[] args) {
        Scanner solicitaNumero = new Scanner(System.in);
        
        System.out.println("Digite o numero que deseja procurar:");
        int numeroInformado = solicitaNumero.nextInt();
        
        buscaBinaria(numeroInformado);
    }
    
    public static int buscaBinaria(int number) {
        int tamanhoDoVetor = 10;
        int meioDoVetor = 0;
        int inicioDoVetor = 0;
        int fimDoVetor = tamanhoDoVetor - 1;
        
        int[] vetorTemporario = {7, 9, 15, 33, 78, 98, 150, 200, 203, 335};
        
        while(inicioDoVetor <= fimDoVetor) {
            meioDoVetor = (fimDoVetor + inicioDoVetor) / 2;
            
            if(number == vetorTemporario[meioDoVetor]) {
                break;
            } 
            
            if(number < vetorTemporario[meioDoVetor]) {
                fimDoVetor = meioDoVetor - 1;
            } 
            else {
                inicioDoVetor = meioDoVetor + 1;
            }
        }
        
        if(inicioDoVetor <= fimDoVetor) {
            System.out.println("O numero " + number + " esta na posicao " + meioDoVetor);
        }
        else {
            System.out.println("Nao achou");
        }
        
        return number;

    }
}
