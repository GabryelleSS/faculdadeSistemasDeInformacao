package matrizbidimensional;

import java.util.Scanner;

public class MatrizBidimensional {
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        int tamanho = 4;
        int total = 0;
        
        int[][] matrizQuadrada = new int[tamanho][tamanho];
        
        for(int i = 0; i < matrizQuadrada.length; i++) {            
            for(int j = 0; j < matrizQuadrada[0].length; j++) {
                System.out.println("Digite o valor da matriz:");
                matrizQuadrada[i][j] = scanner.nextInt();
                scanner.nextLine();
            }
            System.out.println(" ");
        }
        
        for(int i = 0; i < matrizQuadrada.length; i++) {            
            for(int j = 0; j < matrizQuadrada[0].length; j++) {
                System.out.print("[" + matrizQuadrada[i][j] + "]");
                
                if(i == j) {
                    total += matrizQuadrada[i][j];
                }
            }
            System.out.println(" ");
        }
        
        System.out.println("Valor total da diagonal: " + total);
    }
    
}
