package bancodedados;

public class Medico extends Pessoa {
    private String crm;
    private String especialidade;
    
    public Medico(String nome, String cpf, String rua, String numero, String cep, String cidade, String estado) {
        super(nome, cpf, rua, numero, cep, cidade, estado);
        this.crm = crm;
        this.especialidade = especialidade;
    }
    
    public void info() {
        System.out.println("CRM: " + this.getCrm());
        System.out.println("Especialidade: " + this.getEspecialidade());
    }
    
    public String getCrm() {
        return crm;
    }
    
    public String getEspecialidade() {
        return especialidade;
    }
    
    public void setCrm(String crm) {
        this.crm = crm;
    }
    
    public void setEspecialidade(String especialidade) {
        this.especialidade = especialidade;
    }
}
