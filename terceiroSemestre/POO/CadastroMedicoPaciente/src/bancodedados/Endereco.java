package bancodedados;

public class Endereco {    
    private String rua;
    private String cep;
    private String cidade;

    public String getRua(){
        return rua;
    }
    
    public String getCep(){
        return cep;
    }
    
    public String getCidade(){
        return cidade;
    }
    
    public void setRua(String rua){
        this.rua = rua;
    }
    
    public void setCep(String cep){
        this.cep = cep;
    }
    
    public void setCidade(String cidade){
        this.cidade = cidade;
    }    
    
}
