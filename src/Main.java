import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("Olá! Seja bem vindo ao Twitter da ADA");
        System.out.println("=====================================");

        Scanner scanner = new Scanner(System.in);
        int numero;

        System.out.println("Para escolher a sua opção, digite o número: \n 1- login \n 2- cadastrar");
        numero = scanner.nextInt();

        if (numero == 2) {

            System.out.println("=====Cadastro de um novo usuário======");

            String usuario[] = new String[300];
            String senha [] = new String[300];

            int n = 1;


            for(int i=0; i < n; i++){

                System.out.println("Escolha seu nome de usuário: ");
                usuario[i] = scanner.nextLine();
                System.out.println("Agora escolha sua senha: ");
                senha[i] = scanner.nextLine();

            }


        }



    }
}