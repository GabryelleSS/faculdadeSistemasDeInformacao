/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_parte1;

import java.util.Random;

/**
 *
 * @author dionathan.nakamura
 */
public class Ex3 {
    public static void exercicio() {
        int i, x;
        Random aleatorio = new Random();

        for (i = 0; i < 100; i++) {
            x = 1 + aleatorio.nextInt(10);
            System.out.println(x);
        }
    }
}
