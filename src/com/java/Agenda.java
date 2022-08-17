package com.java;

import java.util.Scanner;

public class Agenda {

	public static void main(String[] args) {

		String[] nome = new String[1000];
		String[] data = new String[1000];
		String[] hora = new String[1000];
		String[] titulo = new String[1000];

		for (int i = 0; i < nome.length; i++) {
			nome[i] = "";
			data[i] = "";
			hora[i] = "";
			titulo[i] = "";
			

		}

		int opcao = 0, listarPor = 0, posicao = 0, codigoPesquisa = 0;
		String continuar = "", nomeExcluir = "", nomePesquisa = "";

		Scanner entrada = new Scanner(System.in);

		do {
			
			System.out
			.println("Agenda - IK \r\n");
			System.out
					.println("Escolha a op��o: \r\n \r\n 1-Adicionar Evento \r\n 2-Listar \r\n 3-Excluir \r\n 4-Sair");
			opcao = entrada.nextInt(); 
			entrada.nextLine();

			switch (opcao) {
			case 1:
				// C�digo para Incluir
				
				if (posicao < nome.length) {					
					do {
						
						System.out.print("Digite o nome do Evento: ");
						nome[posicao] = entrada.nextLine();

						System.out.print("Digite a data: ");
						data[posicao] = entrada.nextLine();

						System.out.print("Digite a hora: ");
						hora[posicao] = entrada.nextLine();
						
						System.out.print("Digite o titulo: ");
						titulo[posicao] = entrada.nextLine();

						System.out.print("Deseja continuar o cadastramento? \r\n \r\n 1-Sim \r\n 2-N�o \r\n ");
						continuar = entrada.nextLine();

						posicao++;

					} while (continuar.equals("1"));
					
				} else {
					
					System.out.println("Sua agenda est� cheia.");

				}


				break;

			case 2:
				System.out.println("Como deseja pesquisar? \r\n \r\n 1-C�digo \r\n 2-Nome do Evento \r\n 3-Todos");
				listarPor = entrada.nextInt();
				entrada.nextLine();
				
				switch (listarPor) {
				case 1:
					System.out.println("Digite o c�digo para pesquisa: ");
					codigoPesquisa = entrada.nextInt();
					entrada.nextLine();
					
					if (codigoPesquisa < nome.length && codigoPesquisa >= 0) {
						
					System.out.println("Nome: " + nome[codigoPesquisa] + 
							"\r\n Data: " + data[codigoPesquisa] + 
							"\r\n Hora: " + hora[codigoPesquisa] +
							"\r\n T�tulo : " + titulo[codigoPesquisa]);
						
					} else {
						
						System.out.println("C�digo Inv�lido!");

					}
					System.out.println("Para retornar aperte ENTER");
					break;
					
				case 2:
					System.out.println("Digite o nome para pesquisa: ");
					nomePesquisa = entrada.nextLine();
					
					for (int i = 0; i < data.length; i++) {
						
						if (nome[i].equalsIgnoreCase(nomePesquisa)) {
							
							System.out.println("Nome: " + nome[i] + 
									"\r\n Data: " + data[codigoPesquisa] + 
									"\r\n Hora: " + hora[codigoPesquisa] +
									"\r\n T�tulo: " + titulo[codigoPesquisa]);							
						}
						
					}
					System.out.println("Para retornar aperte ENTER");
					break;
					
				case 3:
					// C�digo que lista todos os dados.
					for (int i = 0; i < nome.length; i++) {

						if (!nome[i].equals("")) {

							System.out.println("Nome: " + nome[i] + "\r\n Data: "
									+ data[i] + "\r\n Hora: " + hora[i] + "\r\n T�tulo: " + titulo[i]);

						}

					}
					System.out.println("Para retornar aperte ENTER");
					break;
					
				default:
					System.out.println("Op��o inv�lida! Escolha n�meros de 1 a 3");
					
					break;
				}

				
				


			case 3:
				// C�digo para Excluir
				System.out.println("Qual o nome do evento que deseja excluir? ");
				nomeExcluir = entrada.nextLine();

				for (int i = 0; i < nome.length; i++) {
					if (nome[i].equals(nomeExcluir)) {

						nome[i] = "";
						data[i] = "";
						hora[i] = "";
						titulo[i] = "";
					}

				}

				break;
			case 4:
				// C�digo para Sair
				System.out.println("Agenda fechada!");
				return;

			default:
				// Op��o Invalida!
				System.out.println("Op��o Inv�lida! Tente novamente.");
				break;
			}

		} while (opcao != 4);

	}

}

