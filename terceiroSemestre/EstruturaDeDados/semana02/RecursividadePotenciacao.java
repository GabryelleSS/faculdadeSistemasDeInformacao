package estruturadedados.semana02;

public class RecursividadePotenciacao {
    public static void main(String[] args) {
        System.out.println(potenciacao(0, 3));
    }
    
    public static int potenciacao(int base, int expoente) {
        
        if (base == 0) {
            return 0;
        }
        else if (expoente == 0) {
            return 1;
        }
        else {
            return base * potenciacao(base, expoente - 1);
        }
    }
}
