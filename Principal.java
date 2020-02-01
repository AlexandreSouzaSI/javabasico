package curso.java.lista13;

import javax.swing.JOptionPane;

import autenticar.Autenticacao;

public class Principal {

	public static void main(String[] args) {

		try {

			String login = JOptionPane.showInputDialog("Qual o Login");
			String senha = JOptionPane.showInputDialog("Qual a senha");

			if (new Autenticacao(new Aluno(login, senha)).autenticar()) {

				String exercicio = JOptionPane.showInputDialog("Informe qual exercicio deseja fazer :");

				switch (Integer.valueOf(exercicio)) {
				case 1:
					JOptionPane.showMessageDialog(null, "Resultado do exercicio 1: \n \n " + Lista.ola());
					break;

				case 2:
					JOptionPane.showMessageDialog(null,
							"Resultado do exercicio 2 \n \n - Numero informado :" + Lista.pedirNumero());
					break;

				case 3:
					JOptionPane.showMessageDialog(null,
							"Resultado do exercicio 3 \n \n - Soma dos numeros � :" + Lista.somar());
					break;

				case 4:
					JOptionPane.showMessageDialog(null,
							"Resultado do exercicio 4 \n \n - Media das notas informadas � :" + Lista.media());
					break;

				case 5:
					JOptionPane.showMessageDialog(null, "Resultado do exercicio 5 \n \n - Os Metros informados d�o  : "
							+ Lista.converterMetrosemCentimetros() + " Centimetros");
					break;

				case 6:
					JOptionPane.showMessageDialog(null,
							"Resultado do exercicio 6 \n \n - A Area do circulo � : " + Lista.circulo());
					break;

				case 7:
					JOptionPane.showMessageDialog(null, "Resultado do exercicio 7 \n \n - A Area do quadrado � : "
							+ Lista.quadradoArea() + "\n" + "O Dobro dessa area � : " + Lista.quadradoAreaDobro());
					break;

				case 8:
					JOptionPane.showMessageDialog(null,
							"Resultado do exercicio 8 \n \n - Ira receber : " + Lista.salario() + " Nesse mes.");
					break;

				case 9:
					JOptionPane.showMessageDialog(null,
							"Resultado do exercicio 9 \n \n - A Temperatura informada em Celsius ser� : "
									+ Lista.temperaturasC() + "�");
					break;

				case 10:
					JOptionPane.showMessageDialog(null,
							"Resultado do exercicio 10 \n \n - A Temperatura informada em Farenheit ser� : "
									+ Lista.temperaturasF() + "�");
					break;

				case 11:
					JOptionPane.showMessageDialog(null,
							"O Produto do Dobro do Primeiro com Metade do Segundo � :" + Lista.questaoA() + "\n \n"
									+ "A Soma do Triplo do primeiro com o terceiro � :" + Lista.questaoB() + "\n \n"
									+ "O terceiro elevado ao cubo � :" + Lista.questaoC());
					break;

				case 12:
					JOptionPane.showMessageDialog(null,
							"Resultado do exercicio 12 \n \n - Seu peso � de :" + Lista.pesoIdeal() + "Kg");
					break;

				case 13:
					JOptionPane.showMessageDialog(null,
							"\n \n Salario Bruto � : R$" + Lista.salarioBruto() + "\n \n" + "Voc� pagou R$"
									+ Lista.inss() + " de INSS \n \n" + "Voc� pagou R$" + Lista.ir()
									+ " de Imposto de Renda \n \n" + "Voce Pagou R$" + Lista.sindicato()
									+ " ao sindicato \n \n" + "Salario Liquido � de R$" + Lista.liquido());
					break;

				case 14:
					JOptionPane.showMessageDialog(null, "seu arquivo ira demorar " + Lista.tempoDownload() + "m");
					break;

				default:
					JOptionPane.showMessageDialog(null, "N�o � uma op��o valida");
					break;
				}

			} else
				JOptionPane.showMessageDialog(null, "Acesso Negado");

		} catch (Exception e) {
			e.printStackTrace();
			JOptionPane.showMessageDialog(null, "Erro ao processar o arquivo");
		}
	}

}
