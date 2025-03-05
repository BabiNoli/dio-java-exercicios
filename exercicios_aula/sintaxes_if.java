import java.util.Scanner;


public class sintaxes_if {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite o seu nome: ");
        var name = scanner.next();
        System.out.println("Digite a sua idade: ");
        var age = scanner.nextInt();
        System.out.println("Você é emancipado? (s/n)");
        var isEmancipated = scanner.next().equalsIgnoreCase("s");
    

        scanner.close();

        var canDrive = (age >= 18) || (age >= 16 && isEmancipated );

        //Elvis option
        var message = canDrive ? name + ", você pode dirigir.\n" : name + ", você nao pode dirigir.\n";
        System.out.print(message);
        
        //boolean
        if (canDrive){
            System.out.printf("%s tem %s anos, você pode dirigir. \n", name, age);
        }else{
            System.out.printf("%s tem %s anos, você nao pode dirigir. \n", name, age);
        }

        //classico if
        if ((age >= 18) || (age >= 16 && isEmancipated )){
            System.out.printf("%s tem %s anos, você pode dirigir. \n", name, age);
        }else{
            System.out.printf("%s tem %s anos, você nao pode dirigir. \n", name, age);
       
        }
        System.out.println("Fim!");
    }
    
}
