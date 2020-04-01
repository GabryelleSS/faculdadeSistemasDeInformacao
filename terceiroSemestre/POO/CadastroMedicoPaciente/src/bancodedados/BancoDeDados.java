package bancodedados;

import java.util.Scanner;

public class BancoDeDados {
    Scanner scanner = new Scanner(System.in);
    
    private static int MAX_PESSOAS = 1000;
    private boolean busca;
    private Pessoa[] pessoas = new Pessoa[MAX_PESSOAS];
    private int contador = 0;
    Pessoa novaPessoa;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===== Bem Vindo =====");
        
        System.out.println("Informe o que vocÊ gostaria de fazer de acordo com as opções abaixo:");
        System.out.println("1 - Cadastrar paciente");
        System.out.println("2 - Cadastrar medico");
        System.out.println("3 - Remover um cadastro");
        int opcao = scanner.nextInt();
        
        if (opcao == 1) {
            
        }
        else if (opcao == 2) {
            
        }
        else if (opcao == 3) {
            
        }
        else {
            System.out.println("Digite uma opção válida.");
        }
    }
    
    public void addPessoa(Pessoa pessoa) {
        if(contador >= pessoas.length) {
            System.out.println("Limite excedido");
        }
        else {
            System.out.println("Informe o nome da pessoa:");
            String nome = scanner.nextLine();
            
            System.out.println("Informe o cpf da pessoa:");
            String cpf = scanner.nextLine();
            
            System.out.println("Informe o rua da pessoa:");
            String rua = scanner.nextLine();
            
            System.out.println("Informe o numero da pessoa:");
            String numero = scanner.nextLine();
            
            System.out.println("Informe o cep da pessoa:");
            String cep = scanner.nextLine();
            
            System.out.println("Informe o cidade da pessoa:");
            String cidade = scanner.nextLine();
            
            System.out.println("Informe o estado da pessoa:");
            String estado = scanner.nextLine();
            
            novaPessoa = new Pessoa(nome, cpf, rua, numero, cep, cidade, estado);
            pessoas[contador] = novaPessoa;
            
            contador++;
        } 
    }
    
    public void removePessoa(String cpf) {
        if (busca(cpf) == true) {
            System.out.println("Registro apagado.");
        }
        else {
            System.out.println("Registro não encontrado.");
        }
    }
    
    public boolean busca(String cpf) {
        for (int i = 0; i <= pessoas.length; i++) {
            if(cpf == pessoas[i].getCPF()) {
                pessoas[i] = null;
                return true;
            }
        }
        return false;
    } 
    
}
