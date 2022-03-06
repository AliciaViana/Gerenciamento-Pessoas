package com.numberone;

public class PessoaServico {

	public void carregaNome(String nome) {
		System.out.println("Seu nome é: " + nome);
	}

	public void carregaIdade(int idade) {
		int anoNascimento = 2022 - idade;
		System.out.println("o ano que voce nasceu é " + anoNascimento);
	}

	public void carregaCorCabelo(String corCabelo) {
		System.out.println("cor do seu cabelo é: " + corCabelo);
	}
}
