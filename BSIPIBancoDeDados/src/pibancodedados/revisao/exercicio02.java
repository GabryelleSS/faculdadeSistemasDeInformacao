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
public class exercicio02 {
    public static void main(String[] args) {
        Scanner src = new Scanner(System.in);
        
        String name;
        int age;
        
        System.out.println("Olá, qual é o seu nome?");
        name = src.nextLine();
        System.out.println(name + ", quanto anos voce tem?");
        age = src.nextInt();
        
        System.out.println(permissoesLegais(name, age));
    }
    
    public static String permissoesLegais(String name, int age) {
        Boolean dirigir;
        Boolean beber;
        Boolean votoFacultativo;
        Boolean votoObrigatorio;
        String permissoes;
        
        if(age >= 18) {
            dirigir = true;
        }
        else {
            dirigir = false;
        }
        
        if(age >= 18) {
            beber = true;
        }
        else {
            beber = false;
        }
        
        if(age >= 16 && age < 18 && age >= 70) {
            votoFacultativo = true;
        }
        else {
            votoFacultativo = false;
        }
        
        if(age >= 18 && age < 70) {
            votoObrigatorio = true;
        }
        else {
            votoObrigatorio = false;
        }
        
        permissoes = "Dirigir: " + dirigir + ". " + 
                     "Beber: " + beber + ". " + 
                    "Voto Facultativo: " + votoFacultativo + ". " + 
                    "VotoObrigatorio: " + votoObrigatorio ;
        
        return permissoes;
    }
}
