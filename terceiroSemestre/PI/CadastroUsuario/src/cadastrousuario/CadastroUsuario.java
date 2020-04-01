package cadastrousuario;

public class CadastroUsuario {
    
    public static void main(String[] args) {
        Usuario user = new Usuario("o dj", 111111111);
        Usuario user2 = new Usuario();
        
        user.setNome("dj");
//        user.nome = "dj";
        user.setTelefone(11111);
        
        System.out.println("Nome: " + user.getNome());
//        System.out.println("Telefone: "+user.getTelefone());
//        System.out.println("Nome2: "+user2.getNome());
        
    }
    
}
