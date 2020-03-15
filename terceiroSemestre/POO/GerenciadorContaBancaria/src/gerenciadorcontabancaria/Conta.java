package gerenciadorcontabancaria;

public class Conta {
    private int numeroContaCorrente;
    private float saldo;
    private String cpfTitular;
    
    public static void main(String[] args, int numeroContaCorrente, String cpfTitular) {
        System.out.println("===== Conta Bancaria =====");
        
    }
    
    boolean saque(float valor) {
        
        if (valor <= saldo) {
            System.out.println("Saque de " + valor + " realizado com sucesso!");
            return true;
        }
        else {
            System.out.println("Não foi possivel realizar o saque, valor excedido");
            return false;
        }
        
    }
    
    boolean deposito(float valor) {
        
        if (valor > 0) {
            saldo += valor;
            System.out.println("Saque realizado com sucesso!");

            return true;
        }
        else {
            System.out.println("Não foi possivel realizar o deposito, tente novamente");
            return false;
        }
        
    }
}
