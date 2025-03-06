import javax.swing.JOptionPane;

public class par_impar {

    public static void main(String[] args) {

        var primeiroNumStr = JOptionPane.showInputDialog(null, "Digite um número:", "Encontre pares e ímpares", JOptionPane.QUESTION_MESSAGE);
        var primeiroNum = Integer.parseInt(primeiroNumStr);
        var segundoNum = 0;

        do{
            var segundoNumStr = JOptionPane.showInputDialog(null, "Digite um número maior que " + primeiroNum, "Encontre pares e ímpares", JOptionPane.QUESTION_MESSAGE);
            segundoNum = Integer.parseInt(segundoNumStr); 

            if(segundoNum < primeiroNum)
                JOptionPane.showMessageDialog(null, "O número deve ser maior que " + primeiroNum + ". Tente novamente.", "Erro", JOptionPane.ERROR_MESSAGE);
           
        }while (segundoNum <= primeiroNum);

        int[] pares = new int[segundoNum - primeiroNum];
        int[] impares = new int[segundoNum - primeiroNum];
        int indexPar = 0;
        int indexImpar = 0;
        

        for(;primeiroNum <= segundoNum; primeiroNum++){

            if (primeiroNum % 2 == 0){
                pares[indexPar++] = primeiroNum;
            } else {
                impares[indexImpar++] = primeiroNum;
            }
        }
        // imprime de ordem decrescente
        StringBuilder paresStr = new StringBuilder("Números pares: ");
        for (int i = indexPar -1 ; i >= 0; i--) {
            paresStr.append(pares[i]).append(" ");
        }

        StringBuilder imparesStr = new StringBuilder("Números ímpares: ");
        for (int i = indexImpar -1; i >= 0; i--) {
            imparesStr.append(impares[i]).append(" ");
        }

        JOptionPane.showMessageDialog(null, paresStr.toString() + "\n" + imparesStr.toString(), "Resultado", JOptionPane.INFORMATION_MESSAGE);
    
    }
}