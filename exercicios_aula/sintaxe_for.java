import java.util.ArrayList;
import java.util.Scanner;
import java.util.List;

public class sintaxe_for {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        try {
            List<String> names = new ArrayList<>();

            //dessa forma o for entra num loop inifinito se nao houver um comando de paragem no corpo do for
            for (;;){
                System.out.println("Digite um nome: ");
                String name = scanner.nextLine();

                boolean isduplicate = false;
                for(String existingName : names){
                    if (existingName.equalsIgnoreCase(name)){
                        isduplicate = true;
                        break; //sai do for
                    }
                }

                if (isduplicate){
                    System.out.println("--------------------------------");
                    System.out.println("Nome repetido! Interrompendo...");
                    System.out.println("--------------------------------");
                    break; 
                } else {
                    names.add(name);
                }
            }
            
            System.out.println("Nomes digitados:");
            for (var i = 0; i < names.size(); i++) {
                if (i == names.size() - 1) {
                    System.out.print(names.get(i) + ".");
                } else {
                    System.out.print(names.get(i) + ", ");
            }
        }
        } finally {
            scanner.close();
        }
        
    }

    /*também pode usar o for da seguinte forma:
    var i = 2;  //inicializacao da variavel de controle fora do for
    for(;i < 100; i+=2){  //vai de 2 em 2
        if(i % 2 == 0){
            continue;    //nesse caso ele iria ignorar os pares porque o continue faria ele seguir para a iteracao seguinte
        }
        ...
    }*/
    
}
