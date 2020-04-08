package estruturadedados.semana03;

public class SelectionSort {
    public static final int TAM_VETOR = 5;
    
    public static void main(String[] args) {
        
        int[] vetor = new int[TAM_VETOR];
        
        selectionSort(vetor);
        
    }
    
    public static void selectionSort(int vetor[]) {
        
        int i, j, min, aux;
        
        for (i = 0; i < vetor.length; i++) {
            min = i;
            
            for (j = i + 1; j < vetor.length; j++) {
                if (vetor[j] < vetor[min]) {
                    min = j;
                }
            }
            
            aux = vetor[i];
            vetor[i] = vetor[min];
            vetor[min] = aux;
        }        
    }
}
