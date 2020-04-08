package estruturadedados.semana02;

public class OrdenaArray {
    
    // final: simboliza uma constante.
    // Em Java as constante devem estar em uppercase.    
    static final int TAMANHO_ARRAY = 10;
    
    public static void main(String[] args) {
        
        int[] array = new int[TAMANHO_ARRAY];
        
        
        Metodos.addNumerosArray(array);
        System.out.println("======= ARRAY DESORDENADO =======");
        Metodos.exibiArray(array);
        
        System.out.println("======= ARRAY ORDENADO =======");
        Metodos.ordenaArray(array);
        Metodos.exibiArray(array);
        
    }
}
