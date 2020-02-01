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
							"Resultado do exercicio 3 \n \n - Soma dos numeros é :" + Lista.somar());
					break;

				case 4:
					JOptionPane.showMessageDialog(null,
							"Resultado do exercicio 4 \n \n - Media das notas informadas é :" + Lista.media());
					break;

				case 5:
					JOptionPane.showMessageDialog(null, "Resultado do exercicio 5 \n \n - Os Metros informados dão  : "
							+ Lista.converterMetrosemCentimetros() + " Centimetros");
					break;

				case 6:
					JOptionPane.showMessageDialog(null,
							"Resultado do exercicio 6 \n \n - A Area do circulo é : " + Lista.circulo());
					break;

				case 7:
					JOptionPane.showMessageDialog(null, "Resultado do exercicio 7 \n \n - A Area do quadrado é : "
							+ Lista.quadradoArea() + "\n" + "O Dobro dessa area é : " + Lista.quadradoAreaDobro());
					break;

				case 8:
					JOptionPane.showMessageDialog(null,
							"Resultado do exercicio 8 \n \n - Ira receber : " + Lista.salario() + " Nesse mes.");
					break;

				case 9:
					JOptionPane.showMessageDialog(null,
							"Resultado do exercicio 9 \n \n - A Temperatura informada em Celsius será : "
									+ Lista.temperaturasC() + "º");
					break;

				case 10:
					JOptionPane.showMessageDialog(null,
							"Resultado do exercicio 10 \n \n - A Temperatura informada em Farenheit será : "
									+ Lista.temperaturasF() + "º");
					break;

				case 11:
					JOptionPane.showMessageDialog(null,
							"O Produto do Dobro do Primeiro com Metade do Segundo é :" + Lista.questaoA() + "\n \n"
									+ "A Soma do Triplo do primeiro com o terceiro é :" + Lista.questaoB() + "\n \n"
									+ "O terceiro elevado ao cubo é :" + Lista.questaoC());
					break;

				case 12:
					JOptionPane.showMessageDialog(null,
							"Resultado do exercicio 12 \n \n - Seu peso é de :" + Lista.pesoIdeal() + "Kg");
					break;

				case 13:
					JOptionPane.showMessageDialog(null,
							"\n \n Salario Bruto é : R$" + Lista.salarioBruto() + "\n \n" + "Você pagou R$"
									+ Lista.inss() + " de INSS \n \n" + "Você pagou R$" + Lista.ir()
									+ " de Imposto de Renda \n \n" + "Voce Pagou R$" + Lista.sindicato()
									+ " ao sindicato \n \n" + "Salario Liquido é de R$" + Lista.liquido());
					break;

				case 14:
					JOptionPane.showMessageDialog(null, "seu arquivo ira demorar " + Lista.tempoDownload() + "m");
					break;

				default:
					JOptionPane.showMessageDialog(null, "Não é uma opção valida");
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
