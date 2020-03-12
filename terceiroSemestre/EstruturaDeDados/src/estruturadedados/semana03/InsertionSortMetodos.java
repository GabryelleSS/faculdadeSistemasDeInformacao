package estruturadedados.semana03;

public class InsertionSortMetodos {
    
    /**
     * Insere os valores no vetor.
     * @param array 
     */
    public static void populaArray(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            array[i] = (int) (Math.random() * 10);
        }
        
    }
    
    /**
     * Exibe no console o array desordenado.
     * @param array 
     */
    public static void exibeArray(int[] array) {
        
        for (int i = 0; i < array.length; i++) {
            System.out.println("vetor[" + i + "] = " + array[i]);
        }
        
    }
    
    /**
     * Ordena o array.
     * @param array 
     */
    public static void selection(int[] array) {
        
        int min, aux;
        
        for (int i = 0; i < array.length - 1;i++) {
            min = i;
            
            for (int j = i + 1; j < array.length;j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            
            aux = array[min];
            array[min] = array[i];
            array[i] = aux;
        }
        
    }
    
}
