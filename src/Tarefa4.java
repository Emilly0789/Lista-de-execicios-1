import java.util.Scanner;

public class Tarefa4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;

        while (contador <= 5) {
            System.out.println("Contador " + contador);
            contador++;
        }

        sc.close();
    }
}