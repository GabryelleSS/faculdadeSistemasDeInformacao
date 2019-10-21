/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package java_parte1;

import java.util.Scanner;

/**
 *
 * @author dionathan.nakamura
 */
public class Ex2 {

    public static void exercicio() {
        Scanner s = new Scanner(System.in);
        int n;

        do {
            System.out.print("Digite o segredo: ");
            n = s.nextInt();
        } while (n != 42);

        System.out.println("Acertou!!!");
    }
}
