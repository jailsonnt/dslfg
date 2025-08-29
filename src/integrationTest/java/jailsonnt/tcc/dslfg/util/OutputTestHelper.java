package jailsonnt.tcc.dslfg.util;

import jailsonnt.tcc.dslfg.interfaceDoUsuario.InterfaceDoUsuario;

import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class OutputTestHelper implements InterfaceDoUsuario {
	private final Map<String, String> expectedOutputs = new HashMap<>();
	private static String currentAlgorithmName;
	private static StringBuilder currentAlgorithmOutput = new StringBuilder();

	public OutputTestHelper() {
		loadExpectedOutputs();
	}

	@Override
	public void imprimir(String text) {
		currentAlgorithmOutput.append(text);
	}

	public static void setCurrentAlgorithm(String algorithmName) {
		OutputTestHelper.currentAlgorithmName = algorithmName;
		currentAlgorithmOutput = new StringBuilder();
	}

	private void loadExpectedOutputs() {
		expectedOutputs.put("exemplos\\conjuntos\\conjuntoSimples.dslfg", "\n{1.5, 3.0, 5.0, 4.0, 2.0, }\n");
		expectedOutputs.put("exemplos\\conjuntos\\conjuntoSimples2.dslfg", "\n{}\n\n{1.5, 3.0, 5.0, 4.0, 2.0, }\n\n{1.5, 3.0, 8.0, 5.0, 4.0, 2.0, }\n");
		expectedOutputs.put("exemplos\\estruturais\\comandoSe.dslfg", "\n{3.0, 5.0, 4.0, 2.0, 1.0, }\n\n{5.0, 4.0, }\n\n{3.0, 8.0, 5.0, 4.0, 2.0, 1.0, }\n");
		expectedOutputs.put("exemplos\\estruturais\\comandoSe2.dslfg", "\n{3.0, 5.0, 4.0, 2.0, 1.0, }\n\n{5.0, 4.0, }\n\n{7.0, 6.0, 8.0, }\n\n{3.0, 8.0, 5.0, 4.0, 2.0, 1.0, }\n");
		expectedOutputs.put("exemplos\\estruturais\\comandoEnquanto.dslfg", "\n{1.0, }\n\n{3.0, 5.0, 4.0, 2.0, 1.0, }\n");
		expectedOutputs.put("exemplos\\estruturais\\comandoEnquantoComSe.dslfg", "\n{3.0, 5.0, 4.0, 2.0, 1.0, }\n\n{1.0, }\n\n{3.0, 2.0, 1.0, }\n\n{3.0, 5.0, 4.0, 2.0, 1.0, }\n");
		expectedOutputs.put("exemplos\\funcoes\\conjuntoRetirar.dslfg", "\n{3.0, 5.0, 4.0, 2.0, 1.0, }\n\n{3.0, 5.0, 1.0, }\n\n{4.0, 2.0, }\n");
		expectedOutputs.put("exemplos\\funcoes\\grafoefuncaoObterVerticeDe.dslfg", "Brusque");
		expectedOutputs.put("exemplos\\funcoes\\mostrar", "\n{7.0, 6.0, 3.0, 8.0, 5.0, 9.0, 4.0, 2.0, 1.0, }\n20.0Fim");
	}

	public void runTest() {
		String expected = expectedOutputs.get(currentAlgorithmName);
		if (expected != null) {
			assertEquals(expected, currentAlgorithmOutput.toString());
			System.out.println(currentAlgorithmName + " (output) PASSED");
		}
	}
}
