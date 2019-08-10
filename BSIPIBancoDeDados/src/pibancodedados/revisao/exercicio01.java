/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pibancodedados.revisao;

import java.util.Scanner;

/**
 *
 * @author gabry
 */
public class exercicio01 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        int nota01;
        int nota02;
        int nota03;

        System.out.println("Digite a nota");
        nota01 = src.nextInt();
        System.out.println("Digite a nota");
        nota02 = src.nextInt();
        System.out.println("Digite a nota");
        nota03 = src.nextInt();
        
        System.out.println(mediaDeNotas(nota01, nota02, nota03));
    }
    
    public static String mediaDeNotas(int nota01, int nota02, int nota03) {
        int calculoDasNotas;
        String mediaDasNotas;
        
        calculoDasNotas = (nota01 + nota02 + nota03) / 3;
        mediaDasNotas = "A media das notas é: " + calculoDasNotas;
        
        return mediaDasNotas;
    }
}
