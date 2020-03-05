package estruturadedados.semana02;

public class Recursividade {
    public static void main(String[] args) {
        System.out.println(fatorial(2));
    }
    
    public static int fatorial(int numero) {
        if (numero <= 1) {
            return 1;
        }
        else {
            return numero * fatorial(numero - 1);
        }
    }
}
