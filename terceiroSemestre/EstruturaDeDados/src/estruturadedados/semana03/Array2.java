/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package estruturadedados.semana03;

import estruturadedados.semana03.Metodos;

/**
 *
 * @author Gerson
 */
public class Array2 {

    static final int MAX = 30;

    public static void main(String[] args) {
        int[] v = new int[MAX];
        //Populando o array
        Metodos.popular(v);
        //Exibindo array
        Metodos.exibir(v);
        //Ordenar o array
        //Selection sort
        Metodos.selection(v);
        //Exibe array ordenado
        System.out.println("=== Array Ordenado ===");
        Metodos.exibir(v);
        //Realiza a busca
        
        System.out.println("=== Busca Binaria ===");
        System.out.println(Metodos.buscaBinaria(v, 5, 0, v.length - 1));
        
    }

}
