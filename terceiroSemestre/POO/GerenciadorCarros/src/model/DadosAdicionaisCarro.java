package model;

public class DadosAdicionaisCarro {
    protected int kilometragem;
    protected int tanque;

    public DadosAdicionaisCarro(int kilometragem, int tanque) {
        this.kilometragem = kilometragem;
        this.tanque = tanque;
    }

    public int getKilometragem() {
        return kilometragem;
    }

    public void setKilometragem(int kilometragem) {
        this.kilometragem = kilometragem;
    }

    public int getTanque() {
        return tanque;
    }

    public void setTanque(int tanque) {
        this.tanque = tanque;
    }
    
    
}
