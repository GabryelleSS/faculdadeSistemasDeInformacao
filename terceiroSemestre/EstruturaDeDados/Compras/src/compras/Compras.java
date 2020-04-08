package compras;

import java.util.Scanner;

public class Compras {
    
    Scanner scanner = new Scanner(System.in);
    
    private String produto;
    private int codigo;
    private float valor;
    
    public void cadastrar() {
        System.out.println("===== Cadastro =====");
        
        System.out.println("Informe o produto:");
        this.produto = scanner.nextLine();
        
        System.out.println("Informe o código:");
        this.codigo = scanner.nextInt();
        
        System.out.println("Informe o valor:");
        this.valor = scanner.nextFloat();
    }
    
    public void info() {
        System.out.println("===== Informações =====");
        
        System.out.println("Produto: " + this.getProduto());
        
        System.out.println("Código: " + this.getCodigo());
        
        System.out.println("Valor: " + this.getValor());
    }
    
    public float valorTotal() {
        return this.getValor();
    }
    
    private void setProduto(String produto) {
        this.produto = produto;
    }
    
    private String getProduto() {
        return produto;
    }
    
    private void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    private int getCodigo() {
        return this.codigo;
    }
    
    private void setValor(float valor) {
        this.valor = valor;
    }
    
    private float getValor() {
        return this.valor;
    }
}
