package escolanatacao;

import java.util.Scanner;

public class Aluno {
    
    /**
     * Classes: Aluno
     * Metodos: 
     *  - cadastrar alunos
     *      - metodo sem retorno, 
     *      - deve popular as variaveis privadas via teclado.
     *      - deve executar o metodo do relatorio.
     *      - exibe no console o retorno do relatorio.
     *  - caclular peso ideal
     *      - metodo com retorno do tipo float.
     *      - utiliza a altura e o sexo.
     *      - cada sexo deve ter uma formula diferente para calcular o peso ideal.
     *  - calcular idade 
     *      - utiliza o ano de nascimento.
     *      - faz um calculo do ano atual subtraindo a idade.
     *  - relatorio.
     *      - retorna uma string.
     *      - utiliza todas as variaveis privadas que estao populadas.
     *
     */
    
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
