import java.util.InputMismatchException;
import java.util.Scanner;

public class teste {

    private int qtDiscos;
    private int tamanhoMax;
    private String sequenciaPares[] = {"1-->2", "2-->3", "3-->1"};//para pares
    private int indexPar;
    private int indexImpar;
    private String sequenciaImpares[] = {"1-->3", "1-->2", "3-->2"};//paraimapres

    public void lerDados() {
        System.out.println("Digite a quantidade de  discos");
        Scanner rc = new Scanner(System.in);
        try{
         qtDiscos = rc.nextInt();
        }catch(InputMismatchException e){
            System.out.println("Amigão é fácil,digite o numero de discos em inteiros por favor!");
            lerDados();
        }
        tamanhoMax = (int) Math.pow(2, qtDiscos) - 1;

    }
    public void hanoi() {

        if (qtDiscos % 2 == 0) {
          sequenciaPares  = new String[]{"1--->2", "2--->3", "3--->1"};//para pares
          sequenciaImpares =new String[]{"1--->3", "1--->2", "3--->2"};//para impares
        }else{
          sequenciaPares  = new String[]{"1--->3", "3--->2", "2--->1"};//para pares
          sequenciaImpares =new String[]{"1--->2", "1--->3", "2--->3"};//para impares
        }
         for (int i = 0; i < tamanhoMax; i++) {
                if (i % 2 == 0) {
                    if (indexPar > 2) {
                        indexPar = 0;
                    }
                    System.out.println(sequenciaPares[indexPar]);
                    indexPar++;
                } else {
                    if (indexImpar > 2) {
                        indexImpar = 0;
                    }
                     System.out.println(sequenciaImpares[indexImpar]);
                    indexImpar++;
                }
          
            }
    }
    public static void main(String[] args) {
        teste h = new teste();
        h.lerDados();
        h.hanoi();
    }
}