package arraydesimplesprecisao;

import java.util.Random;
import java.util.Scanner;

public class ArrayDeSimplesPrecisao {
    
    private static int QUANTIDADE = 5;
    
    public static void main(String[] args) {
        
        float array[] = new float[QUANTIDADE];
        
        for(int i = 0; i < array.length; i++) {
            Random random = new Random();
            int numbAleatorio = random.nextInt(201);
            
            array[i] = numbAleatorio;
        }
        
        printArray("Array desordenado", array);
        insertionSort(array);
        
    }
    
    public static void insertionSort(float[] array) {
        int i, j;
        float key;
        
        for(j = 1; j < array.length; j++) {
            key = array[j];
            for(i = j - 1; (i >= 0) && (array[i] > key); i--) {
                array[i + 1] = array[i];
            }
            array[i + 1] = key;
        }
        
        printArray("Array ordenado", array);
        System.out.println(searchNumber(array)); 
        System.out.println(removeValue(array));
        printArray("Array ordenado", array);
    }
    
    public static void printArray(String title, float[] array) {
        System.out.println("===== " + title + " =====");
        
        for(int k = 0; k < array.length; k++) {
            System.out.println(array[k]);
        }
    }
    
    public static String searchNumber(float[] array) {
        Scanner scanner = new Scanner(System.in);
        
        boolean valueFound;
        
        System.out.println("Qual número deseja encontrar?");
        float numberSearched = scanner.nextFloat();
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] == numberSearched) {
                return "Número " + numberSearched + " encontrado na posição " + i;
            }
        }
        
        return "-1";
    }
    
    public static String removeValue(float[] array) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.println("Qual número deseja remover?");
        float numberRemove = scanner.nextFloat();
        
        for(int i = 0; i < array.length; i++) {
            if(array[i] == numberRemove) {
                array[i] = 0;
                return "Número " + numberRemove + " foi removido da posição " + i;
            }
        }
        
        return "Não foi possivel encontrar o número";
    } 
    
}
