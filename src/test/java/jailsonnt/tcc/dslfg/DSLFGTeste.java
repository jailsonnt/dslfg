package jailsonnt.tcc.dslfg;

import static org.junit.Assert.assertEquals;
import jailsonnt.tcc.dslfg.execucao.Objeto;
import jailsonnt.tcc.dslfg.execucao.excessoes.ExcecaoEmTempoDeExecucao;
import jailsonnt.tcc.dslfg.execucao.objetos.Booleano;
import jailsonnt.tcc.dslfg.execucao.objetos.Conjunto;
import jailsonnt.tcc.dslfg.execucao.objetos.Constante;
import jailsonnt.tcc.dslfg.execucao.objetos.Numero;
import jailsonnt.tcc.dslfg.execucao.objetos.Texto;
import jailsonnt.tcc.dslfg.execucao.objetos.grafos.Aresta;
import jailsonnt.tcc.dslfg.execucao.objetos.grafos.Grafo;
import jailsonnt.tcc.dslfg.execucao.objetos.grafos.Vertice;
import jailsonnt.tcc.dslfg.interfaceDoUsuario.AmbienteDeExecucaoDSLFG;
import jailsonnt.tcc.dslfg.interfaceDoUsuario.teste.TesteDasSaidas;

import java.io.File;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class DSLFGTeste {
	Map<String, Map<String, Objeto>> respostasParaTesteDeDespejo;
	
	public DSLFGTeste() {
		respostasParaTesteDeDespejo = new HashMap<String, Map<String,Objeto>>();
		carregaRespostasParaTesteDeDespejo();
	}

	public static void main(String[] args) {
		File pastaExemplos = new File(args[0]);
		int numeroDePastas = pastaExemplos.list().length;
		for (int indexDaPastaAtual = 0; indexDaPastaAtual<numeroDePastas;indexDaPastaAtual++) {
			File subpastaDeExemplos = new File(pastaExemplos.toString()+"\\"+pastaExemplos.list()[indexDaPastaAtual]);
			int numeroDeArquivos = subpastaDeExemplos.listFiles().length;
			for (int indexDoArquivoAtual = 0; indexDoArquivoAtual<numeroDeArquivos;indexDoArquivoAtual++) {
				File arquivoDSLFG = subpastaDeExemplos.listFiles()[indexDoArquivoAtual];
				TesteDasSaidas.definirAlgoritmoAtual(arquivoDSLFG.toString());
				AmbienteDeExecucaoDSLFG dsl = AmbienteDeExecucaoDSLFG.obterInstância();
				TesteDasSaidas consoleTeste = new TesteDasSaidas();
				dsl.fixarInterfaceDoUsuario(consoleTeste);
				dsl.carregarPrograma(arquivoDSLFG);
				try {
					dsl.executar();
				} catch (ExcecaoEmTempoDeExecucao e) {
				}
				consoleTeste.executarTeste();
				new DSLFGTeste().testesDeDespejo(arquivoDSLFG.toString(), dsl.obterDespejo());
			}
		}
	}
	
	public void testesDeDespejo (String nomeDoAlgoritmoAtual, Map<String, Objeto> listaDeDespejoAtual){
		Map<String, Objeto> despejosDoProgramaProcurado = respostasParaTesteDeDespejo.get(nomeDoAlgoritmoAtual);
		try{
			if (despejosDoProgramaProcurado != null){
				assertEquals(despejosDoProgramaProcurado, listaDeDespejoAtual);
				System.out.println(nomeDoAlgoritmoAtual+" executado com sucesso");
			}
		}catch(org.junit.ComparisonFailure excessãoNoAssert){
			System.out.println(nomeDoAlgoritmoAtual+" executado com falha:\n\n"+ excessãoNoAssert);
		}catch(java.lang.AssertionError excessãoNoAssert){
			System.out.println(nomeDoAlgoritmoAtual+" executado com falha:\n\n"+ excessãoNoAssert);
		}
		
	}

	private void carregaRespostasParaTesteDeDespejo() {
		adicionarTesteAlgoritmoDespejar();
		adicionarTesteAlgoritmoComandoEnquantoComRetorno();
		adicionarTesteAlgoritmoFuncaoPercorrerGrafo();
		adicionarTesteAlgoritmoFuncaoObterVertice();
		adicionarTesteAlgoritmoFuncaoObterPesoDaAresta();
		adicionarTesteAlgoritmoGrafoSimples();
		adicionarTesteAlgoritmoGrafoComPeso();
		adicionarTesteAlgoritmoGrafoCompleto();
		adicionarTesteAlgoritmoDefinirPropriedade();
		adicionarTesteAlgoritmoObterPropriedade();
		adicionarTesteAlgoritmoFuncoesDeIterador();
		adicionarTesteAlgoritmoFuncoesObterTodosOsVerticesEObterTodasAsArestas();
		adicionarTesteAlgoritmoFuncaoCopiargrafo();
		adicionarTesteAlgoritmoConstantes();
		adicionarTesteAlgoritmoTesteDeContexto();
		adicionarTesteAlgoritmoTesteDeContextoDois();
		adicionartesteAlgoritmoFuncaoIgual();
		adicionartesteAlgoritmoFuncaoDiferente();
		adicionarTesteAlgoritmosomaEAtribuicaoSimples();
		adicionarTesteAlgoritmoMenorOuIgual();
		adicionarTesteAlgoritmoMenor();
		adicionarTesteAlgoritmoSubtracao();
		adicionarTesteAlgoritmoMultiplicacao();
		adicionarTesteAlgoritmoDivisao();
		adicionarTesteAlgoritmoMod();
		adicionarTesteAlgoritmoDiv();
		adicionarTesteAlgoritmoMaiorOuIgual();
		adicionarTesteAlgoritmoMaior();
		adicionarTesteAlgoritmoSubconjunto();
		adicionarTesteAlgoritmoEUmElementoDe();
		adicionarTesteAlgoritmoNaoEUmElementoDe();
		adicionarTesteAlgoritmoUniao();
		adicionarTesteAlgoritmoInterseccao();
		adicionarTesteAlgoritmoDiferencaDeConjuntos();
		adicionarTesteAlgoritmoObterPropriedadeDePropriedadeInexistente();
		adicionarTesteObterVerticesAdjacentes();
	}
	
	private void adicionarTesteAlgoritmoObterPropriedadeDePropriedadeInexistente() {
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("valor", new Booleano(false));
		
		respostasParaTesteDeDespejo.put("exemplos\\funcoes\\obterPropriedadeDePropriedadeInexistente.dslfg", novaListaDeDespejo);
	}

	private void adicionarTesteAlgoritmoDiferencaDeConjuntos() {
		Conjunto conjunto = new Conjunto();
		conjunto.adicionarElemento(new Numero(1.0));
		conjunto.adicionarElemento(new Numero(3.0));
		
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("conjunto", conjunto);
		
		respostasParaTesteDeDespejo.put("exemplos\\operadores\\diferencaDeConjuntos.dslfg", novaListaDeDespejo);
	}

	private void adicionarTesteAlgoritmoInterseccao() {
		Conjunto conjunto = new Conjunto();
		conjunto.adicionarElemento(new Numero(0.0));
		
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("conjunto", conjunto);
		
		respostasParaTesteDeDespejo.put("exemplos\\operadores\\interseccao.dslfg", novaListaDeDespejo);
	}

	private void adicionarTesteAlgoritmoUniao() {
		Conjunto conjunto = new Conjunto();
		conjunto.adicionarElemento(new Numero(0.0));
		conjunto.adicionarElemento(new Numero(1.0));
		
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("conjunto", conjunto);
		
		respostasParaTesteDeDespejo.put("exemplos\\operadores\\uniao.dslfg", novaListaDeDespejo);
	
	}

	private void adicionarTesteAlgoritmoNaoEUmElementoDe() {
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("x", new Booleano(false));
		novaListaDeDespejo.put("y", new Booleano(true));
		
		respostasParaTesteDeDespejo.put("exemplos\\operadores\\naoEUmElementoDe.dslfg", novaListaDeDespejo);
	}
	
	private void adicionarTesteAlgoritmoEUmElementoDe() {
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("x", new Booleano(true));
		novaListaDeDespejo.put("y", new Booleano(false));
		
		respostasParaTesteDeDespejo.put("exemplos\\operadores\\eUmElementoDe.dslfg", novaListaDeDespejo);
	}
	
	private void adicionarTesteAlgoritmoSubconjunto() {
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("x", new Booleano(true));
		novaListaDeDespejo.put("y", new Booleano(false));
		
		respostasParaTesteDeDespejo.put("exemplos\\operadores\\subconjunto.dslfg", novaListaDeDespejo);
	}

	private void adicionarTesteAlgoritmoMaior() {
		Numero a = new Numero(1);
		Numero b = new Numero(0);
		Numero c = new Numero(0);
		
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("a", a);
		novaListaDeDespejo.put("b", b);
		novaListaDeDespejo.put("c", c);
		
		respostasParaTesteDeDespejo.put("exemplos\\operadores\\maior.dslfg", novaListaDeDespejo);
	}
	private void adicionarTesteAlgoritmoMaiorOuIgual() {
		Numero a = new Numero(1);
		Numero b = new Numero(1);
		Numero c = new Numero(0);
		
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("a", a);
		novaListaDeDespejo.put("b", b);
		novaListaDeDespejo.put("c", c);
		
		respostasParaTesteDeDespejo.put("exemplos\\operadores\\maiorOuIgual.dslfg", novaListaDeDespejo);
	}

	private void adicionarTesteAlgoritmoDiv() {
		Numero numero = new Numero(2.0);
		
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("x", numero);
		
		respostasParaTesteDeDespejo.put("exemplos\\operadores\\div.dslfg", novaListaDeDespejo);
	}

	private void adicionarTesteAlgoritmoMod() {
		Numero numero = new Numero(1.0);
		
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("x", numero);
		
		respostasParaTesteDeDespejo.put("exemplos\\operadores\\mod.dslfg", novaListaDeDespejo);
	}

	private void adicionarTesteAlgoritmoDivisao() {
		Numero numero = new Numero(1.25);
		
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("x", numero);
		
		respostasParaTesteDeDespejo.put("exemplos\\operadores\\divisao.dslfg", novaListaDeDespejo);
	}

	private void adicionarTesteAlgoritmoMultiplicacao() {
		Numero numero = new Numero(20.0);
		
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("x", numero);
		
		respostasParaTesteDeDespejo.put("exemplos\\operadores\\multiplicacao.dslfg", novaListaDeDespejo);
	}

	private void adicionarTesteAlgoritmoSubtracao() {
		Numero numero = new Numero(1.0);
		Texto resultado = new Texto("retirar daqui");
		
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("x", numero);
		novaListaDeDespejo.put("resultado", resultado);
		respostasParaTesteDeDespejo.put("exemplos\\operadores\\subtracao.dslfg", novaListaDeDespejo);
	}

	private void adicionarTesteAlgoritmoMenor() {
		Numero a = new Numero(0);
		Numero b = new Numero(0);
		Numero c = new Numero(1);
		
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("a", a);
		novaListaDeDespejo.put("b", b);
		novaListaDeDespejo.put("c", c);
		
		respostasParaTesteDeDespejo.put("exemplos\\operadores\\menor.dslfg", novaListaDeDespejo);
	}

	private void adicionarTesteAlgoritmoMenorOuIgual() {
		Numero a = new Numero(0);
		Numero b = new Numero(1);
		Numero c = new Numero(1);
		
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("a", a);
		novaListaDeDespejo.put("b", b);
		novaListaDeDespejo.put("c", c);
		
		respostasParaTesteDeDespejo.put("exemplos\\operadores\\menorOuIgual.dslfg", novaListaDeDespejo);
		
	}

	private void adicionarTesteAlgoritmosomaEAtribuicaoSimples() {
		Numero numero = new Numero(9.0);
		
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("x", numero);
		
		respostasParaTesteDeDespejo.put("exemplos\\operadores\\somaEAtribuicaoSimples.dslfg", novaListaDeDespejo);
	}

	private void adicionartesteAlgoritmoFuncaoDiferente() {
		Numero numeroTres = new Numero(3.0);
		Numero numeroQuatro = new Numero(4.0);
		Set<Objeto> conjunto = new HashSet<Objeto>();
		conjunto.add(numeroTres);
		conjunto.add(numeroQuatro);
		Conjunto conjuntoEsperado1 = new Conjunto(conjunto);
		Conjunto conjuntoEsperado2 = new Conjunto(conjunto);
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("conjuntoEsperado1", conjuntoEsperado1);
		novaListaDeDespejo.put("conjuntoEsperado2", conjuntoEsperado2);
		
		respostasParaTesteDeDespejo.put("exemplos\\funcoes\\OperadorLogicoDiferente.dslfg", novaListaDeDespejo);
	}

	private void adicionartesteAlgoritmoFuncaoIgual() {
		Numero numeroTres = new Numero(3.0);
		Numero numeroQuatro = new Numero(4.0);
		Set<Objeto> conjunto = new HashSet<Objeto>();
		conjunto.add(numeroTres);
		conjunto.add(numeroQuatro);
		Conjunto conjuntoEsperado1 = new Conjunto(conjunto);
		Conjunto conjuntoEsperado2 = new Conjunto(conjunto);
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("conjuntoEsperado1", conjuntoEsperado1);
		novaListaDeDespejo.put("conjuntoEsperado2", conjuntoEsperado2);
		
		respostasParaTesteDeDespejo.put("exemplos\\funcoes\\OperadorLogicoIgual.dslfg", novaListaDeDespejo);
	}

	private void adicionarTesteAlgoritmoTesteDeContextoDois() {
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("x", new Booleano(false));
		
		respostasParaTesteDeDespejo.put("exemplos\\estruturais\\testeDeContextoDois.dslfg", novaListaDeDespejo);
	}

	private void adicionarTesteAlgoritmoTesteDeContexto() {
		Conjunto conjunto = new Conjunto();
		conjunto.adicionarElemento(new Numero(2.0));
		conjunto.adicionarElemento(new Numero(3.0));
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("x", conjunto);
		
		respostasParaTesteDeDespejo.put("exemplos\\estruturais\\testeDeContexto.dslfg", novaListaDeDespejo);
	}

	private void adicionarTesteAlgoritmoConstantes() {
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("valorMaximo", new Constante("numeroMaximo"));
		novaListaDeDespejo.put("valorMinimo", new Constante("numeroMinimo"));
		
		respostasParaTesteDeDespejo.put("exemplos\\funcoes\\constantes.dslfg", novaListaDeDespejo);
	}

	private void adicionarTesteAlgoritmoFuncaoCopiargrafo() {
		Set<Vertice> vertices = new HashSet<Vertice>();
		Vertice Navegantes = new Vertice("Navegantes");
		Navegantes.adicionarPropriedade("populacao", new Numero(2.0));
		vertices.add(Navegantes);
		Vertice Itajai = new Vertice("Itajai");
		Itajai.adicionarPropriedade("populacao", new Numero(4.0));
		vertices.add(Itajai);
		Vertice BalnearioCamboriu = new Vertice("BalnearioCamboriu");
		vertices.add(BalnearioCamboriu);
		Vertice Brusque = new Vertice("Brusque");
		vertices.add(Brusque);
		
		Set<Aresta> arestas = new HashSet<Aresta>();
		Aresta arestaNavegantesItajai = new Aresta(Navegantes, Itajai);
		arestaNavegantesItajai.definirPeso(2.0);
		arestas.add(arestaNavegantesItajai);
		Aresta arestaItajaiBalneario = new Aresta(Itajai, BalnearioCamboriu);
		arestaItajaiBalneario.definirPeso(3.5);
		arestas.add(arestaItajaiBalneario);
		Aresta arestaItajaiBrusque = new Aresta(Itajai, Brusque);
		arestaItajaiBrusque.definirPeso(5.0);
		arestas.add(arestaItajaiBrusque);
		
		Grafo grafoOriginal = new Grafo("grafoOriginal", vertices, arestas,"digrafo");
		Grafo grafoCopia = new Grafo("grafoOriginal", vertices, arestas,"digrafo");
		
		
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("grafoOriginal", grafoOriginal);
		novaListaDeDespejo.put("grafoCopia", grafoCopia);
		respostasParaTesteDeDespejo.put("exemplos\\funcoes\\funcaoCopiarGrafo.dslfg", novaListaDeDespejo);
		
	}

	private void adicionarTesteAlgoritmoFuncoesObterTodosOsVerticesEObterTodasAsArestas() {
		Conjunto vertices = new Conjunto();
		Vertice Navegantes = new Vertice("Navegantes");
		Vertice Itajai = new Vertice("Itajai");
		Vertice BalnearioCamboriu = new Vertice("BalnearioCamboriu");
		Vertice Brusque = new Vertice("Brusque");
		vertices.adicionarElemento(Navegantes);
		vertices.adicionarElemento(Itajai);
		vertices.adicionarElemento(BalnearioCamboriu);
		vertices.adicionarElemento(Brusque);
		
		Conjunto arestas = new Conjunto();
		Aresta arestaNavegantesItajai = new Aresta(Navegantes, Itajai);
		Aresta arestaItajaiBalneario = new Aresta(Itajai, BalnearioCamboriu);
		Aresta arestaItajaiBrusque = new Aresta(Itajai, Brusque);
		arestas.adicionarElemento(arestaNavegantesItajai);
		arestas.adicionarElemento(arestaItajaiBalneario);
		arestas.adicionarElemento(arestaItajaiBrusque);
		
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("vertices", vertices);
		novaListaDeDespejo.put("arestas", arestas);
		respostasParaTesteDeDespejo.put("exemplos\\funcoes\\funcoesObterTodosOsVerticesEObterTodasAsArestas.dslfg", novaListaDeDespejo);
	}

	private void adicionarTesteAlgoritmoFuncoesDeIterador() {
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("status", new Booleano(true));
		novaListaDeDespejo.put("status2", new Booleano(false));
		respostasParaTesteDeDespejo.put("exemplos\\funcoes\\funcoesDeIterador.dslfg", novaListaDeDespejo);
	}

	private void adicionarTesteAlgoritmoObterPropriedade() {
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("valor", new Numero(5.0));
		respostasParaTesteDeDespejo.put("exemplos\\funcoes\\funcaoObterPropriedade.dslfg", novaListaDeDespejo);
	}

	private void adicionarTesteAlgoritmoDefinirPropriedade() {
		
		Vertice Navegantes = new Vertice("Navegantes");
		Navegantes.adicionarPropriedade("valor", new Numero(5.0));
		
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("vertice", Navegantes);
		respostasParaTesteDeDespejo.put("exemplos\\funcoes\\definirPropriedadeEmVertice.dslfg", novaListaDeDespejo);
	}
		
	

	private void adicionarTesteAlgoritmoGrafoCompleto() {
		Set<Vertice> vertices = new HashSet<Vertice>();
		Vertice Navegantes = new Vertice("Navegantes");
		Navegantes.adicionarPropriedade("populacao", new Numero(2.0));
		vertices.add(Navegantes);
		Vertice Itajai = new Vertice("Itajai");
		Itajai.adicionarPropriedade("populacao", new Numero(4.0));
		vertices.add(Itajai);
		Vertice BalnearioCamboriu = new Vertice("BalnearioCamboriu");
		vertices.add(BalnearioCamboriu);
		Vertice Brusque = new Vertice("Brusque");
		vertices.add(Brusque);
		
		Set<Aresta> arestas = new HashSet<Aresta>();
		Aresta arestaNavegantesItajai = new Aresta(Navegantes, Itajai);
		arestaNavegantesItajai.definirPeso(2.0);
		arestas.add(arestaNavegantesItajai);
		Aresta arestaItajaiBalneario = new Aresta(Itajai, BalnearioCamboriu);
		arestaItajaiBalneario.definirPeso(3.5);
		arestas.add(arestaItajaiBalneario);
		Aresta arestaItajaiBrusque = new Aresta(Itajai, Brusque);
		arestaItajaiBrusque.definirPeso(5.0);
		arestas.add(arestaItajaiBrusque);
		
		Grafo grafo = new Grafo("grafoExemploUmDoLivro", vertices, arestas,"digrafo");
		
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("grafoExemploUmDoLivro", grafo);
		respostasParaTesteDeDespejo.put("exemplos\\grafos\\grafoCompleto.dslfg", novaListaDeDespejo);
		
	}

	private void adicionarTesteAlgoritmoGrafoComPeso() {
		Set<Vertice> vertices = new HashSet<Vertice>();
		Vertice Navegantes = new Vertice("Navegantes");
		vertices.add(Navegantes);
		Vertice Itajai = new Vertice("Itajai");
		vertices.add(Itajai);
		Vertice BalnearioCamboriu = new Vertice("BalnearioCamboriu");
		vertices.add(BalnearioCamboriu);
		Vertice Brusque = new Vertice("Brusque");
		vertices.add(Brusque);
		
		Set<Aresta> arestas = new HashSet<Aresta>();
		Aresta arestaNavegantesItajai = new Aresta(Navegantes, Itajai);
		arestaNavegantesItajai.definirPeso(2.0);
		arestas.add(arestaNavegantesItajai);
		Aresta arestaItajaiBalneario = new Aresta(Itajai, BalnearioCamboriu);
		arestaItajaiBalneario.definirPeso(3.5);
		arestas.add(arestaItajaiBalneario);
		Aresta arestaItajaiBrusque = new Aresta(Itajai, Brusque);
		arestaItajaiBrusque.definirPeso(5.0);
		arestas.add(arestaItajaiBrusque);
		
		Grafo grafo = new Grafo("grafoExemploUmDoLivro", vertices, arestas,"digrafo");
		
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("grafoExemploUmDoLivro", grafo);
		respostasParaTesteDeDespejo.put("exemplos\\grafos\\grafoComPeso.dslfg", novaListaDeDespejo);
	}
	
	private void adicionarTesteAlgoritmoGrafoSimples() {
		Set<Vertice> verticesDigrafo = new HashSet<Vertice>();
		Vertice Navegantes = new Vertice("Navegantes");
		verticesDigrafo.add(Navegantes);
		Vertice Itajai = new Vertice("Itajai");
		verticesDigrafo.add(Itajai);
		Vertice BalnearioCamboriu = new Vertice("BalnearioCamboriu");
		verticesDigrafo.add(BalnearioCamboriu);
		Vertice Brusque = new Vertice("Brusque");
		verticesDigrafo.add(Brusque);
		
		Set<Aresta> arestasDigrafo = new HashSet<Aresta>();
		Aresta arestaNavegantesItajai = new Aresta(Navegantes, Itajai);
		arestasDigrafo.add(arestaNavegantesItajai);
		Aresta arestaItajaiBalneario = new Aresta(Itajai, BalnearioCamboriu);
		arestasDigrafo.add(arestaItajaiBalneario);
		Aresta arestaItajaiBrusque = new Aresta(Itajai, Brusque);
		arestasDigrafo.add(arestaItajaiBrusque);
		
		Grafo digrafo = new Grafo("digrafoExemploUmDoLivro", verticesDigrafo, arestasDigrafo,"digrafo");
		
		
		Grafo grafo = new Grafo("grafoExemploUmDoLivro", verticesDigrafo, arestasDigrafo,"grafo");
		
		
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("grafoExemploUmDoLivro", grafo);
		novaListaDeDespejo.put("digrafoExemploUmDoLivro", digrafo);
		respostasParaTesteDeDespejo.put("exemplos\\grafos\\grafoSimples.dslfg", novaListaDeDespejo);
	}

	private void adicionarTesteAlgoritmoFuncaoObterPesoDaAresta() {
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("pesoDaAresta", new Numero(1.0));
		respostasParaTesteDeDespejo.put("exemplos\\funcoes\\funcaoObterPesoDaAresta.dslfg", novaListaDeDespejo);
	}

	private void adicionarTesteAlgoritmoFuncaoObterVertice() {
		Vertice vertice = new Vertice("Navegantes");
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("vertice", vertice);
		respostasParaTesteDeDespejo.put("exemplos\\funcoes\\funcaoObterVertice.dslfg", novaListaDeDespejo);
		
	}

	private void adicionarTesteAlgoritmoFuncaoPercorrerGrafo() {
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		respostasParaTesteDeDespejo.put("exemplos\\funcoes\\funcaoPercorrerGrafo.dslfg", novaListaDeDespejo);
		
	}

	private void adicionarTesteAlgoritmoComandoEnquantoComRetorno() {
		Set<Objeto> setDeConjunto = new HashSet<Objeto>();
		setDeConjunto.add(new Numero(1.0));
		setDeConjunto.add(new Numero(2.0));
		setDeConjunto.add(new Numero(3.0));
		setDeConjunto.add(new Numero(4.0));
		Conjunto conjunto = new Conjunto(setDeConjunto);
		Set<Objeto> setDeConjunto2 = new HashSet<Objeto>();
		setDeConjunto2.add(new Numero(6.0));
		setDeConjunto2.add(new Numero(7.0));
		setDeConjunto2.add(new Numero(8.0));
		Conjunto conjunto2 = new Conjunto(setDeConjunto2);
		Set<Objeto> setDeConjunto3 = new HashSet<Objeto>();
		setDeConjunto3.add(new Numero(9.0));
		setDeConjunto3.add(new Numero(10.0));
		setDeConjunto3.add(new Numero(11.0));
		Conjunto conjunto3 = new Conjunto(setDeConjunto3);
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("conjunto", conjunto);
		novaListaDeDespejo.put("conjunto2", conjunto2);
		novaListaDeDespejo.put("conjunto3", conjunto3);
		respostasParaTesteDeDespejo.put("exemplos\\funcoes\\funcaoDeUsuarioComRetorno.dslfg", novaListaDeDespejo);
	}

	private void adicionarTesteAlgoritmoDespejar(){
		Set<Objeto> setConjuntoPrincipal = new HashSet<Objeto>();
		setConjuntoPrincipal.add(new Numero(1.0));
		setConjuntoPrincipal.add(new Numero(2.0));
		setConjuntoPrincipal.add(new Numero(3.0));
		setConjuntoPrincipal.add(new Numero(4.0));
		setConjuntoPrincipal.add(new Numero(5.0));
		Conjunto conjuntoPrincipal = new Conjunto(setConjuntoPrincipal);
		Set<Objeto> setConjuntoRetirar = new HashSet<Objeto>();
		setConjuntoRetirar.add(new Numero(1.0));
		setConjuntoRetirar.add(new Numero(5.0));
		setConjuntoRetirar.add(new Numero(3.0));
		Conjunto conjuntoRetirar = new Conjunto(setConjuntoRetirar);
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("conjuntoPrincipal", conjuntoPrincipal);
		novaListaDeDespejo.put("conjuntoRetirar", conjuntoRetirar);
		
		respostasParaTesteDeDespejo.put("exemplos\\funcoes\\despejar.dslfg", novaListaDeDespejo);
	}
	
	private void adicionarTesteObterVerticesAdjacentes(){
		Vertice itajai = new Vertice("Itajai");
		Conjunto verticesAdjacentes = new Conjunto();
		verticesAdjacentes.adicionarElemento(itajai);
		Map<String, Objeto> novaListaDeDespejo = new HashMap<String, Objeto>();
		novaListaDeDespejo.put("verticesAdjacentes", verticesAdjacentes);
		respostasParaTesteDeDespejo.put("exemplos\\funcoes\\grafoObterVerticesAdjacentes.dslfg", novaListaDeDespejo);
	}

}
