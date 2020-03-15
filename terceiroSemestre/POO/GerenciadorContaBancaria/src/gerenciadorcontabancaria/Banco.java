package gerenciadorcontabancaria;

import java.util.Scanner;

public class Banco {
    private static int QUANT_CLIENTE = 2;
    private static int QUANT_CONTA = 2;
    private int indice = 0;
    
    private int codigo;
    
    private static Cliente[] cliente = new Cliente[QUANT_CLIENTE];
    
    Scanner scanner = new Scanner(System.in);
    
    void cadastraNovoCliente() {
        
        if (indice <= cliente.length) {
            Cliente novoCliente = new Cliente();
            novoCliente.cadastrarCliente();
            
            cliente[indice] = novoCliente; 
            indice++;
        }
        else {
            System.out.println("Limite excedido!");
        }
        
    }
    
    void saqueCliente() {
        int numeroConta;
        float valorSaque;
        
        Cliente novoCliente = new Cliente();
        int numeroContaCliente = novoCliente.getNumeroConta();
        
        System.out.println("==== Saque conta Bancaria =====");
        System.out.println("Informe o número da conta:");
        numeroConta = scanner.nextInt();
        
        if (numeroConta == numeroContaCliente) {
            Conta conta = new Conta();
            
            System.out.println("Informe o valor que deseja sacar:");
            valorSaque = scanner.nextFloat();
            
            conta.saque(valorSaque);
            
        }
        else {
            System.out.println("Numero da conta inválida, tente novamente");
        }
        
    }
    
    void depositoCliente() {
        int numeroConta;
        float valorDeposito;
        
        Cliente novoCliente = new Cliente();
        int numeroContaCliente = novoCliente.getNumeroConta();
        
        System.out.println("==== Saque conta Bancaria =====");
        System.out.println("Informe o número da conta:");
        numeroConta = scanner.nextInt();
        
        if (numeroConta == numeroContaCliente) {
            Conta conta = new Conta();
            
            System.out.println("Informe o valor que deseja depositar:");
            valorDeposito = scanner.nextFloat();
            
            conta.deposito(valorDeposito);
            
        }
        else {
            System.out.println("Numero da conta inválida, tente novamente");
        }
    }
    
}
