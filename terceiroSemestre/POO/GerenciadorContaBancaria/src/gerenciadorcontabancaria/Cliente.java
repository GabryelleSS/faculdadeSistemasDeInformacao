package gerenciadorcontabancaria;

import java.util.Scanner;

public class Cliente {
    private String nomeCliente;
    private String cpfCliente;
    private int numeroConta = 1;
    
    Scanner scanner = new Scanner(System.in);
    
    void cadastrarCliente() {
        System.out.println("===== Cadastro de Cliente ====");
        
        System.out.println("Informe o nome do cliente:");
        nomeCliente = scanner.nextLine();
        
        System.out.println("Informe o CPF do cliente:");  
        cpfCliente =  scanner.nextLine();
    }
    
    public String getNome() {
        return nomeCliente;
    }
    
    public String getCpf() {
        return cpfCliente;
    }
    
    public int getNumeroConta() {
        return numeroConta;
    }
}
