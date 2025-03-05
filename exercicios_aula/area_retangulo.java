import java.util.Scanner;

public class area_retangulo {
    public static void main(String[] args) {
        try{
            var scanner = new Scanner(System.in);
            System.out.println("Digite a base do retângulo: ");
            double base = scanner.nextDouble();
            System.out.println("Digite a altura do retângulo: ");
            double altura = scanner.nextDouble();

            double area = base * altura;
            System.out.println("A área do retângulo é: " + area);

            scanner.close();
        }catch(Exception e){
            throw new RuntimeException("Erro ao calcular a área do retângulo", e);
        }
    }
    
}
