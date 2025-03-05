import java.util.Scanner;

public class sintaxe_switch_case {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Informe um número de 1 a 7: ");
        var weekDay = scanner.nextInt();

        scanner.close();

        // sintaxe dentro de variavel
        var message = switch (weekDay){
            case 1 -> "Segunda-feira"; 
            case 2 -> "Terca-feira"; 
            case 3 -> "Quarta-feira";
            case 4 -> "Quinta-feira";
            case 5 -> "Sexta-feira";
            case 6, 7 -> "Fim de Semana! Uhulll";
            default -> "Entrada inválida";
        };
        System.out.println(message);

        // sintaxe curta
        switch (weekDay) {
            case 1 -> System.out.println("Segunda-feira"); 
            case 2 -> System.out.println("Terca-feira"); 
            case 3 -> System.out.println("Quarta-feira");
            case 4  -> System.out.println("Quinta-feira");
            case 5 -> System.out.println("Sexta-feira");
            case 6, 7 -> System.out.println("Fim de Semana! Uhulll");
            default -> System.out.println("Entrada inválida");
        }
        
        
        // sintaxe classica
        switch (weekDay) {
            case 1:
                System.out.println("Segunda-feira");
                break;
            case 2:
                System.out.println("Terca-feira");
                break;
            case 3:
                System.out.println("Quarta-feira");
                break;
            case 4:
                System.out.println("Quinta-feira");
                break;
            case 5:
                System.out.println("Sexta-feira");
                break;
            case 6:
            case 7:
                System.out.println("Fim de Semana! Uhulll");
                break;
            default:
                System.out.println("Entrada inválida");
                break;
        }
    }
}
