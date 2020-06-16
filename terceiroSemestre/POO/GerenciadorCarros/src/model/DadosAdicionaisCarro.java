package model;

public class DadosAdicionaisCarro {
    protected int quilometragem;
    protected String tanque;

    public DadosAdicionaisCarro(int quilometragem, String tanque) {
        this.quilometragem = quilometragem;
        this.tanque = tanque;
    }

    public DadosAdicionaisCarro() {
    }

    public int getQuilometragem() {
        return quilometragem;
    }

    public void setQuilometragem(int quilometragem) {
        this.quilometragem = quilometragem;
    }

    public String getTanque() {
        return tanque;
    }

    public void setTanque(String tanque) {
        this.tanque = tanque;
    }
    
    
}
