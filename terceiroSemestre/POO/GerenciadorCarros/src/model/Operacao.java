package model;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Operacao extends Carro {
    
    protected int idOperacao;
    protected String tipoOperacao;
    protected Carro carro;
    protected Date data;
    protected double valor;

    public Operacao(int idOperacao, String tipoOperacao, Carro carro, String data, double valor, String marca, String modelo, int ano, String placa, String tipoCarro, boolean disponibilidadeLocacao, int quilometragem, String tanque) {
        super(marca, modelo, ano, placa, tipoCarro, disponibilidadeLocacao, quilometragem, tanque);
        this.idOperacao = idOperacao;
        this.tipoOperacao = tipoOperacao;
        this.carro = carro;
        try {
            this.data = new SimpleDateFormat("dd/mm/yyyy HH:mm").parse(data);
        } catch (ParseException ex) {
            Logger.getLogger(Operacao.class.getName()).log(Level.SEVERE, null, ex);
        }
        this.valor = valor;
    }
    
    public int getIdOperacao() {
        return idOperacao;
    }

    public void setIdOperacao(int idOperacao) {
        this.idOperacao = idOperacao;
    }

    public String getTipoOperacao() {
        return tipoOperacao;
    }

    public void setTipoOperacao(String tipoOperacao) {
        this.tipoOperacao = tipoOperacao;
    }

    public Carro getCarro() {
        return carro;
    }

    public void setCarro(Carro carro) {
        this.carro = carro;
    }

    public Date getData() {
        return data;
    }

    public void setData(Date data) {
        this.data = data;
    }

    public double getValor() {
        return valor;
    }

    public void setValor(double valor) {
        this.valor = valor;
    }

}
