package estruturadedados.semana03;

public class InsertionSort {
    
    static final int MAX = 5;
    
    public static void main(String[] args) {
        int[] array = new int[MAX];
        
        InsertionSortMetodos.populaArray(array);
        System.out.println("=== Array Desordenado ===");
        InsertionSortMetodos.exibeArray(array);
        
        System.out.println("=== Array Desordenado ===");
        InsertionSortMetodos.selection(array);
        InsertionSortMetodos.exibeArray(array);
        
        System.out.println("=== Insertion Sort ===");
    }
}
