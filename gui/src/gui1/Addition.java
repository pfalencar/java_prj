package gui1;

import javax.swing.JOptionPane;

public class Addition {

	public static void main(String[] args) {
		
		//entrada do usuario por JOptionPane
		String primeiroNumero = JOptionPane.showInputDialog("Entre com o primeiro inteiro");
		String segundoNumero = JOptionPane.showInputDialog("Entre com o segundo inteiro");
		
		//conversao de String para inteiro para fazer o c�lculo
		int num1 = Integer.parseInt(primeiroNumero);
		int num2 = Integer.parseInt(segundoNumero);
		
		int soma = num1 + num2;
		
		//exibe o resultado em um di�logo de mensagem JOptionPane
		JOptionPane.showMessageDialog(null, "A soma � " + soma, "Soma de dois n�meros inteiros", JOptionPane.PLAIN_MESSAGE);
		
	}
}
