package bancodedados;

import java.util.Scanner;

public class BancoDeDados {
    private static final int MAX_PESSOAS = 1000;
    
    private Pessoa[] pessoas = new Pessoa[MAX_PESSOAS];
    private int count = 0;
    
    public void addPessoa(Pessoa pessoa) {
        if(count < pessoas.length) {
            pessoas[count] = pessoa;
            count++;
            
            System.out.println("Cadastro realizado com sucesso!");
        }
        else {
            System.out.println("Valor de cadastro excedido.");
        } 
    }
}
