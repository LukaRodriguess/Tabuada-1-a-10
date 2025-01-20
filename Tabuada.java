import java.util.Scanner;

public class Tabuada {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);


        String entrada;
        do {
            System.out.println("Digite um número para calcular a tabuada (ou escreva 'sair' para encerrar).");
            entrada = scanner.next();


            if (entrada.equalsIgnoreCase("sair")) {
                break;
            }

        
            int numeroPensado;
            try {
                numeroPensado = Integer.parseInt(entrada);
            } catch (NumberFormatException e) {
                System.out.println("Entrada Inválida. Digite um número.");
                continue;
            }


            System.out.println("Tabuada do " + numeroPensado + ":");
            for (int i = 1; i <= 10; i++) {
                System.out.println(numeroPensado + " x " + i + " = " + (numeroPensado * i));
            }

        } while (true);

        scanner.close();

    }


}