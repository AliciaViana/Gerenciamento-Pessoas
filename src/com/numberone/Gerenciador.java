package com.numberone;

import java.util.Scanner;

public class Gerenciador {

	public static void main(String[] args) {
		Pessoa novaPessoa = new Pessoa();
 		PessoaServico pessoaServico = new PessoaServico();
		Scanner myObj = new Scanner(System.in);
		
		System.out.println("Diggite seu nome:  ");
		String nome = myObj.nextLine();
		System.out.println("digite cor do seu cabelo: ");
		String corCabelo = myObj.nextLine();
		System.out.println("Qual sua idade: ");
		int idade = myObj.nextInt();
		
		novaPessoa.setNome(nome);
		novaPessoa.setCorCabelo(corCabelo);
		novaPessoa.setIdade(idade);
		
		pessoaServico.carregaNome(novaPessoa.getNome());
		pessoaServico.carregaCorCabelo(novaPessoa.getCorCabelo());
		pessoaServico.carregaIdade(novaPessoa.getIdade());
	}
}