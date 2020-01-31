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
			System.out.println("Resultado do exercicio 3 - Soma dos numeros é :" + Lista.somar());
			break;

		case 4:
			System.out.println("Resultado do exercicio 4 - Media das notas informadas é :" + Lista.media());
			break;

		case 5:
			System.out.println("Resultado do exercicio 5 - Os Metros informados dão  : "
					+ Lista.converterMetrosemCentimetros() + " Centimetros");
			break;

		case 6:
			System.out.println("Resultado do exercicio 6 - A Area do circulo é : " + Lista.circulo());
			break;

		case 7:
			System.out.println("Resultado do exercicio 7 - A Area do quadrado é : " + Lista.quadradoArea());
			System.out.println("Resultado do exercicio 7 - O Dobro dessa area é : " + Lista.quadradoAreaDobro());
			break;

		case 8:
			System.out.println("Resultado do exercicio 8 - Ira receber : " + Lista.salario() + " Nesse mes.");
			break;

		case 9:
			System.out.println("Resultado do exercicio 9 - A Temperatura informada em Celsius será : "
					+ Lista.temperaturasC() + "º");
			break;

		case 10:
			System.out.println("Resultado do exercicio 10 - A Temperatura informada em Farenheit será : "
					+ Lista.temperaturasF() + "º");
			break;

		case 11:
			System.out.println("Resultado do exercicio 11");
			System.out.println("O Produto do Dobro do Primeiro com Metade do Segundo é :" + Lista.questaoA());
			System.out.println("A Soma do Triplo do primeiro com o terceiro é :" + Lista.questaoB());
			System.out.println("O terceiro elevado ao cubo é :" + Lista.questaoC());
			break;

		case 12:
			System.out.println("Resultado do exercicio 12 - Seu peso é de :" + Lista.pesoIdeal() + "Kg");
			break;

		case 13:
			System.out.println("Resultado do exercicio 13");
			System.out.println("Salario Bruto é : R$" + Lista.salarioBruto());
			System.out.println("Você pagou R$" + Lista.inss() + " de INSS");
			System.out.println("Você pagou R$" + Lista.ir() + " de Imposto de Renda");
			System.out.println("Voce Pagou R$" + Lista.sindicato() + " ao sindicato");
			System.out.println("Salario Liquido é de R$" + Lista.liquido());
			break;

		case 14:
			System.out.println("Resultado do exercicio 14");
			System.out.println("seu arquivo ira demorar " + Lista.tempoDownload() + "m");
			break;

		default:
			System.out.println("Não é uma opção valida");
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
