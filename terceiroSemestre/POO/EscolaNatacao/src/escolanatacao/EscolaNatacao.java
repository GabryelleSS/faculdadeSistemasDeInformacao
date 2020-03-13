package escolanatacao;

public class EscolaNatacao {
    
    // O static torna a variavel como atributo de classe.
    private static int QUANT_ALUNO = 2;
    private static Aluno[] novoAluno = new Aluno[QUANT_ALUNO];
    private static int indiceAluno = 0;
    
    static void cadastarNovoAluno() {
        
        if (indiceAluno >= novoAluno.length) {
            System.out.println("Limite excedido!");
        }
        else {
            Aluno aluno = new Aluno();
            aluno.cadastrarAluno();
            Aluno aluno2 = aluno;
            
            novoAluno[indiceAluno] = aluno;
            indiceAluno++;
            
        }
        
    }

    public static void main(String[] args) {
        
        Aluno aluno = new Aluno();
        
        System.out.println("Cadastre um aluno:");
        cadastarNovoAluno();
    
    }
    
}
