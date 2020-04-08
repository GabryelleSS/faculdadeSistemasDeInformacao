package gerenciadordecompra;

public class GerenciadorDeCompra {
    
    private static final int MAX_PESSOAS = 1;
    
    private Compras[] compras = new Compras[MAX_PESSOAS];
    
    public static void main(String[] args) {
        Compras compra1 = new Compras();
        compra1.cadastrar(MAX_PESSOAS);
        compra1.info();
    }
}
