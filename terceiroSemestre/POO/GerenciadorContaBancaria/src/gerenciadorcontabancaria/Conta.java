package gerenciadorcontabancaria;

public class Conta {
    private int numero;
    private float saldo;
    private String cpf;
    
    public Conta(int numero, String cpf) {
        this.numero = numero;
        this.cpf = cpf;
        this.saldo = 0;
    }
    
    public boolean saque(double valor) {
        if (saldo >= valor) {
            saldo -= valor;
            return true;
        }
        return false;
    }
    
    public boolean deposito(double valor) {
        saldo += valor;
        return true;
    }
}
