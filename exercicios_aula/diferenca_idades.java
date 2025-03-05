import java.util.Scanner;
import java.lang.Math;

public class diferenca_idades {
    public static void main(String[] args) {
        
        
            Scanner scanner = new Scanner(System.in);
            System.out.println("Qual é o seu nome, pessoa1?");
            String nome1 = scanner.next();
            System.out.println("Qual é o seu nome, pessoa2?");
            String nome2 = scanner.next();

            System.out.printf("Qual é a sua idade, %s?\n", nome1);
            int idade1 = scanner.nextInt();
            System.out.printf("Qual é a sua idade, %s?\n", nome2);
            int idade2 = scanner.nextInt();

            int diferenca = Math.abs(idade1 - idade2);
            System.out.printf("A diferença de idades entre %s e %s é de %d anos", nome1, nome2, diferenca);
        
            scanner.close();
       
    }
}