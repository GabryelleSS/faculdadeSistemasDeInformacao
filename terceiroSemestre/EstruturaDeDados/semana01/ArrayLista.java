package estruturadedados.semana01;

import java.util.ArrayList;

public class ArrayLista {

    public static void main(String[] args) {

        ArrayList<Integer> lista = new ArrayList();

//        lista.add(2);
//        lista.add(23);
//        lista.add(24);
        for (int i = 0; i < 4; i++) {
            lista.add(2);
        }

        for (Integer list : lista) {
            System.out.println(list);
        }

    }
}
