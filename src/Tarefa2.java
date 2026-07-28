import java.util.Scanner;

public class Tarefa2 {
    public static void main(String... args) {
        Scanner scanner = new Scanner(System.in);

        int n;
        do {
            System.out.print("Digite um número inteiro positivo: ");
            n = scanner.nextInt();
        }
        while (n<2);


        System.out.println("Números primos entre 2 e " + n + ":");

        // Imprimir todos os primos entre 2 e N
        for (int i = 2; i <= n; i++) {
            if (ehPrimo(i)) {
                System.out.print(i + " ");
            }
        }

        scanner.close();
    }

    // Função que verifica se um número é primo
    public static boolean ehPrimo(int numero) {
        if (numero < 2) return false;
        if (numero == 2) return true;
        if (numero % 2 == 0) return false;

        // Testa divisores até a raiz quadrada de numero
        for (int i = 3; i * i <= numero; i += 2) {
            if (numero % i == 0) {
                return false;
            }
        }
        return true;
    }
}
