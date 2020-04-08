package gerenciadordecompra;

import java.util.Scanner;

public class Compras {
    
    Scanner scanner = new Scanner(System.in);
    
    private String produto;
    private String categoria;
    private float preco;
    private int numPedido;
    private int contador = 0;
    
    private Compras[] compras;
    
    public void cadastrar(int quantidade) {
        compras = new Compras[quantidade];
        
        for(Compras compra : compras) {
            
            System.out.println("Informe o produto:");
            String novoProduto = scanner.nextLine();
            this.setProduto(novoProduto);

            System.out.println("Informe a categoria:");
            String novaCategoria = scanner.nextLine();
            this.setCategoria(novaCategoria);

            System.out.println("Informe o preço:");
            float novoPreco = scanner.nextFloat();
            this.setPreco(novoPreco);

            System.out.println("Informe o número do pedido:");
            int novoNumPedido = scanner.nextInt();
            this.setNumPedido(novoNumPedido);
            scanner.nextLine();
            
            contador++;
        }
        
    }
    
    public void info() {
        for(Compras compra : compras) {
            System.out.println("===== Informação da compra =====");

            System.out.println("Produto: " + compra.getProduto());
            System.out.println("Categoria: " + compra.getCategoria());
            System.out.println("Preço: " + compra.getPreco());
            System.out.println("Número do pedido: " + compra.getNumPedido());
        }
    }
    
    public void setProduto(String produto) {
        this.produto = produto;
    } 
    
    public String getProduto() {
       return produto;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public String getCategoria() {
        return categoria;
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public float getPreco() {
        return preco;
    }
    
    public void setNumPedido(int numPedido) {
        this.numPedido = numPedido;
    }
    
    public int getNumPedido() {
        return numPedido;
    }
    
}
