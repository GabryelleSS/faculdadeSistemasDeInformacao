package gerenciadorcontabancaria;

import java.util.Scanner;

public class GerenciadorContaBancaria {
    
    private static Banco banco = new Banco();
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        int opcao;
        
        do {
            System.out.println("===== Menu =====");
            
            System.out.println("1 - Cadastrar novo cliente");
            System.out.println("2 - Realizar saque");
            System.out.println("3 - Realizar deposito");
            System.out.println("4 - Realizar transferência");
            System.out.println("5 - Sair");
            
            System.out.println("Informe o que deseja fazer:");
            opcao = scanner.nextInt();
            
            switch(opcao) {
                case 1:
                    banco.cadastrar();
                    break;
                case 2:
                    banco.saque();
                    break;
                case 3:
                    banco.deposito();
                    break;
                case 4:
                    banco.transferencia();
                    break;
                case 5:
                    System.out.println("Obrigada por utilizar os nossos serviços.");
                    break;
                default:
                    System.out.println("Opção inválida, tente novamente.");
            }
        }
        
        while(opcao != 5);
        
    }
    
}
