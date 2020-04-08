package estruturadedados.semana01;

import java.util.Scanner;

public class ArrayCompra {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Compra[] compra = new Compra[4];
        
        for (int i = 0; i < compra.length; i++) {
            compra[i] = new Compra();
        }
        
        for (Compra contador : compra) {
            System.out.println("Insira o nome do produto:");
            contador.setProduto(scanner.nextLine());
            
            System.out.println("Insira a categoria do produto:");
            contador.setCategoria(scanner.nextLine());
            
            System.out.println("Insira o preço do produto:");
            contador.setPreco(scanner.nextFloat());
            scanner.nextLine();
            
            System.out.println("Insira o número do pedido:");
            contador.setNumbPedido(scanner.nextInt());
            scanner.nextLine();
        }
        
        for(Compra contador : compra) {
            System.out.println("Informações da compra:");
            
            System.out.println(contador.getProduto());
            System.out.println(contador.getCategoria());
            System.out.println(contador.getPreco());
            System.out.println(contador.getNumbPedido());
        }
        
    }
}
