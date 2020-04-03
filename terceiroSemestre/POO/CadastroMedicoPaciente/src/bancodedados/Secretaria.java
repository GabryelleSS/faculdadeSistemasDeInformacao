package bancodedados;

import java.util.Scanner;

public class Secretaria extends Pessoa {
    Scanner scanner = new Scanner(System.in);
    
    private String departamento;
    private int ramal;
    
    @Override
    public void cadastrar() {
        System.out.println("===== Cadastro da secretaria =====");
        super.cadastrar();
        
        super.questionario("Qual é o ramal");
        ramal = scanner.nextInt();
        
        super.questionario("Qual é o departamento");
        departamento = scanner.nextLine();
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
