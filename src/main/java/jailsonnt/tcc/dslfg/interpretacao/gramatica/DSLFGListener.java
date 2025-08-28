// Generated from DSLFG.g4 by ANTLR 4.1
package jailsonnt.tcc.dslfg.interpretacao.gramatica;
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link DSLFGParser}.
 */
public interface DSLFGListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link DSLFGParser#obterVertice}.
	 * @param ctx the parse tree
	 */
	void enterObterVertice(@NotNull DSLFGParser.ObterVerticeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#obterVertice}.
	 * @param ctx the parse tree
	 */
	void exitObterVertice(@NotNull DSLFGParser.ObterVerticeContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#adicaoDePropriedade}.
	 * @param ctx the parse tree
	 */
	void enterAdicaoDePropriedade(@NotNull DSLFGParser.AdicaoDePropriedadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#adicaoDePropriedade}.
	 * @param ctx the parse tree
	 */
	void exitAdicaoDePropriedade(@NotNull DSLFGParser.AdicaoDePropriedadeContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#declaracaoDeConjunto}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoDeConjunto(@NotNull DSLFGParser.DeclaracaoDeConjuntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#declaracaoDeConjunto}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoDeConjunto(@NotNull DSLFGParser.DeclaracaoDeConjuntoContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#condicional}.
	 * @param ctx the parse tree
	 */
	void enterCondicional(@NotNull DSLFGParser.CondicionalContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#condicional}.
	 * @param ctx the parse tree
	 */
	void exitCondicional(@NotNull DSLFGParser.CondicionalContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#funcaoPercorerGrafo}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoPercorerGrafo(@NotNull DSLFGParser.FuncaoPercorerGrafoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#funcaoPercorerGrafo}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoPercorerGrafo(@NotNull DSLFGParser.FuncaoPercorerGrafoContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#despejar}.
	 * @param ctx the parse tree
	 */
	void enterDespejar(@NotNull DSLFGParser.DespejarContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#despejar}.
	 * @param ctx the parse tree
	 */
	void exitDespejar(@NotNull DSLFGParser.DespejarContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#condicionalDeConjunto}.
	 * @param ctx the parse tree
	 */
	void enterCondicionalDeConjunto(@NotNull DSLFGParser.CondicionalDeConjuntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#condicionalDeConjunto}.
	 * @param ctx the parse tree
	 */
	void exitCondicionalDeConjunto(@NotNull DSLFGParser.CondicionalDeConjuntoContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#funcaoMostrar}.
	 * @param ctx the parse tree
	 */
	void enterFuncaoMostrar(@NotNull DSLFGParser.FuncaoMostrarContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#funcaoMostrar}.
	 * @param ctx the parse tree
	 */
	void exitFuncaoMostrar(@NotNull DSLFGParser.FuncaoMostrarContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#importar}.
	 * @param ctx the parse tree
	 */
	void enterImportar(@NotNull DSLFGParser.ImportarContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#importar}.
	 * @param ctx the parse tree
	 */
	void exitImportar(@NotNull DSLFGParser.ImportarContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#retorno}.
	 * @param ctx the parse tree
	 */
	void enterRetorno(@NotNull DSLFGParser.RetornoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#retorno}.
	 * @param ctx the parse tree
	 */
	void exitRetorno(@NotNull DSLFGParser.RetornoContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void enterChamadaFuncao(@NotNull DSLFGParser.ChamadaFuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#chamadaFuncao}.
	 * @param ctx the parse tree
	 */
	void exitChamadaFuncao(@NotNull DSLFGParser.ChamadaFuncaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void enterExpressaoAritmetica(@NotNull DSLFGParser.ExpressaoAritmeticaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#expressaoAritmetica}.
	 * @param ctx the parse tree
	 */
	void exitExpressaoAritmetica(@NotNull DSLFGParser.ExpressaoAritmeticaContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#definirPropriedade}.
	 * @param ctx the parse tree
	 */
	void enterDefinirPropriedade(@NotNull DSLFGParser.DefinirPropriedadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#definirPropriedade}.
	 * @param ctx the parse tree
	 */
	void exitDefinirPropriedade(@NotNull DSLFGParser.DefinirPropriedadeContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#construcaoDeDigrafo}.
	 * @param ctx the parse tree
	 */
	void enterConstrucaoDeDigrafo(@NotNull DSLFGParser.ConstrucaoDeDigrafoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#construcaoDeDigrafo}.
	 * @param ctx the parse tree
	 */
	void exitConstrucaoDeDigrafo(@NotNull DSLFGParser.ConstrucaoDeDigrafoContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#codigo}.
	 * @param ctx the parse tree
	 */
	void enterCodigo(@NotNull DSLFGParser.CodigoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#codigo}.
	 * @param ctx the parse tree
	 */
	void exitCodigo(@NotNull DSLFGParser.CodigoContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#obterIterador}.
	 * @param ctx the parse tree
	 */
	void enterObterIterador(@NotNull DSLFGParser.ObterIteradorContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#obterIterador}.
	 * @param ctx the parse tree
	 */
	void exitObterIterador(@NotNull DSLFGParser.ObterIteradorContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#obterTodosOsVertices}.
	 * @param ctx the parse tree
	 */
	void enterObterTodosOsVertices(@NotNull DSLFGParser.ObterTodosOsVerticesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#obterTodosOsVertices}.
	 * @param ctx the parse tree
	 */
	void exitObterTodosOsVertices(@NotNull DSLFGParser.ObterTodosOsVerticesContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#retirar}.
	 * @param ctx the parse tree
	 */
	void enterRetirar(@NotNull DSLFGParser.RetirarContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#retirar}.
	 * @param ctx the parse tree
	 */
	void exitRetirar(@NotNull DSLFGParser.RetirarContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#funcao}.
	 * @param ctx the parse tree
	 */
	void enterFuncao(@NotNull DSLFGParser.FuncaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#funcao}.
	 * @param ctx the parse tree
	 */
	void exitFuncao(@NotNull DSLFGParser.FuncaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void enterConjunto(@NotNull DSLFGParser.ConjuntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#conjunto}.
	 * @param ctx the parse tree
	 */
	void exitConjunto(@NotNull DSLFGParser.ConjuntoContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#obterProximoItem}.
	 * @param ctx the parse tree
	 */
	void enterObterProximoItem(@NotNull DSLFGParser.ObterProximoItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#obterProximoItem}.
	 * @param ctx the parse tree
	 */
	void exitObterProximoItem(@NotNull DSLFGParser.ObterProximoItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#obterVerticesAdjacentes}.
	 * @param ctx the parse tree
	 */
	void enterObterVerticesAdjacentes(@NotNull DSLFGParser.ObterVerticesAdjacentesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#obterVerticesAdjacentes}.
	 * @param ctx the parse tree
	 */
	void exitObterVerticesAdjacentes(@NotNull DSLFGParser.ObterVerticesAdjacentesContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#executarAcaoDePercorrerGrafo}.
	 * @param ctx the parse tree
	 */
	void enterExecutarAcaoDePercorrerGrafo(@NotNull DSLFGParser.ExecutarAcaoDePercorrerGrafoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#executarAcaoDePercorrerGrafo}.
	 * @param ctx the parse tree
	 */
	void exitExecutarAcaoDePercorrerGrafo(@NotNull DSLFGParser.ExecutarAcaoDePercorrerGrafoContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#ligacaoDeVertice}.
	 * @param ctx the parse tree
	 */
	void enterLigacaoDeVertice(@NotNull DSLFGParser.LigacaoDeVerticeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#ligacaoDeVertice}.
	 * @param ctx the parse tree
	 */
	void exitLigacaoDeVertice(@NotNull DSLFGParser.LigacaoDeVerticeContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#obterTodasAsArestas}.
	 * @param ctx the parse tree
	 */
	void enterObterTodasAsArestas(@NotNull DSLFGParser.ObterTodasAsArestasContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#obterTodasAsArestas}.
	 * @param ctx the parse tree
	 */
	void exitObterTodasAsArestas(@NotNull DSLFGParser.ObterTodasAsArestasContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#diferenca}.
	 * @param ctx the parse tree
	 */
	void enterDiferenca(@NotNull DSLFGParser.DiferencaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#diferenca}.
	 * @param ctx the parse tree
	 */
	void exitDiferenca(@NotNull DSLFGParser.DiferencaContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#atribuicaoPorExpressao}.
	 * @param ctx the parse tree
	 */
	void enterAtribuicaoPorExpressao(@NotNull DSLFGParser.AtribuicaoPorExpressaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#atribuicaoPorExpressao}.
	 * @param ctx the parse tree
	 */
	void exitAtribuicaoPorExpressao(@NotNull DSLFGParser.AtribuicaoPorExpressaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#copiarGrafo}.
	 * @param ctx the parse tree
	 */
	void enterCopiarGrafo(@NotNull DSLFGParser.CopiarGrafoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#copiarGrafo}.
	 * @param ctx the parse tree
	 */
	void exitCopiarGrafo(@NotNull DSLFGParser.CopiarGrafoContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#declaracaoDeVertice}.
	 * @param ctx the parse tree
	 */
	void enterDeclaracaoDeVertice(@NotNull DSLFGParser.DeclaracaoDeVerticeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#declaracaoDeVertice}.
	 * @param ctx the parse tree
	 */
	void exitDeclaracaoDeVertice(@NotNull DSLFGParser.DeclaracaoDeVerticeContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#obterUmElemento}.
	 * @param ctx the parse tree
	 */
	void enterObterUmElemento(@NotNull DSLFGParser.ObterUmElementoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#obterUmElemento}.
	 * @param ctx the parse tree
	 */
	void exitObterUmElemento(@NotNull DSLFGParser.ObterUmElementoContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#inicio}.
	 * @param ctx the parse tree
	 */
	void enterInicio(@NotNull DSLFGParser.InicioContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#inicio}.
	 * @param ctx the parse tree
	 */
	void exitInicio(@NotNull DSLFGParser.InicioContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#obterUmVertice}.
	 * @param ctx the parse tree
	 */
	void enterObterUmVertice(@NotNull DSLFGParser.ObterUmVerticeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#obterUmVertice}.
	 * @param ctx the parse tree
	 */
	void exitObterUmVertice(@NotNull DSLFGParser.ObterUmVerticeContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#se}.
	 * @param ctx the parse tree
	 */
	void enterSe(@NotNull DSLFGParser.SeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#se}.
	 * @param ctx the parse tree
	 */
	void exitSe(@NotNull DSLFGParser.SeContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#obterPropriedade}.
	 * @param ctx the parse tree
	 */
	void enterObterPropriedade(@NotNull DSLFGParser.ObterPropriedadeContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#obterPropriedade}.
	 * @param ctx the parse tree
	 */
	void exitObterPropriedade(@NotNull DSLFGParser.ObterPropriedadeContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#adicionarAConjunto}.
	 * @param ctx the parse tree
	 */
	void enterAdicionarAConjunto(@NotNull DSLFGParser.AdicionarAConjuntoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#adicionarAConjunto}.
	 * @param ctx the parse tree
	 */
	void exitAdicionarAConjunto(@NotNull DSLFGParser.AdicionarAConjuntoContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#funcoes}.
	 * @param ctx the parse tree
	 */
	void enterFuncoes(@NotNull DSLFGParser.FuncoesContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#funcoes}.
	 * @param ctx the parse tree
	 */
	void exitFuncoes(@NotNull DSLFGParser.FuncoesContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#construcaoDeGrafo}.
	 * @param ctx the parse tree
	 */
	void enterConstrucaoDeGrafo(@NotNull DSLFGParser.ConstrucaoDeGrafoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#construcaoDeGrafo}.
	 * @param ctx the parse tree
	 */
	void exitConstrucaoDeGrafo(@NotNull DSLFGParser.ConstrucaoDeGrafoContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#parametros}.
	 * @param ctx the parse tree
	 */
	void enterParametros(@NotNull DSLFGParser.ParametrosContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#parametros}.
	 * @param ctx the parse tree
	 */
	void exitParametros(@NotNull DSLFGParser.ParametrosContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#multiTipos}.
	 * @param ctx the parse tree
	 */
	void enterMultiTipos(@NotNull DSLFGParser.MultiTiposContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#multiTipos}.
	 * @param ctx the parse tree
	 */
	void exitMultiTipos(@NotNull DSLFGParser.MultiTiposContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#existeProximoItem}.
	 * @param ctx the parse tree
	 */
	void enterExisteProximoItem(@NotNull DSLFGParser.ExisteProximoItemContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#existeProximoItem}.
	 * @param ctx the parse tree
	 */
	void exitExisteProximoItem(@NotNull DSLFGParser.ExisteProximoItemContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void enterEnquanto(@NotNull DSLFGParser.EnquantoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#enquanto}.
	 * @param ctx the parse tree
	 */
	void exitEnquanto(@NotNull DSLFGParser.EnquantoContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#obterPesoDaAresta}.
	 * @param ctx the parse tree
	 */
	void enterObterPesoDaAresta(@NotNull DSLFGParser.ObterPesoDaArestaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#obterPesoDaAresta}.
	 * @param ctx the parse tree
	 */
	void exitObterPesoDaAresta(@NotNull DSLFGParser.ObterPesoDaArestaContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#uniao}.
	 * @param ctx the parse tree
	 */
	void enterUniao(@NotNull DSLFGParser.UniaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#uniao}.
	 * @param ctx the parse tree
	 */
	void exitUniao(@NotNull DSLFGParser.UniaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#interseccao}.
	 * @param ctx the parse tree
	 */
	void enterInterseccao(@NotNull DSLFGParser.InterseccaoContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#interseccao}.
	 * @param ctx the parse tree
	 */
	void exitInterseccao(@NotNull DSLFGParser.InterseccaoContext ctx);

	/**
	 * Enter a parse tree produced by {@link DSLFGParser#pesoDaAresta}.
	 * @param ctx the parse tree
	 */
	void enterPesoDaAresta(@NotNull DSLFGParser.PesoDaArestaContext ctx);
	/**
	 * Exit a parse tree produced by {@link DSLFGParser#pesoDaAresta}.
	 * @param ctx the parse tree
	 */
	void exitPesoDaAresta(@NotNull DSLFGParser.PesoDaArestaContext ctx);
}