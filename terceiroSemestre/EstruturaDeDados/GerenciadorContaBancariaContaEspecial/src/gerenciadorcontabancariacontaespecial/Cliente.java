package gerenciadorcontabancariacontaespecial;

import java.util.Scanner;

public class Cliente {
    
    Scanner scanner = new Scanner(System.in);
    
    private String nome;
    private String cpf;
    private int numeroConta;
    
    public void cadastroCliente(String nome, String cpf, int numeroConta) {
        System.out.println("===== Informe seus dados =====");
        System.out.println("Informe o nome do cliente:");
        String novoNome = scanner.nextLine();
        
        System.out.println("Informe o nome do cliente:");
        String novoCpf = scanner.nextLine();
        
        setNome(novoNome);
        setCpf(novoCpf);
    }
    
    public void setNome(String nome) {
        this.nome = nome;
    }
    
    public String getNome() {
        return nome;
    }
    
    public void setCpf(String cpf) {
        this.cpf = cpf;
    }
    
    public String getCpf() {
        return cpf;
    }
    
    public void setNumeroConta(int numeroConta) {
        this.numeroConta = numeroConta;
    }
    
    public int getNumeroConta() {
        return numeroConta;
    }
}
