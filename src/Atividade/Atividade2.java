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
					+ "\n 2 - Subtração"
					+ "\n 3 - Multiplicação"
					+ "\n 4 - Divisão"
					+ "\n Escolha sua opção: "));
			
		switch(op) {
		
		case 1: 
				
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número: "));
			
			b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo número: "));
						
			soma = a + b;
			
			JOptionPane.showMessageDialog(null, "O Resultado é: "+ a +" + "+ b +" = " + soma);
			
			break;
			
		case 2:
			
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número: "));
			
			b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo número: "));
						
			subtracao = a - b;
			
			JOptionPane.showMessageDialog(null, "O Resultado é: "+ a +" - "+ b +" = " + subtracao);
			
			break;
			
		case 3:
			
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número: "));
			
			b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo número: "));
						
			multiplicacao = a * b;
			
			JOptionPane.showMessageDialog(null, "O Resultado é: "+ a +" * "+ b +" = " + multiplicacao);
			
			break;
			
		case 4:
			
			a = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o primeiro número: "));
			
			b = Integer.parseInt(JOptionPane.showInputDialog(null, "Informe o segundo número: "));
						
			divisao = a / b;
			
			JOptionPane.showMessageDialog(null, "O Resultado é: "+ a +" / "+ b +" = " + divisao);
			
			break;
			
		default:
			JOptionPane.showMessageDialog(null, "Opção Inválida");
			break;
		}
		
		op = Integer.parseInt(JOptionPane.showInputDialog(null, "Deseja Continuar? 1 - Sim | 0 - Não "));
		
		}while(op != 0);
		
		JOptionPane.showMessageDialog(null, " Programa Encerrado ");

	}

}
