/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cadastrousuario;

/**
 *
 * @author gabry
 */
public class Usuario {
    private String nome;
    private int telefone;
    
    public Usuario(String nome, int tel){
        setNome(nome);
        setTelefone(tel);
    }
     
    public void setNome(String nome) {
        
        if(nome.endsWith("dj")) {
            this.nome = nome;
        }
        
    }
    
    public String getNome() {
        return nome;
    }
    
    public int getTelefone() {
        return telefone;
    }
    
    public void setTelefone(int telefone) {
        
        if(telefone > 100000000) {
            this.telefone = telefone;
        }
        
    }
}
