package TorreDeHanoi;

import java.util.Scanner;

public class recursiva {
    public static void main(String args[]) {
        Scanner leitor = new Scanner(System.in);
        
        System.out.println("Digite a quantidade de discos:");
        int numeroDeDiscos = leitor.nextInt();
        
        calcularMovimentos(numeroDeDiscos);
        hanoi(numeroDeDiscos, "A", "B", "C");
    }
    
    public static void calcularMovimentos(int numeroDeDiscos) {
        int quantidadeMinima;
        
        quantidadeMinima = (int)Math.pow(2, numeroDeDiscos) - 1;
        System.out.println("Quantidade minima: " + quantidadeMinima);
    }
    
//    n = numero de discos
//    source = inicio
//    target = destino
//    auxiliary = auxiliar
    public static void hanoi(int n, String source, String target, String auxiliary) {
        if(n > 0) {
            hanoi(n - 1, source, target, auxiliary);
            System.out.println("Mover disco da torre " + source + " para a torre " + target);
            hanoi(n - 1, auxiliary, target, source);
        }
    }
}
