package estruturadedados.semana01;

import java.util.Scanner;

public class ArrayClient {
    
    public static final int TAM = 2;
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
        Client[] register = new Client[TAM];
        
        for (int i = 0; i < register.length; i++) {
            register[i] = new Client();
        }
        
        for (Client client : register) {
            System.out.println("Informe o nome do cliente:");
            client.setName(scanner.nextLine());
            
            System.out.println("Informe o telefone do cliente:");
            client.setCell(scanner.nextInt());
            scanner.nextLine();
            
            System.out.println("Informe o id do cliente:");
            client.setIdClient(scanner.nextInt());
            scanner.nextLine();
        }
        
        for (Client client : register) {
            System.out.println("Informações do cliente:");
            System.out.println(client.getName());
            System.out.println(client.getCell());
            System.out.println(client.getIdClient());
        }
        
    }
}
