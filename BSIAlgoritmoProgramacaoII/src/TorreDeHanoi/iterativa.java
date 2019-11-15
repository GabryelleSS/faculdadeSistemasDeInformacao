package TorreDeHanoi;

import java.util.Scanner;

public class iterativa {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        
        int numeroDeDiscos;
        
        System.out.println("Digite o número de pinos que deseja:");
        numeroDeDiscos = leitor.nextInt();
        
        iterativa hanoiIterativa = new iterativa();
        hanoiIterativa.calcularMovimentos(numeroDeDiscos);
    }
    
    public static void calcularMovimentos(int numeroDeDiscos) {
        int quantidadeMinima;
        
        quantidadeMinima = (int)Math.pow(2, numeroDeDiscos) - 1;
        
        torreDeHanoiIterativa(numeroDeDiscos, quantidadeMinima);
    }
    
    public static void torreDeHanoiIterativa(int numeroDeDiscos, int quantidadeMinima) {
        int pinoOrigem = 1;
        int pinoAuxiliar = 2;
        int pinoDestino = 3;
        
        int indexPar = 0;
        int indexImpar = 0;
        
        if(numeroDeDiscos % 2 == 0) {
            System.out.println("Par");
            
            for(int i = 0; i < quantidadeMinima; i++) {
                if(indexPar > 2) {
                    indexPar = 0;
                }
                System.out.println("Mover disco da Torre A para Torre B");
                System.out.println("Mover disco da Torre B para Torre C");
                System.out.println("Mover disco da Torre C para Torre A");
                
                indexPar++;
            }
        }
        else {
            System.out.println("Impar");
            System.out.println("Mover disco da Torre A para Torre C");
            System.out.println("Mover disco da Torre A para Torre B");
            System.out.println("Mover disco da Torre C para Torre B");
        }
    }
}
