import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     Scanner sc= new Scanner(System.in);

      String nome;
      float nota1, nota2, nota3, media;
      System.out.println("Informe o nome do aluno:");
      nome= sc.nextLine();
      System.out.println("Informe as três notas do aluno:");
      nota1= sc.nextFloat();
      nota2= sc.nextFloat();
      nota3= sc.nextFloat();

      media = (nota1+nota2+(nota3*2))/4;

      System.out.printf(" Aluno: %s  ",nome);
      System.out.printf(" Media: %.2f ",media);

      if(media>=7.0){
          System.out.println("Aprovado");
      }
      else{
          System.out.println("Reprovado");
      }
      sc.close();
    }
}