/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedados.semana03;

/**
 *
 * @author Gerson
 */
public class Metodos {

    /**
     * Insere valores aleatórios no array
     *
     * @param v int[]
     */
    public static void popular(int[] v) {

        for (int i = 0; i < v.length; i++) {
            v[i] = (int) (Math.random() * 10);
        }
    }

    /**
     * Exibe o conteúdo do array
     *
     * @param v int[]
     */
    public static void exibir(int[] v) {

        for (int i = 0; i < v.length; i++) {
            System.out.println("v[" + i + "]=" + v[i]);
        }
    }

    /**
     * Ordenação do array pelo método da seleção
     *
     * @param v int[]
     */
    public static void selection(int[] v) {
        int min;
        int aux;
        for (int i = 0; i < v.length - 1; i++) {
            min = i;
            for (int j = 1 + i; j < v.length; j++) {
                if (v[min] > v[j]) {
                    min = j;
                }
            }
            aux = v[min];
            v[min] = v[i];
            v[i] = aux;
        }
    }
    /**
     * Método de busca binária
     * @param v
     * @param b
     * @param inicio
     * @param fim
     * @return 
     */
    
    public static int buscaBinaria(int[] v, int valorBusca, int inicio, int fim) {
        int central;
        while (fim >= inicio) {
            central = (fim + (inicio) / 2);
            
            if (v[central] == valorBusca) {
                return central;
            }
            else if (valorBusca > v[central]) {
                inicio = central + 1;
            }
            else {
                fim = central - 1;
            }
        }
        
        return -1;
    }
    
    public static int buscaBinariaRecursiva(int[] v, int valorBusca, int inicio, int fim) {
        int central;
        
        if (fim >= inicio) {
            central = (fim + inicio) / 2;
            
            if (v[central] == valorBusca) {
                return central;
            }
            else if (valorBusca > v[central]) {
                return buscaBinariaRecursiva(v, valorBusca, central + 1, fim);
            }
            else {
                return buscaBinariaRecursiva(v, valorBusca, central - 1, fim);
            }
        }
        
        return -1;
    }
}
