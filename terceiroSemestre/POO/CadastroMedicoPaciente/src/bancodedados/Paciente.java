package bancodedados;

public class Paciente extends Pessoa {
    
    private Medico medico;
    
    @Override
    public void cadastrar() {
        System.out.println("===== Cadastro do paciente =====");
        super.cadastrar();
        
        medico = new Medico();
        medico.cadastrar();
    }
    
    @Override
    public void info() {
        super.info();
        
        System.out.println("O médico responsavel pelo paciente " + nome + " é " + medico.getNome());
    }
    
}
