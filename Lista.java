package curso.java.lista13;

import javax.swing.JOptionPane;

public class Lista {

	static double J, A, B, C, a, b, c, d, e, f, m = 0;

	// Exercicio 1 - Imprimir Ola Mundo na tela
	public static String ola() {
		return "Ola Mundo";
	}

	// Exercicio 2 - pedir um numero e imprimir ele na tela
	public static double pedirNumero() {
		String x = JOptionPane.showInputDialog("Informe um numero? ");
		return (Double.valueOf(x));
	}

	// Exercicio 3 - pedir 2 numeros e imprimir a soma
	public static double somar() {
		String x = JOptionPane.showInputDialog("Informe um numero? ");
		String y = JOptionPane.showInputDialog("Informe outro numero? ");
		return (Double.valueOf(x)) + (Double.valueOf(y));
	}

	// Exercicio 4 - pedir 4 notas bimestrais e informar a media
	public static double media() {
		String x = JOptionPane.showInputDialog("Informe a primeira nota? ");
		String y = JOptionPane.showInputDialog("Informe a segunda nota? ");
		String w = JOptionPane.showInputDialog("Informe a terceira nota? ");
		String z = JOptionPane.showInputDialog("Informe a quarta nota? ");
		return ((Double.valueOf(x)) + (Double.valueOf(y)) + (Double.valueOf(w)) + (Double.valueOf(z))) / 4;
	}

	// Exercicio 5 - Converter metros em centimetros
	public static double converterMetrosemCentimetros() {
		String x = JOptionPane.showInputDialog("Informe a quantidade de metros? ");
		return (Double.valueOf(x)) * 100;
	}

	// Exercicio 6 - Calculando a area de um circulo
	public static double circulo() {
		String x = JOptionPane.showInputDialog("Informe o raio do circulo? ");
		return 3.14 * ((Double.valueOf(x)) * (Double.valueOf(x)));
	}

	// Exercicio 7 - Calcular a area do quadrado e mostrar o dobro dessa area.
	public static double quadradoArea() {
		String x = JOptionPane.showInputDialog("Informe o tamanho de um lado do quadrado? ");
		J = (Double.valueOf(x)) * (Double.valueOf(x));
		return J;
	}

	public static double quadradoAreaDobro() {
		return J * J;
	}

	// Exercicio 8 - Pedir o valor ganhado por hora e as horas trabalhadas
	public static double salario() {
		String x = JOptionPane.showInputDialog("Quantas horas trabalhou no mes? ");
		String y = JOptionPane.showInputDialog("Quanto ganha por hora? ");
		return (Double.valueOf(x)) * (Double.valueOf(y));
	}

	// Exercicio 9 - Transformar temperaturas F para C
	public static double temperaturasC() {
		String x = JOptionPane.showInputDialog("Qual a Temperatura em Farenheit? ");
		return (5 * (Double.valueOf(x) - 32)) / 9;
	}

	// Exercicio 10 - Transformar temperaturas C para F
	public static double temperaturasF() {
		String x = JOptionPane.showInputDialog("Qual a Temperatura em Celsius? ");
		return (Double.valueOf(x) * 9 / 5) + 32;
	}

	// Exercicio 11 - Pedir 3 numeros e fazer a soma entre eles.
	public static double questaoA() {
		String x = JOptionPane.showInputDialog("Informe o primeiro numero Inteiro? ");
		String y = JOptionPane.showInputDialog("Informe o segundo numero inteiro? ");
		String z = JOptionPane.showInputDialog("Informe o segundo numero Real? ");
		A = (Integer.valueOf(x));
		B = (Integer.valueOf(y));
		C = (Double.valueOf(z));
		return (A * 2) * (B / 2);
	}

	public static double questaoB() {
		return (A * 3) + C;
	}

	public static double questaoC() {
		return Math.pow(C, 3);
	}

	// Exercicio 12 - Calculando o peso, tendo somente altura como entrada
	public static double pesoIdeal() {
		String x = JOptionPane.showInputDialog("Qual a Altura? ");
		return ((72.7 * (Double.valueOf(x)) - 58));
	}

	/*
	 * Exercicio 13 - 13.Faça um Programa que pergunte quanto você ganha por hora e
	 * o número de horas trabalhadas no mês. Calcule e mostre o total do seu salário
	 * no referido mês, sabendo-se que são descontados 11% para o Imposto de Renda,
	 * 8% para o INSS e 5% para o sindicato, faça um programa que nos dê: . salário
	 * bruto. a. quanto pagou ao INSS. b. quanto pagou ao sindicato. c. o salário
	 * líquido. d. calcule os descontos e o salário líquido, conforme a tabela
	 * abaixo:
	 */
	public static double salarioBruto() {
		String x = JOptionPane.showInputDialog("Quanto recebe por hora? ");
		String y = JOptionPane.showInputDialog("Quantas horas trabalhou esse mes? ");
		a = (Double.valueOf(x));
		b = (Double.valueOf(y));
		c = ((Double.valueOf(x) * (Double.valueOf(y))) * 11) / 100;
		d = ((Double.valueOf(x) * (Double.valueOf(y))) * 8) / 100;
		e = ((Double.valueOf(x) * (Double.valueOf(y))) * 5) / 100;
		f = (Double.valueOf(y) * (Double.valueOf(x)) - (c + d + e));
		return (Double.valueOf(x) * (Double.valueOf(y)));
	}

	public static double inss() {
		return c;
	}

	public static double sindicato() {
		return e;
	}

	public static double ir() {
		return d;
	}

	public static double liquido() {
		return f;
	}

	/*
	 * Exercicio 14 - Faça um programa que peça o tamanho de um arquivo para
	 * download (em MB) e a velocidade de um link de Internet (em Mbps), calcule e
	 * informe o tempo aproximado de download do arquivo usando este link (em
	 * minutos).
	 */
	public static double tempoDownload() {
		String x = JOptionPane.showInputDialog("Qual o tamanho do Arquivo em MB? ");
		String y = JOptionPane.showInputDialog("Qual a velocidade da internet? ");
		m = ((Double.valueOf(x) * 1000) / (Double.valueOf(y) * 0.953674)) / 8;
		return m / 60;
	}

}
