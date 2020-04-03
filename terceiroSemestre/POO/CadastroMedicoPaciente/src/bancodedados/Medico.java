package bancodedados;

import java.util.Scanner;

public class Medico extends Pessoa {
    Scanner scanner = new Scanner(System.in);
    
    private int crm;
    private String especialidade;
    private Paciente[] pacientes;
    
    @Override
    public void cadastrar() {
        System.out.println("===== Cadastro do medico =====");
        super.cadastrar();
        
        super.questionario("Informe o CRM:");;
        crm = scanner.nextInt();
        setCrm(crm);
        
        scanner.nextLine();
        
        super.questionario("Informe a especialidade:");;
        especialidade = scanner.nextLine();
        setEspecialidade(especialidade);
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
