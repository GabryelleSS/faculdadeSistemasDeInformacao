package br.senac.cadastroDeDados.modelo;

public class User {
    private String tableName;
    private String tablephone;
    
    public String getName() {
        return tableName;
    }
    
    public void setName(String tableName) {
        this.tableName = tableName;
    }
    
    public String getTelephone() {
        return tablephone;
    }
    
    public void setTelephone(String tablephone) {
        this.tablephone = tablephone;
    }
}
