package estruturadedados.semana01;

public class Compras {
    
    private String produto;
    private int codigo;
    private double valor;
    
    public void setProduto(String produto) {
        this.produto = produto;
    }
    
    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }
    
    public void setValor(double valor) {
        this.valor = valor;
    }
    
    public String getProduto() {
        return this.produto;
    }
    
    public int getCodigo() {
        return this.codigo;
    }
    
    public double getValor() {
        return this.valor;
    }
    
}
