import java.util.Scanner;

public class area_quadrado {
    public static void main(String[] args) {
        try (var scanner = new Scanner(System.in)) {
            System.out.println("Digite o lado do quadrado: ");
            double lado = scanner.nextDouble();
            double area = lado * lado;
            System.out.println("A área do quadrado é: " + area);
        } catch (Exception e) {
            throw new RuntimeException("Erro ao calcular a área do quadrado", e);
        }
    } 
}

