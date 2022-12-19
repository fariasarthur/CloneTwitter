import java.net.SocketImpl;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        System.out.println("=====================================");
        System.out.println("Olá! Seja bem vindo ao Twitter da ADA");
        System.out.println("=====================================");

        Scanner scanner = new Scanner(System.in);

        Calendar c = Calendar.getInstance();
        int numero;
        String user;
        String pass;

        System.out.println("Para escolher a sua opção, digite o número: \n 1- login \n 2- cadastrar");
        numero = scanner.nextInt();

        if (numero == 2) {

            System.out.println("=====Cadastro de um novo usuário======");

            String usuario[] = new String[300];
            String senha [] = new String[300];

            int n = 1;


            for(int i=0; i < n; i++){

                System.out.println("Escolha seu nome de usuário: ");
                usuario[i] = scanner.next();

                System.out.println("Agora escolha sua senha: ");
                senha[i] = scanner.next();

                System.out.println("Cadastro realizado sucesso!!");

                System.out.println("Para logar digite seu usuário ");
                user = scanner.next();

                System.out.println("Olá @"+ user + "!! Agora digite a sua senha: ");
                pass = scanner.next();

                int numeroEscolhido;
                if((usuario[i].equals(user)) && (senha[i].equals(pass))) {
                    System.out.println("Login realizado com sucesso!");

                    String tweet[] = new String[300] ;
                    Date date = new Date();
                    SimpleDateFormat formatar = new SimpleDateFormat("dd/MM/yy H:m:s");
                    String dataFormatada = formatar.format(date);

                    do {
                        System.out.println("Selecione uma opção \n 1- Timeline \n 2- Tweetar \n 3- Sair");
                        numeroEscolhido = scanner.nextInt();


                        if (numeroEscolhido == 2) {

                            System.out.println("O que você está pensando ?");
                            tweet[i] = scanner.next();
                            dataFormatada = formatar.format(date);

                        }

                        if (numeroEscolhido == 1) {

                            if (tweet == null) {
                                System.out.println("Sua Timeline está vazia, se liga ein? ");
                            } else if ((tweet != null) && (dataFormatada != null)) {

                                System.out.println(dataFormatada + " " + tweet[i]);


                            }
                        }

                    }while(numeroEscolhido != 3);
                    System.out.println("XXXXXXX Bye bye até a próxima XXXXXXX ");


                }else{

                    System.out.println("Erro no login! ");


                }


            }

        }else {
            System.out.println("Você ainda não possui login! ");


        }

    }

}




