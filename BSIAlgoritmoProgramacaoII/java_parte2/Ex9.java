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
public class Ex9 {
    public static int max(int[][] v, int n, int m) {
        int i,j;
        int x = -99_999;

        for(i=0; i<n; i++)
            for(j=0; j<m; j++)
                if(v[i][j] > x)
                    x = v[i][j];

        return x;
    }

    public static void diag_principal(int[][] v, int n, int m) {
        for(int i=0; i<n; i++)
            System.out.print(v[i][i] + " ");
    }

    public static void diag_secundaria(int[][] v, int n, int m) {
        int i,j;
        j = n;

        for(i=0; i<n; i++)
            System.out.print(v[i][--j] + " ");
    }

    public static void exercicio() {
        int n = 5;
        int m = n;
        int[][] v = new int[n][m];
        int i,j;
        Random r = new Random();

        for(i=0; i<n; i++)
            for(j=0; j<m; j++)
                v[i][j] = r.nextInt(90) + 10; // 10-99

        for(i=0; i<n; i++){
            for(j=0; j<m; j++)
                System.out.print(v[i][j] + " ");

            System.out.println();
        }

        System.out.println("Max: " + max(v,n,m) );
        System.out.print("Diagonal principal: ");
        diag_principal (v,n,m);
        System.out.print("\nDiagonal secundaria: ");
        diag_secundaria(v,n,m);
        System.out.println();
    }    
}
