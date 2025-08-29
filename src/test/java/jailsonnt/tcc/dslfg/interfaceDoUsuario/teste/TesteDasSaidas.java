package jailsonnt.tcc.dslfg.interfaceDoUsuario.teste;

import static org.junit.jupiter.api.Assertions.assertEquals;
import jailsonnt.tcc.dslfg.interfaceDoUsuario.InterfaceDoUsuario;

import java.util.HashMap;
import java.util.Map;

public class TesteDasSaidas implements InterfaceDoUsuario {
	private final Map<String, String> respostasEsperadas = new HashMap<>();
	private static String nomeAlgoritmoAtual;
	private static StringBuilder saidaAlgoritmoAtual = new StringBuilder();

	public TesteDasSaidas() {
		carregarRespostasEsperadas();
	}

	@Override
	public void imprimir(String texto) {
		saidaAlgoritmoAtual.append(texto);
	}

	public static void definirAlgoritmoAtual(String algoritmoAtual){
		TesteDasSaidas.nomeAlgoritmoAtual = algoritmoAtual;
		saidaAlgoritmoAtual = new StringBuilder();
	}

	private void carregarRespostasEsperadas() {
		respostasEsperadas.put("exemplos\\conjuntos\\conjuntoSimples.dslfg", "\n{1.5, 3.0, 5.0, 4.0, 2.0, }\n");
		respostasEsperadas.put("exemplos\\conjuntos\\conjuntoSimples2.dslfg", "\n{}\n\n{1.5, 3.0, 5.0, 4.0, 2.0, }\n\n{1.5, 3.0, 8.0, 5.0, 4.0, 2.0, }\n");
		respostasEsperadas.put("exemplos\\estruturais\\comandoSe.dslfg", "\n{3.0, 5.0, 4.0, 2.0, 1.0, }\n\n{5.0, 4.0, }\n\n{3.0, 8.0, 5.0, 4.0, 2.0, 1.0, }\n");
		respostasEsperadas.put("exemplos\\estruturais\\comandoSe2.dslfg", "\n{3.0, 5.0, 4.0, 2.0, 1.0, }\n\n{5.0, 4.0, }\n\n{7.0, 6.0, 8.0, }\n\n{3.0, 8.0, 5.0, 4.0, 2.0, 1.0, }\n");
		respostasEsperadas.put("exemplos\\estruturais\\comandoEnquanto.dslfg", "\n{1.0, }\n\n{3.0, 5.0, 4.0, 2.0, 1.0, }\n");
		respostasEsperadas.put("exemplos\\estruturais\\comandoEnquantoComSe.dslfg", "\n{3.0, 5.0, 4.0, 2.0, 1.0, }\n\n{1.0, }\n\n{3.0, 2.0, 1.0, }\n\n{3.0, 5.0, 4.0, 2.0, 1.0, }\n");
		respostasEsperadas.put("exemplos\\funcoes\\conjuntoRetirar.dslfg", "\n{3.0, 5.0, 4.0, 2.0, 1.0, }\n\n{3.0, 5.0, 1.0, }\n\n{4.0, 2.0, }\n");
		respostasEsperadas.put("exemplos\\funcoes\\grafoefuncaoObterVerticeDe.dslfg", "Brusque");
		respostasEsperadas.put("exemplos\\funcoes\\mostrar", "\n{7.0, 6.0, 3.0, 8.0, 5.0, 9.0, 4.0, 2.0, 1.0, }\n20.0Fim");
	}

	public void executarTeste() {
		String respostaEsperada = respostasEsperadas.get(nomeAlgoritmoAtual);
		if (respostaEsperada != null) {
			assertEquals(respostaEsperada, saidaAlgoritmoAtual.toString());
			System.out.println(nomeAlgoritmoAtual + " executado com sucesso");
		}
	}
}