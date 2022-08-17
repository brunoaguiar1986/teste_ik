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
					.println("Escolha a opção: \r\n \r\n 1-Adicionar Evento \r\n 2-Listar \r\n 3-Excluir \r\n 4-Sair");
			opcao = entrada.nextInt(); 
			entrada.nextLine();

			switch (opcao) {
			case 1:
				// Código para Incluir
				
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

						System.out.print("Deseja continuar o cadastramento? \r\n \r\n 1-Sim \r\n 2-Não \r\n ");
						continuar = entrada.nextLine();

						posicao++;

					} while (continuar.equals("1"));
					
				} else {
					
					System.out.println("Sua agenda está cheia.");

				}


				break;

			case 2:
				System.out.println("Como deseja pesquisar? \r\n \r\n 1-Código \r\n 2-Nome do Evento \r\n 3-Todos");
				listarPor = entrada.nextInt();
				entrada.nextLine();
				
				switch (listarPor) {
				case 1:
					System.out.println("Digite o código para pesquisa: ");
					codigoPesquisa = entrada.nextInt();
					entrada.nextLine();
					
					if (codigoPesquisa < nome.length && codigoPesquisa >= 0) {
						
					System.out.println("Nome: " + nome[codigoPesquisa] + 
							"\r\n Data: " + data[codigoPesquisa] + 
							"\r\n Hora: " + hora[codigoPesquisa] +
							"\r\n Título : " + titulo[codigoPesquisa]);
						
					} else {
						
						System.out.println("Código Inválido!");

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
									"\r\n Título: " + titulo[codigoPesquisa]);							
						}
						
					}
					System.out.println("Para retornar aperte ENTER");
					break;
					
				case 3:
					// Código que lista todos os dados.
					for (int i = 0; i < nome.length; i++) {

						if (!nome[i].equals("")) {

							System.out.println("Nome: " + nome[i] + "\r\n Data: "
									+ data[i] + "\r\n Hora: " + hora[i] + "\r\n Título: " + titulo[i]);

						}

					}
					System.out.println("Para retornar aperte ENTER");
					break;
					
				default:
					System.out.println("Opção inválida! Escolha números de 1 a 3");
					
					break;
				}

				
				


			case 3:
				// Código para Excluir
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
				// Código para Sair
				System.out.println("Agenda fechada!");
				return;

			default:
				// Opção Invalida!
				System.out.println("Opção Inválida! Tente novamente.");
				break;
			}

		} while (opcao != 4);

	}

}

