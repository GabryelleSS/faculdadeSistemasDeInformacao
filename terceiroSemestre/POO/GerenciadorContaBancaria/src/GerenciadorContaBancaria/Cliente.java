package GerenciadorContaBancaria;

import java.util.Scanner;

public class Cliente {
    private String nomeCliente;
    private String cpfCliente;
    private int numeroConta;
    
    void cadastrarCliente(String nomeCliente, String cpfCliente, int numeroConta) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===== Cadastro de Cliente =====");
        System.out.println("Digite o seu nome:");
        nomeCliente = scanner.nextLine();
        
        System.out.println("Digite o seu CPF:");
        cpfCliente = scanner.nextLine();
        
        System.out.println("Digite o numero da conta:");
        numeroConta = scanner.nextInt();
    }
    
    String getNomeCliente() {
        return nomeCliente;
    }
    
    String getCpfCliente() {
        return cpfCliente;
    }
}
