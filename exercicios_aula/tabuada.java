import javax.swing.JOptionPane;

public class tabuada {

    public static void main(String[] args) {
        var numeroStr = JOptionPane.showInputDialog(null, "Digite um número:", "Vamos aprender a Tabuada!", JOptionPane.QUESTION_MESSAGE);
        
        var numero = Integer.parseInt(numeroStr);

        String[] options = {"Adição", "Subtração", "Multiplicação", "Divisão"};
        int operacao = JOptionPane.showOptionDialog(null, "Que operação deseja fazer?", "Escolha a operação",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, null, options, options[0]);

        StringBuilder tabuada = new StringBuilder();


        for (int i = 0; i <= 10; i++) {
            switch (operacao) {
                case 0: // Adição
                    tabuada.append(numero).append(" + ").append(i).append(" = ").append(numero + i).append("\n");
                    break;
                case 1: // Subtração
                    tabuada.append(numero + i).append(" - ").append(numero).append(" = ").append(i).append("\n");
                    break;
                case 2: // Multiplicação
                    tabuada.append(numero).append(" x ").append(i).append(" = ").append(numero * i).append("\n");
                    break;
                case 3: // Divisão
                    if (i != 0) {
                        tabuada.append(numero * i).append(" / ").append((numero * i) / i).append(" = ").append(i).append("\n");
                    } else {
                        tabuada.append(numero * i).append(" / ").append(i).append(" = ").append(" - ").append("\n");
                    }
                    break;
                default:
                    tabuada.append("Operação inválida").append("\n");
                    break;
            }
        }
        
        JOptionPane.showMessageDialog(null, tabuada.toString(), "Tabuada do " + numero, JOptionPane.PLAIN_MESSAGE);
      
 
    }
    
}
