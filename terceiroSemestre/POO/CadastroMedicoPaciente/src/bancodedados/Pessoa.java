package bancodedados;

import java.util.Scanner;

public class Pessoa {
    Scanner scanner = new Scanner(System.in);
    
    private String nome;
    private String cpf;
    private Endereco endereco;
    Endereco novoEndereco = new Endereco();
    
    public void cadastrar() {
        questionario("Informe o nome:");
        this.nome = scanner.nextLine();
        questionario("Informe o CPF:");
        this.cpf = scanner.nextLine();
        
        questionario("Informe o nome da rua:");
        String rua = scanner.nextLine(); 
        novoEndereco.setRua(rua);
        
        questionario("Informe o CEP:");
        String cep = scanner.nextLine(); 
        novoEndereco.setCep(cep);
        
        questionario("Informe o nome da cidade:");
        String cidade = scanner.nextLine(); 
        novoEndereco.setCidade(cidade);
    }
    
    public void questionario(String pergunta) {
        System.out.println(pergunta);
    }
    
    public void info() {
        System.out.println("===== Ficha " + this.getNome() + " =====");
        System.out.println("Nome: " + this.getNome());
        System.out.println("CPF: " + this.getCPF());
        System.out.println("Endereço: " + novoEndereco.getRua());
        System.out.println("CEP: " + novoEndereco.getCep());
        System.out.println("Cidade: " + novoEndereco.getCidade());
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
    
}
