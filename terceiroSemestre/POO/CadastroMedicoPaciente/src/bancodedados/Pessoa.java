package bancodedados;

public class Pessoa {
    private String nome;
    private String cpf;
    private Endereco endereco;
    
    public Pessoa(String nome, String cpf, String rua, String cep, String cidade) {
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = new Endereco(rua, cep, cidade);
    }
    
    public void info() {
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCPF());
        System.out.println("Endereço: " + this.getEndereco().getRua());
    }
    
    public String getNome() {
        return nome;
    }
    
    public String getCPF() {
        return cpf;
    }
    
    public Endereco getEndereco() {
        return endereco;
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public void setCPF(String cpf) {
        this.nome = cpf;
    }
    
    public void setEndereco(String endereco) {
        this.nome = endereco;
    }
    
    
}
