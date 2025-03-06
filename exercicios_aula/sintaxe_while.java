import java.util.Scanner;

public class sintaxe_while {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        var name = "";

        System.out.println("------------------------");
        System.out.println("\nCom while + variável no condional: \n");
        System.out.println("------------------------");  

        while(!name.equals("exit")){
            System.out.println("Informe um nome");
            name = scanner.next();
            System.out.println(name);
        }

            //exatamente o mesmo resultado

        System.out.println("------------------------");
        System.out.println("\nCom o while resultado de boolean como condicional: \n");
        System.out.println("------------------------");     

        while(true){  //executa sempre até o break interno
            System.out.println("Informe um nome");
            name = scanner.next();
            System.out.println(name);

            if(name.equalsIgnoreCase("exit")) break;
                
        }

        System.out.println("------------------------");
        System.out.println("\nCom o do-while: \n");
        System.out.println("------------------------");

        do{ //executa primeiro
            System.out.println("Informe um nome");
            name = scanner.next();
            System.out.println(name);

            if(name.equalsIgnoreCase("exit")) break;  
        } while(true); //avalia a condicao depois
        // a condicao de paragem também poderia estar no dentro do parentese do while(!name.equals("exit")) 
    }
}
