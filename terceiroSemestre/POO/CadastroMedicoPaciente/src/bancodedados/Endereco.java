package bancodedados;

public class Endereco {
    private String rua;
    private String numero;
    private String cep;
    private String cidade;
    private String estado;
    
    public Endereco(String rua, String cep, String cidade) {
        this.rua = rua;
        this.cep = cep;
        this.cidade = cidade;
    }
    
    public void setRua(String rua) {
        this.rua = rua;
    }
    public void setCep(String cep) {
        this.cep = cep;
    }
    
    public void setCidade(String cidade) {
        this.cidade = cidade;
    }
    
    public String getRua() {
        return rua;
    }
    
    public String getCep() {
        return cep;
    }
    
    public String getCidade() {
        return cidade;
    }
}
