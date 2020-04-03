package bancodedados;

import java.util.Scanner;

public class BancoDeDados {
    private static final int MAX_PESSOAS = 1000;
    
    private Pessoa[] pessoas = new Pessoa[MAX_PESSOAS];
    private int count = 0;
    
    public void addPessoa(Pessoa pessoa) {
        if(count < pessoas.length) {
            pessoas[count] = pessoa;
            count++;
            
            System.out.println("Cadastro realizado com sucesso!");
        }
        else {
            System.out.println("Valor de cadastro excedido.");
        } 
    }
    
//    static private Scanner scanner = new Scanner(System.in);
//    
//    private static int MAX_PESSOAS = 1000;
//    private boolean busca;
//    static private int contador = 0;
//    static Pessoa novaPessoa;
//    
//    static String nome;
//    static String cpf;
//    static String rua;
//    static String cep;
//    static String cidade;
    
//    public static void main(String[] args) {
//        Scanner scanner = new Scanner(System.in);
//        
//        System.out.println("===== Bem Vindo =====");
//        
//        System.out.println("Informe o que vocÊ gostaria de fazer de acordo com as opções abaixo:");
//        System.out.println("1 - Cadastrar paciente");
//        System.out.println("2 - Cadastrar medico");
//        System.out.println("3 - Remover um cadastro");
//        int opcao = scanner.nextInt();
//        
//        if (opcao == 1) {
//            Pessoa paciente = new Paciente(nome, cpf, rua, cep, cidade);
//            
//            addPessoa(paciente);           
//            
//        }
//        else if (opcao == 2) {
//            Pessoa medico = new Medico(nome, cpf, rua, cep, cidade);
//            
//            addPessoa(medico); 
//        }
//        else if (opcao == 3) {
//            System.out.println("Informe o CPF:");
//            String cpfRemover = scanner.nextLine();
//            
//            removePessoa(cpfRemover);
//        }
//        else {
//            System.out.println("Digite uma opção válida.");
//        }
//    }
    
    
    
//    static public void removePessoa(String cpf) {;
//        if (busca(cpf) == true) {
//            System.out.println("Registro apagado.");
//        }
//        else {
//            System.out.println("Registro não encontrado.");
//        }
//    }
//    
//    static public boolean busca(String cpf) {
//        for (int i = 0; i <= pessoas.length; i++) {
//            if(cpf == pessoas[i].getCPF()) {
//                pessoas[i] = null;
//                return true;
//            }
//        }
//        return false;
//    } 
    
}
