package bancodedados;

public class Paciente extends Pessoa {
    
    private Medico metico;
    
    public Paciente(String nome, String cpf, String rua) {
        super(nome, cpf, rua);
    }
    
}
