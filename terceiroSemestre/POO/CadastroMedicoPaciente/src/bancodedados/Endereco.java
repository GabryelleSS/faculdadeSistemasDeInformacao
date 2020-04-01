package bancodedados;

public class Endereco {
    private String rua;
    private String numero;
    private String cidade;
    private String estado;
    
    public Endereco(String rua, String numero, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.cidade = cidade;
        this.estado = estado;
    }
    
    public void setRua(String rua) {
        this.rua = rua;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public void setEstado(String estado) {
        this.estado = estado;
    }
    
    public String getRua() {
        return rua;
    }
    
    public String getNumero() {
        return numero;
    }
    
    public String getCidade() {
        return cidade;
    }
    
    public String getEstado() {
        return estado;
    }
}
