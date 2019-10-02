package br.com.fiap.fullStack.conteudo;

public class TestaPessoa {

	public static void main(String[] args) {

		Pessoa p1 = null;

		p1 = new Pessoa();

		p1.idade = 11;
		p1.nome = "Teste";

		System.out.println(p1.idade + "\n" + p1.nome);

	}

}
