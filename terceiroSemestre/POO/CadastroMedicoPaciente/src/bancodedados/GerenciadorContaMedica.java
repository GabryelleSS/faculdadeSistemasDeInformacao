package bancodedados;

public class GerenciadorContaMedica {
    public static void main(String[] args) {
        Pessoa p = new Medico();
        p.cadastrar();
        p.info();
        
        Pessoa p2 = new Paciente();
        p2.cadastrar();
        p2.info();
        
        Pessoa p3 = new Secretaria();
        p3.cadastrar();
        p3.info();
    }
}
