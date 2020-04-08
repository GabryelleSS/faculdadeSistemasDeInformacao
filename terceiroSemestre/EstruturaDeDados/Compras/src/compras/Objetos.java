package compras;

public class Objetos {
    
    private static final int MAX_COMPRAS = 4;
    
    private Compras[] compras = new Compras[MAX_COMPRAS];
    private int count = 0;
    
    
    public void addPessoa(Compras compra) {
        if(count < compras.length) {
            compras[count] = compra;
            count++;
            
            System.out.println("Cadastro realizado com sucesso!");
        }
        else {
            System.out.println("Valor de cadastro excedido.");
        } 
    }
}
