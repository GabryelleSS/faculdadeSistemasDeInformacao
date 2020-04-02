package bancodedados;

import java.util.Scanner;

public class BancoDeDados {
    static private Scanner scanner = new Scanner(System.in);
    
    private static int MAX_PESSOAS = 1000;
    private boolean busca;
    static private Pessoa[] pessoas = new Pessoa[MAX_PESSOAS];
    static private int contador = 0;
    static Pessoa novaPessoa;
    
    static String nome;
    static String cpf;
    static String rua;
    static String numero;
    static String cep;
    static String cidade;
    static String estado;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("===== Bem Vindo =====");
        
        System.out.println("Informe o que vocÊ gostaria de fazer de acordo com as opções abaixo:");
        System.out.println("1 - Cadastrar paciente");
        System.out.println("2 - Cadastrar medico");
        System.out.println("3 - Remover um cadastro");
        int opcao = scanner.nextInt();
        
        if (opcao == 1) {
            Pessoa paciente = new Paciente(nome, cpf, rua, cep, cidade);
            
            addPessoa(paciente);           
            
        }
        else if (opcao == 2) {
            Pessoa medico = new Medico(nome, cpf, rua, cep, cidade);
            
            addPessoa(medico); 
        }
        else if (opcao == 3) {
            
        }
        else {
            System.out.println("Digite uma opção válida.");
        }
    }
    
    static public void addPessoa(Pessoa pessoa) {
        if(contador >= pessoas.length) {
            System.out.println("Limite excedido");
        }
        else {
            System.out.println("Informe o nome da pessoa:");
            nome = scanner.nextLine();
            
            System.out.println("Informe o cpf da pessoa:");
            cpf = scanner.nextLine();
            
            System.out.println("Informe o rua da pessoa:");
            rua = scanner.nextLine();
            
            System.out.println("Informe o numero da pessoa:");
            numero = scanner.nextLine();
            
            System.out.println("Informe o cep da pessoa:");
            cep = scanner.nextLine();
            
            System.out.println("Informe o cidade da pessoa:");
            cidade = scanner.nextLine();
            
            System.out.println("Informe o estado da pessoa:");
            estado = scanner.nextLine();
            
            novaPessoa = new Pessoa(nome, cpf, rua, cep, cidade);
            pessoas[contador] = novaPessoa;
            
            contador++;
            
            System.out.println("Cadastro realizado com sucesso!");
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
