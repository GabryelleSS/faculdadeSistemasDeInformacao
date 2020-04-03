package bancodedados;

public class Secretaria extends Pessoa {
    
    private String departamento;
    private int ramal;
    
    public Secretaria(String nome, String cpf, String rua) {
        super(nome, cpf, rua);
    }
    
    @Override
    public void info() {
        super.info();
        System.out.println("Departamento: " + this.getDepartamento());
        System.out.println("Ramal: " + this.getRamal());
    }
    
    public String getDepartamento() {
        return departamento;
    }
    
    public int getRamal() {
        return ramal;
    }
    
    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }
    
    public void setRamal(int ramal) {
        this.ramal = ramal;
    }
}
