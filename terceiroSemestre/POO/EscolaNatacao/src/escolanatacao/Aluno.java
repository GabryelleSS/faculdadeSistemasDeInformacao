package escolanatacao;

import java.util.Scanner;

public class Aluno {
    
    private String nome;
    private char sexo;
    private float altura;
    private float peso;
    private int anoNascimento;
    
    int anoAtual = 2020;
    String textoRelatorio;
    
    void cadastrarAluno() {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Digite o nome do aluno:");
        nome = scanner.nextLine();
        
        System.out.println("Digite o sexo do aluno:");
        sexo = scanner.nextLine().toUpperCase().charAt(0);
        
        System.out.println("Digite a altura do aluno:");
        altura = scanner.nextFloat();
        scanner.nextLine();
        
        System.out.println("Digite o peso do aluno:");
        peso = scanner.nextFloat();
        scanner.nextLine();

        System.out.println("Digite o ano de nascimento do aluno:");
        anoNascimento = scanner.nextInt();
        scanner.nextLine();
        
        System.out.println(relatorio());
        
//        float pesoIdeal = calcularPesoIdeal();
//        System.out.println("O peso ideal é " + pesoIdeal);
    }
    
    float calcularPesoIdeal() {
        if(sexo == 'M') {
            return 72.7f * altura - 58;
        }
        else if(sexo == 'F') {
            return 62.1f * altura - 44.7f;
        }
        else {
            return -1;
        }
    }
    
    String relatorio() {
        
        textoRelatorio = 
                "Dados do aluno: " + nome +
                "\n - Sexo: " + sexo + 
                "\n - Altura: " + altura + 
                "\n - Peso: " + peso + 
                "\n - Ano de Nascimento: " + anoNascimento + 
                "\n - Idade: " + calcularIdade() + 
                "\n - Peso ideal: " + calcularPesoIdeal();   
        
        return textoRelatorio;
    }
    
    int calcularIdade() {
        return anoAtual - anoNascimento;
    }
    
    
    
}
