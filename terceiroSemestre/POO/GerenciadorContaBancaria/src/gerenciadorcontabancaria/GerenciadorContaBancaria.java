package gerenciadorcontabancaria;

import java.util.Scanner;

public class GerenciadorContaBancaria {
    
    public static void main(String[] args) {
        Banco novoCliente = new Banco();
        int opcao;
        
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===== Menu =====");
        System.out.println("Informe o que deseja fazer:");
        System.out.println("1 - Cadastrar novo cliente");
        System.out.println("2 - Realizar deposito");
        System.out.println("3 - Realizar saque bancario");
        opcao = scanner.nextInt();
        
        if (opcao == 1) {
            novoCliente.cadastraNovoCliente();
        }
        else if (opcao == 2) {
            novoCliente.depositoCliente();
        }
        else if (opcao == 3) {
            novoCliente.saqueCliente();
        }
        else {
            System.out.println("Falha na comunicação.");
        }
        
    }
    
}
