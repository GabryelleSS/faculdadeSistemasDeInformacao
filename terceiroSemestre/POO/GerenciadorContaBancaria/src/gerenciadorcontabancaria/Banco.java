package gerenciadorcontabancaria;

import java.util.Scanner;

public class Banco {
    
    Scanner scanner = new Scanner(System.in);
    
    private static final int LIMITE_CADASTRO = 1000;
    
    private int codigo;
    private Cliente[] clientes;
    private Conta[] contas;
    private int proximaConta = 1;
    
    public Banco() {
        codigo = 1;
        clientes = new Cliente[LIMITE_CADASTRO];
        contas = new Conta[LIMITE_CADASTRO];
    }
    
    public void cadastrar() {
        Cliente cliente = new Cliente(proximaConta);
        cliente.cadastrarCliente();
        clientes[proximaConta - 1] = cliente;
        
        Conta conta = new Conta(proximaConta, cliente.getCpf());
        contas[proximaConta - 1] = conta;
                
        proximaConta++;
    }
    
    public void saque() {
        System.out.println("Qual é o número da conta");
        int conta = scanner.nextInt();
        
        System.out.println("Qual é o valor do saque");
        double valorSaque = scanner.nextDouble();
        
        if(conta < proximaConta) {
            Conta conta1 = contas[conta - 1];
            
            if(conta1.saque(valorSaque)) {
                System.out.println("Saque efetuado com sucesso.");
            }
            else {
                System.out.println("Saldo insulficiente.");
            }
        }
        else {
            System.out.println("Conta inexistente.");
        }
    }
    
    public void deposito() {
        System.out.println("Qual é o número da conta");
        int conta = scanner.nextInt();
        
        System.out.println("Qual é o valor do deposito");
        double valorDeposito = scanner.nextDouble();
        
        if(conta < proximaConta) {
            Conta conta1 = contas[conta - 1];
            
            if(conta1.deposito(valorDeposito)) {
                System.out.println("Deposito efetuado com sucesso.");
            }
            else {
                System.out.println("Deposito insulficiente.");
            }
        }
        else {
            System.out.println("Conta inexistente.");
        } 
    }
    
    public void transferencia() {
        System.out.println("Qual é o número da conta de origem");
        int contaOrigem = scanner.nextInt();
        System.out.println("Qual é o número da conta de destino");
        int contaDestino = scanner.nextInt();
        System.out.println("Qual é o valor da transferencia");
        double valorDeposito = scanner.nextDouble();
        
        if(contaOrigem < proximaConta && contaDestino< proximaConta) {
            Conta conta1Origem = contas[contaOrigem - 1];
            Conta conta1Destino = contas[contaDestino - 1];
            
            if(conta1Origem.saque(valorDeposito) && conta1Origem.deposito(valorDeposito)) {
                System.out.println("Deposito efetuado com sucesso.");
            }
            else {
                System.out.println("Deposito insulficiente.");
            }
        }
        else {
            System.out.println("Conta inexistente.");
        } 
    }
    
    
}
