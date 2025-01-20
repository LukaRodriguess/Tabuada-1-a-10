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

            // Exibe a mensagem indicando o número cuja tabuada será calculada
            System.out.println("Tabuada do " + numeroPensado + ":");

            // Loop para gerar os cálculos da tabuada
            for (int i = 1; i <= 10; i++) { // Começa com i = 1 e vai até i = 10
                // Calcula o valor do número multiplicado pelo contador (i) e exibe o resultado
                System.out.println(numeroPensado + " x " + i + " = " + (numeroPensado * i));
            }

        } while (true);

        scanner.close();

    }

}
