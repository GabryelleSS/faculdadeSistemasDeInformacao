package estruturadedados.semana01;

public class Compra {
    
    private String produto;
    private String categoria;
    private float preco;
    private int numbPedido;
    
    public void setProduto(String produto) {
        this.produto = produto;
    }
    
    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }
    
    public void setPreco(float preco) {
        this.preco = preco;
    }
    
    public void setNumbPedido(int numbPedido) {
        this.numbPedido = numbPedido;
    }
    
    public String getProduto() {
        return this.produto;
    }
    
    public String getCategoria() {
        return this.categoria;
    }
    
    public float getPreco() {
        return this.preco;
    }
    
    public int getNumbPedido() {
        return this.numbPedido;
    }
    
}
