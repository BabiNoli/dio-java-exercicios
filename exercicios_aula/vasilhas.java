import java.util.Scanner;

public class vasilhas {
    
    public static void main(String[] args) {
        boolean confirmacao;
        var scanner = new Scanner(System.in);
        
        do{
            //verifica estado da pia
            System.out.println("\nQual é o estado das vasilhas na pia?\n1. Tudo limpo\n2. Pouca vasilha para lavar\n3. Uma montanha de vasilhas para lavar\nEscolha (1, 2 ou 3): " );
            var escolha = scanner.nextInt();

            System.out.println();

            var message = switch (escolha) {
                case 1 -> "Pode ir fazer outra coisa útil ou relaxar!";
                case 2 -> "É melhor limpar enquanto nao tem uma montanha de vazinha suja.";
                case 3 -> "Para tudo que você está fazendo e lava essas vazinhas imediatamente.";
            
                default -> "Escolha inválida. Digite 1, 2 ou 3.";
                
            };
            System.out.println(message);
            

            //Verifica se ficou limpa, caso nao tenha ficado limpa repete o processo
            if (escolha == 2 || escolha == 3){
                System.out.println("\n.............duas horas depois...............\n");
                System.out.println("Verifique se as vasilhas lavadas estao limpas. (S/N)");
                confirmacao = scanner.next().equalsIgnoreCase("s");
            }else{
                confirmacao = true;
            };
            
        }while (!confirmacao);

        System.out.println();
        System.out.println("***Você merece um joinha! Fim do programa***\n");
        scanner.close();
    }
}
