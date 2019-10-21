/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_parte2;

import java.util.Random;

/**
 *
 * @author dionathan.nakamura
 */
public class Ex8 {
    public static void inverter(int[] v, int n) {
        int i,j,x;
        j = n;

        for (i = 0; i < n/2; i++) {
            j--;
            x    = v[i];
            v[i] = v[j];
            v[j] = x;
        }
    }

    public static void exercicio() {
        int n = 16;
        int[] v = new int[n];
        int i;
        Random r = new Random();

        for (i = 0; i < n; i++)
            v[i] = r.nextInt(100);

        for (i = 0; i < n; i++)
            System.out.print(v[i] + " ");

        System.out.println("");
        inverter(v,n);
        
        for (i = 0; i < n; i++)
            System.out.print(v[i] + " ");

        System.out.println("");

    }
}
