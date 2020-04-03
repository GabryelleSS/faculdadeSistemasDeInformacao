package bancodedados;

public class GerenciadorContaMedica {
    public static void main(String[] args) {
        Pessoa p = new Medico("Carla", "1234", "Rua Abiguaiu, 231");
        Pessoa p2 = new Paciente("Jose", "8465", "Rua Pinheiros, 8456");
        Pessoa p3 = new Secretaria("Rodrigo", "51", "Rua Morada, 1");
        
        System.out.println("Informação do medico:");
        p.info();
        
        System.out.println("========================");
        
        System.out.println("Informação do paciente:");
        p2.info();
        
        System.out.println("========================");
        
        System.out.println("Informação dos funcionarios da secretaria:");
        p3.info();
    }
}
