import java.util.Scanner;

public class sintaxe_for {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        for (;;){
            System.out.println("Digite um nome: ");
            var name = scanner.next();

            if(name.equalsIgnoreCase("exit")) break;

            System.out.println("");
        }

    }


    
}
