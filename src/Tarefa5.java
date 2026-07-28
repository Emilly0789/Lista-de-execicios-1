import java.util.Scanner;

public class Tarefa5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Informe um número real: ");
        double numero = scanner.nextDouble();

        System.out.printf("Valor com 2 casas decimais: %.2f%n", numero);

        scanner.close();
    }
}
