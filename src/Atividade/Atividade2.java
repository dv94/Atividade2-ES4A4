package Atividade;

import javax.swing.*;

public class Atividade2 {

	public static void main(String[] args) {
		
		int op = 0;
		int a , b, soma, subtracao, multiplicacao, divisao;
		
		do {
			
			op = Integer.parseInt(JOptionPane.showInputDialog(
					"Calculadora Simples"
					+ "\n 1 - Soma"
					+ "\n 2 - Subtra��o"
					+ "\n 3 - Multiplica��o"
					+ "\n 4 - Divis�o"
					+ "\n Escolha sua op��o: "));
			
		switch(op) {
		
		case 1: 
				
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro n�mero: "));
			
			b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo n�mero: "));
						
			soma = a + b;
			
			JOptionPane.showMessageDialog(null, "O Resultado �: "+ a +" + "+ b +" = " + soma);
			
			break;
			
		case 2:
			
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro n�mero: "));
			
			b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo n�mero: "));
						
			subtracao = a - b;
			
			JOptionPane.showMessageDialog(null, "O Resultado �: "+ a +" - "+ b +" = " + subtracao);
			
			break;
			
		case 3:
			
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro n�mero: "));
			
			b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo n�mero: "));
						
			multiplicacao = a * b;
			
			JOptionPane.showMessageDialog(null, "O Resultado �: "+ a +" * "+ b +" = " + multiplicacao);
			
			break;
			
		case 4:
			
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro n�mero: "));
			
			b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo n�mero: "));
						
			divisao = a / b;
			
			JOptionPane.showMessageDialog(null, "O Resultado �: "+ a +" / "+ b +" = " + divisao);
			
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Op��o Inv�lida");
			break;
		}
		
		op = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja Continuar? 1 - Sim | 0 - N�o "));
		
		}while(op != 0);
		
		JOptionPane.showMessageDialog(null, " Programa Encerrado ");

	}

}
