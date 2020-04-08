package estruturadedados.semana01;

public class Array {
    public static void main(String[] args) {
        int[] array = new int[4];
        
        array[0] = 2;
        array[1] = 3;
        array[2] = 4;
        array[3] = 5;
        
//        for (int i = 0; i < array.length; i++) {;
//            System.out.println(array[i]);
//        }
        
        for (int n:array) {
            System.out.println(n);
        }
    }
}
