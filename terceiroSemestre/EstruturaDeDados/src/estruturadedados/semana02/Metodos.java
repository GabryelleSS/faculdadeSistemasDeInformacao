package estruturadedados.semana02;

public class Metodos {
    /**
     * Popular os valores aleatorios dentro do array
     * @param array 
     */
    public static void addNumerosArray(int[] array) {
        for (int i = 0; i < array.length; i++) {
            array[i] = (int)(Math.random() * 101);
        }
    }
    
    /**
     * Exibir o conteudo populado no array
     * @param array 
     */
    public static void exibiArray(int[] array) {
//        For Aprimorado:
//        for (int el:array) {
//            System.out.println(el);
//        }
        
        for (int i = 0; i < array.length; i++) {
            System.out.println(array[i]);
        }
    }
    
    /**
     * Ordena array - Selection Sort
     * @param array 
     */
    public static void ordenaArray(int[] array) {
        int min;
        int aux;
        // Colocamos a subtração, pois o i se inicia em zero        
        for (int i = 0; i < array.length - 1; i++) {
            min = i;
            for (int j = 1 + i; j < array.length; j++) {
                if (array[min] > array[j]) {
                    min = j;
                }
            }
            
            // Realiza a troca
            aux = array[min];
            array[min] = array[i];
            array[i] = aux;
        }
    }
    
}
