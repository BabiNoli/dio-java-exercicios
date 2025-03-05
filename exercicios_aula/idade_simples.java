import java.time.OffsetDateTime;
import java.util.Scanner;

public class idade_simples {
    public static void main(String[] args) {
        var baseYear = OffsetDateTime.now().getYear();
        var scanner = new Scanner(System.in);
        System.out.println("Informe o seu nome:");
        var name = scanner.next();

        System.out.println("Digite o ano de nascimento: ");
        var birthYear = scanner.nextInt();

        var age = baseYear - birthYear;
        System.out.printf("Olá %s, você tem %d anos.\n", name, age);
        
    }
}