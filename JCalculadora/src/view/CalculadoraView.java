package view;

import java.awt.BorderLayout;
import java.awt.Container;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class CalculadoraView extends JFrame implements ActionListener{
	
	private static final long serialVersionUID = 1L;
	
	JButton b0;
	JButton b1;
	JButton b2;
	JButton b3;
	JButton b4;
	JButton b5;
	JButton b6;
	JButton b7;
	JButton b8;
	JButton b9;
	JButton bmultiplicacao;
	JButton bdivisao;
	JButton bsoma;
	JButton bsubtracao;
	JButton bdelete;
	JButton bresultado;
	
	JTextField visor;
	
	String primeiroNumero = "";
	String segundoNumero = "";
	int i = 1;
	String operador = "";
	
	public CalculadoraView () {
		super("Calculadora");
		
		Container n = new JPanel();
		n.setLayout(new GridLayout(4, 4, 5, 5));
		
		b7 = new JButton("7");
		n.add(b7);
		b7.addActionListener(this);

		b8 = new JButton("8");
		n.add(b8);
		b8.addActionListener(this);
		
		b9 = new JButton("9");
		n.add(b9);
		b9.addActionListener(this);
		
		bdivisao = new JButton("/");
		bdivisao.addActionListener(this);
		n.add(bdivisao);
		
		b4 = new JButton("4");
		b4.addActionListener(this);
		n.add(b4);
		
		b5 = new JButton("5");
		b5.addActionListener(this);
		n.add(b5);
		
		b6 = new JButton("6");
		b6.addActionListener(this);
		n.add(b6);
		
		bmultiplicacao = new JButton("*");
		bmultiplicacao.addActionListener(this);
		n.add(bmultiplicacao);
		
		b1 = new JButton("1");
		b1.addActionListener(this);
		n.add(b1);
		
		b2 = new JButton("2");
		b2.addActionListener(this);
		n.add(b2);
		
		b3 = new JButton("3");
		b3.addActionListener(this);
		n.add(b3);
		
		bsubtracao = new JButton("-");
		bsubtracao.addActionListener(this);
		n.add(bsubtracao);
		
		b0 = new JButton("0");
		b0.addActionListener(this);
		n.add(b0);
		
		bdelete = new JButton("C");
		bdelete.addActionListener(this);
		n.add(bdelete);
		
		bresultado = new JButton("="); 
		bresultado.addActionListener(this);
		n.add(bresultado);
		
		bsoma = new JButton("+"); 
		n.add(bsoma);
		bsoma.addActionListener(this);

		visor = new JTextField();
		visor.setFont(new Font("serif", Font.PLAIN, 26));
		
		Container c = getContentPane();
		c.add(BorderLayout.NORTH, visor);
		c.add(BorderLayout.CENTER, n);

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new CalculadoraView();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		
		if (e.getSource() == b1) {
			String botao1 = "1";
			if (i == 1) {
				primeiroNumero = primeiroNumero + botao1;
				visor.setText(primeiroNumero);
			} else if (i == 2) {
				segundoNumero = segundoNumero + botao1;
				visor.setText(segundoNumero);				
			}		
			
		} else if (e.getSource() == b2) {
			String botao2 = "2";
			if ( i == 1 ) {
				primeiroNumero = primeiroNumero + botao2;
				visor.setText(primeiroNumero);
			} else if ( i == 2 ) {
				segundoNumero = segundoNumero + botao2;
				visor.setText(segundoNumero);
			}
			
		} else if (e.getSource() == b3) {
			String botao3 = "3";
			if ( i == 1 ) {
				primeiroNumero = primeiroNumero + botao3;
				visor.setText(primeiroNumero);
			} else if ( i == 2 ) {
				segundoNumero = segundoNumero + botao3;
				visor.setText(segundoNumero);
			}
			
		} else if (e.getSource() == b4) {
			String botao4 = "4";
			if ( i == 1 ) {
				primeiroNumero = primeiroNumero + botao4;
				visor.setText(primeiroNumero);
			} else if ( i == 2 ) {
				segundoNumero = segundoNumero + botao4;
				visor.setText(segundoNumero);
			}
			
		} else if (e.getSource() == b5) {
			String botao5 = "5";
			if ( i == 1 ) {
				primeiroNumero = primeiroNumero + botao5;
				visor.setText(primeiroNumero);
			} else if ( i == 2 ) {
				segundoNumero = segundoNumero + botao5;
				visor.setText(segundoNumero);
			}
			
		} else if (e.getSource() == b6) {
			String botao6 = "6";
			if ( i == 1 ) {
				primeiroNumero = primeiroNumero + botao6;
				visor.setText(primeiroNumero);
			} else if ( i == 2 ) {
				segundoNumero = segundoNumero + botao6;
				visor.setText(segundoNumero);
			}
			
		} else if (e.getSource() == b7) {
			String botao7 = "7";
			if ( i == 1 ) {
				primeiroNumero = primeiroNumero + botao7;
				visor.setText(primeiroNumero);
			} else if ( i == 2 ) {
				segundoNumero = segundoNumero + botao7;
				visor.setText(segundoNumero);
			}
			
		} else if (e.getSource() == b8) {
			String botao8 = "8";
			if ( i == 1 ) {
				primeiroNumero = primeiroNumero + botao8;
				visor.setText(primeiroNumero);
			} else if ( i == 2 ) {
				segundoNumero = segundoNumero + botao8;
				visor.setText(segundoNumero);
			}
			
		} else if (e.getSource() == b9) {
			String botao9 = "9";
			if ( i == 1 ) {
				primeiroNumero = primeiroNumero + botao9;
				visor.setText(primeiroNumero);
			} else if ( i == 2 ) {
				segundoNumero = segundoNumero + botao9;
				visor.setText(segundoNumero);
			}
			
		} else if (e.getSource() == b0) {
			String botao0 = "0";
			if ( i == 1 ) {
				primeiroNumero = primeiroNumero + botao0;
				visor.setText(primeiroNumero);
			} else if ( i == 2 ) {
				segundoNumero = segundoNumero + botao0;
				visor.setText(segundoNumero);
			}
				
			
		} else if (e.getSource() == bsoma) {
			operador = "soma";
			i = 2;
			visor.setText("");
			
		} else if (e.getSource() == bmultiplicacao) {
			operador = "multiplicacao";
			i = 2;
			visor.setText("");
			
		} else if (e.getSource() == bsubtracao) {
			operador = "subtracao";
			i = 2;
			visor.setText("");
			
		} else if (e.getSource() == bdivisao) {
			operador = "divisao";
			i = 2;
			visor.setText("");

		} else if (e.getSource() == bdelete) {
			visor.setText("");
			i = 1;

			primeiroNumero = "";
			segundoNumero = "";
			
			
		}  else if (e.getSource() == bresultado) {
			if (operador == "soma") {
				int num1 = Integer.parseInt(primeiroNumero);
				int num2 = Integer.parseInt(segundoNumero);
				
				int resultado = num1 + num2;
								
				visor.setText( Integer.toString(resultado));
				
				primeiroNumero = "";
				segundoNumero = "";
				
			} else if (operador == "subtracao") {
				int num1 = Integer.parseInt(primeiroNumero);
				int num2 = Integer.parseInt(segundoNumero);
				
				int resultado = num1 - num2;
				
				visor.setText( Integer.toString(resultado));
				
				primeiroNumero = "";
				segundoNumero = "";
				
			} else if (operador == "divisao") {
				int num1 = Integer.parseInt(primeiroNumero);
				int num2 = Integer.parseInt(segundoNumero);
				
				int resultado = num1 / num2;
				
				visor.setText( Integer.toString(resultado));

				primeiroNumero = "";
				segundoNumero = "";
				
			} else if (operador == "multiplicacao") {
				int num1 = Integer.parseInt(primeiroNumero);
				int num2 = Integer.parseInt(segundoNumero);
				
				int resultado = num1 * num2;
				
				visor.setText( Integer.toString(resultado));

				primeiroNumero = "";
				segundoNumero = "";
				
			}
		
	} 
				
	}

}
