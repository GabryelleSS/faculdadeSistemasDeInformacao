package estruturadedados.semana02;

public class RecursividadeTriangular {
    public static void main(String[] args) {
        System.out.println(numerosTriangulares(6));
    }
    
    public static int numerosTriangulares(int numero) {
        if (numero == 1) {
            return 1;
        }
        else {
            return numero + numerosTriangulares(numero - 1);
        }
    }
}
