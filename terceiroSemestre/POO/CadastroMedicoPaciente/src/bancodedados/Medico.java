package bancodedados;

public class Medico {
    private String crm;
    private String especialidade;
    
    public Medico(String crm, String especialidade) {
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
