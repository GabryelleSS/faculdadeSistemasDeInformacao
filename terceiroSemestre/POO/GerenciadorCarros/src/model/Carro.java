package model;

public class Carro extends DadosAdicionaisCarro {

    protected String marca;
    protected String modelo;
    protected int ano;
    protected String placa;
    protected String tipoCarro;
    protected int disponibilidadeLocacao;

    public Carro(String marca, String modelo, int ano, String placa, String tipoCarro, int disponibilidadeLocacao, int quilometragem, String tanque) {
        super(quilometragem, tanque);
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
        this.placa = placa;
        this.tipoCarro = tipoCarro;
        this.disponibilidadeLocacao = disponibilidadeLocacao;
    }

    public Carro() {
        
    }

    public Carro(int quilometragem, String tanque) {
        super(quilometragem, tanque);
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public String getTipoCarro() {
        return tipoCarro;
    }

    public void setTipoCarro(String tipoCarro) {
        this.tipoCarro = tipoCarro;
    }

    public int getDisponibilidadeLocacao() {
        return disponibilidadeLocacao;
    }

    public void setDisponibilidadeLocacao(int disponibilidadeLocacao) {
        this.disponibilidadeLocacao = disponibilidadeLocacao;
    }
    
}
