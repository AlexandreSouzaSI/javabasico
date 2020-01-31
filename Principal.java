package curso.java.lista13;

import javax.swing.JOptionPane;

import autenticar.Autenticacao;

public class Principal {
	

	public static void main(String[] args) {
		
		try {
		
		String login = JOptionPane.showInputDialog("Qual o Login");
		String senha = JOptionPane.showInputDialog("Qual a senha");
		
		
		if (new Autenticacao(new Aluno(login,senha)).autenticar()) {

		String exercicio = JOptionPane.showInputDialog("Informe qual exercicio deseja fazer :");

		switch (Integer.valueOf(exercicio)) {
		case 1:
			System.out.println("Resultado do exercicio 1: " + Lista.ola());
			break;

		case 2:
			System.out.println("Resultado do exercicio 2 - Numero informado :" + Lista.pedirNumero());
			break;

		case 3:
			System.out.println("Resultado do exercicio 3 - Soma dos numeros � :" + Lista.somar());
			break;

		case 4:
			System.out.println("Resultado do exercicio 4 - Media das notas informadas � :" + Lista.media());
			break;

		case 5:
			System.out.println("Resultado do exercicio 5 - Os Metros informados d�o  : "
					+ Lista.converterMetrosemCentimetros() + " Centimetros");
			break;

		case 6:
			System.out.println("Resultado do exercicio 6 - A Area do circulo � : " + Lista.circulo());
			break;

		case 7:
			System.out.println("Resultado do exercicio 7 - A Area do quadrado � : " + Lista.quadradoArea());
			System.out.println("Resultado do exercicio 7 - O Dobro dessa area � : " + Lista.quadradoAreaDobro());
			break;

		case 8:
			System.out.println("Resultado do exercicio 8 - Ira receber : " + Lista.salario() + " Nesse mes.");
			break;

		case 9:
			System.out.println("Resultado do exercicio 9 - A Temperatura informada em Celsius ser� : "
					+ Lista.temperaturasC() + "�");
			break;

		case 10:
			System.out.println("Resultado do exercicio 10 - A Temperatura informada em Farenheit ser� : "
					+ Lista.temperaturasF() + "�");
			break;

		case 11:
			System.out.println("Resultado do exercicio 11");
			System.out.println("O Produto do Dobro do Primeiro com Metade do Segundo � :" + Lista.questaoA());
			System.out.println("A Soma do Triplo do primeiro com o terceiro � :" + Lista.questaoB());
			System.out.println("O terceiro elevado ao cubo � :" + Lista.questaoC());
			break;

		case 12:
			System.out.println("Resultado do exercicio 12 - Seu peso � de :" + Lista.pesoIdeal() + "Kg");
			break;

		case 13:
			System.out.println("Resultado do exercicio 13");
			System.out.println("Salario Bruto � : R$" + Lista.salarioBruto());
			System.out.println("Voc� pagou R$" + Lista.inss() + " de INSS");
			System.out.println("Voc� pagou R$" + Lista.ir() + " de Imposto de Renda");
			System.out.println("Voce Pagou R$" + Lista.sindicato() + " ao sindicato");
			System.out.println("Salario Liquido � de R$" + Lista.liquido());
			break;

		case 14:
			System.out.println("Resultado do exercicio 14");
			System.out.println("seu arquivo ira demorar " + Lista.tempoDownload() + "m");
			break;

		default:
			System.out.println("N�o � uma op��o valida");
			break;
		}

	}else 
		JOptionPane.showMessageDialog(null, "Acesso Negado");
		
		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro ao processar o arquivo");
		}
	}

}
