package compras;

public class GerenciadorDeCompras {
    
    public static void main(String[] args) {
        Compras compra = new Compras();
        compra.cadastrar();
        compra.info();
        
        Compras compra2 = new Compras();
        compra2.cadastrar();
        compra2.info();
        
        Compras compra3 = new Compras();
        compra3.cadastrar();
        compra3.info();
        
        Compras compra4 = new Compras();
        compra4.cadastrar();
        compra4.info();
        
        float valor1 = compra.valorTotal();
        float valor2 = compra2.valorTotal();
        float valor3 = compra3.valorTotal();
        float valor4 = compra4.valorTotal();
        
        float resultado =  valor1 + valor2 + valor3 + valor4;
        
        System.out.println("===== Valor total: " + resultado + " =====");
    }
}
