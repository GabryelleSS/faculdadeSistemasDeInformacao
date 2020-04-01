package bancodedados;

public class Endereco {
    private String rua;
    private String numero;
    private String cep;
    private String cidade;
    private String estado;
    
    public Endereco(String rua, String numero, String cep, String cidade, String estado) {
        this.rua = rua;
        this.numero = numero;
        this.cep = cep;
        this.cidade = cidade;
        this.estado = estado;
    }
    
    public void setRua(String rua) {
        this.rua = rua;
    }
    
    public void setNumero(String numero) {
        this.numero = numero;
    }
    
    public void setCep(String cep) {
        this.cep = cep;
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
    
    public String getCep() {
        return cep;
    }
    
    public String getCidade() {
        return cidade;
    }
    
    public String getEstado() {
        return estado;
    }
}
