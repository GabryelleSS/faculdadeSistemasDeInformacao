package bancodedados;

public class Medico extends Pessoa {
    private int crm;
    private String especialidade;
    private Paciente[] pacientes;
    
    public Medico(String nome, String cpf, String rua) {
        super(nome, cpf, rua);
        this.crm = crm;
        this.especialidade = especialidade;
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("CRM: " + this.getCrm());
        System.out.println("Especialização: " + this.getEspecialidade());
    }
    
    public int getCrm() {
        return crm;
    }
    
    public String getEspecialidade() {
        return especialidade;
    }
    
    public void setCrm(int crm) {
        this.crm = crm;
    }
    
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
