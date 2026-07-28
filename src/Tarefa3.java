import java.util.Scanner;

public class Tarefa3 {
        public static void main(String[] args) {
            Scanner entrada = new Scanner(System.in);
            int[] numeros = new int[5];

            for (int i = 0; i < 5; i++) {
                int numero;
                do {
                    System.out.printf("Digite o número %d: ", i + 1);
                    numero = entrada.nextInt();
                    if (numero < 1 || numero > 30) {
                        System.out.println("Número inválido! Digite entre 1 e 30.");
                    }
                } while (numero < 1 || numero > 30);

                numeros[i] = numero;
            }

            // Exibir as barras de asteriscos
            System.out.println("\nHistograma:");
            for (int numero : numeros) {
                for (int j = 0; j < numero; j++) {
                    System.out.print("*");
                }
                System.out.println();
            }

            entrada.close();
        }
}
