/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package aula3;

import java.util.Scanner;

/**
 *
 * @author antonio.hpselvatici
 */
public class Cliente {
    private String nome;
    private String cpf;
    private int numero;
    
    public void cadastrar() {
        Scanner s = new Scanner(System.in);
        System.out.println("Qual é o seu nome?");
        nome = s.nextLine();
        System.out.println("Qual é o seu cpf?");
        cpf = s.nextLine();
    }
    
    public String getCpf() {
        return cpf;
    }
    
}
