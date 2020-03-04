package estruturadedados.semana01;

import java.util.Scanner;

public class ArrayCompras {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        Compras[] compras = new Compras[4];
        
        int total;
        
        for (int i = 0; i < compras.length; i++) {
            compras[i] = new Compras();
        }
        
        for (Compras contador : compras) {
            System.out.println("Insira o nome do produto:");
            contador.setProduto(scanner.nextLine());
            
            System.out.println("Insira o código do produto:");
            contador.setCodigo(scanner.nextInt());
            scanner.nextLine();
            
            System.out.println("Insira o valor do produto:");
            contador.setValor(scanner.nextDouble());
            scanner.nextLine();
        }
        
        for(Compras contador : compras) {
            System.out.println("Informações da compra:");
            
            System.out.println(contador.getProduto());
            System.out.println(contador.getCodigo());
            System.out.println(contador.getValor());
        }
        
    }
}
