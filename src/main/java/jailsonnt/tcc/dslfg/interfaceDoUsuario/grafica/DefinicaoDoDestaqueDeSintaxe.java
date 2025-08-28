package jailsonnt.tcc.dslfg.interfaceDoUsuario.grafica;

import javax.swing.text.Segment;

import org.fife.ui.rsyntaxtextarea.AbstractTokenMaker;
import org.fife.ui.rsyntaxtextarea.RSyntaxUtilities;
import org.fife.ui.rsyntaxtextarea.Token;
import org.fife.ui.rsyntaxtextarea.TokenMap;

public class DefinicaoDoDestaqueDeSintaxe extends AbstractTokenMaker {
	
	@Override
	public void addToken(Segment segment, int start, int end, int tokenType, int startOffset) {
	   // This assumes all keywords, etc. were parsed as "identifiers."
	   if (tokenType==Token.IDENTIFIER) {
	      int value = wordsToHighlight.get(segment, start, end);
	      if (value != -1) {
	         tokenType = value;
	      }
	   }
	   super.addToken(segment, start, end, tokenType, startOffset);
	}
	
	@Override
	public Token getTokenList(Segment text, int initialTokenType, int startOffset) {
		resetTokenList();

		char[] array = text.array;
		int offset = text.offset;
		int count = text.count;
		int end = offset + count;

		int newStartOffset = startOffset - offset;

		int currentTokenStart = offset;
		int currentTokenType = initialTokenType;

		for (int i = offset; i < end; i++) {

			char c = array[i];

			switch (currentTokenType) {

			case Token.NULL:

				currentTokenStart = i; // Starting a new token here.

				switch (c) {

				case ' ':
				case '\t':
					currentTokenType = Token.WHITESPACE;
					break;

				case '"':
					currentTokenType = Token.LITERAL_STRING_DOUBLE_QUOTE;
					break;

				case '#':
					currentTokenType = Token.COMMENT_EOL;
					break;

				default:
					if (RSyntaxUtilities.isDigit(c)) {
						currentTokenType = Token.LITERAL_NUMBER_DECIMAL_INT;
						break;
					} else if (RSyntaxUtilities.isLetter(c) || c == '/'
							|| c == '_') {
						currentTokenType = Token.IDENTIFIER;
						break;
					}

					// Anything not currently handled - mark as an identifier
					currentTokenType = Token.IDENTIFIER;
					break;

				} // End of switch (c).

				break;

			case Token.WHITESPACE:

				switch (c) {

				case ' ':
				case '\t':
					break; // Still whitespace.

				case '"':
					addToken(text, currentTokenStart, i - 1, Token.WHITESPACE,
							newStartOffset + currentTokenStart);
					currentTokenStart = i;
					currentTokenType = Token.LITERAL_STRING_DOUBLE_QUOTE;
					break;

				case '#':
					addToken(text, currentTokenStart, i - 1, Token.WHITESPACE,
							newStartOffset + currentTokenStart);
					currentTokenStart = i;
					currentTokenType = Token.COMMENT_EOL;
					break;

				default: // Add the whitespace token and start anew.

					addToken(text, currentTokenStart, i - 1, Token.WHITESPACE,
							newStartOffset + currentTokenStart);
					currentTokenStart = i;

					if (RSyntaxUtilities.isDigit(c)) {
						currentTokenType = Token.LITERAL_NUMBER_DECIMAL_INT;
						break;
					} else if (RSyntaxUtilities.isLetter(c) || c == '/'
							|| c == '_') {
						currentTokenType = Token.IDENTIFIER;
						break;
					}

					// Anything not currently handled - mark as identifier
					currentTokenType = Token.IDENTIFIER;

				} // End of switch (c).

				break;

			default: // Should never happen
			case Token.IDENTIFIER:

				switch (c) {

				case ' ':
				case '\t':
					addToken(text, currentTokenStart, i - 1, Token.IDENTIFIER,
							newStartOffset + currentTokenStart);
					currentTokenStart = i;
					currentTokenType = Token.WHITESPACE;
					break;

				case '"':
					addToken(text, currentTokenStart, i - 1, Token.IDENTIFIER,
							newStartOffset + currentTokenStart);
					currentTokenStart = i;
					currentTokenType = Token.LITERAL_STRING_DOUBLE_QUOTE;
					break;

				default:
					if (RSyntaxUtilities.isLetterOrDigit(c) || c == '/'
							|| c == '_') {
						break; // Still an identifier of some type.
					}
					// Otherwise, we're still an identifier (?).

				} // End of switch (c).

				break;

			case Token.LITERAL_NUMBER_DECIMAL_INT:

				switch (c) {

				case ' ':
				case '\t':
					addToken(text, currentTokenStart, i - 1,
							Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset
									+ currentTokenStart);
					currentTokenStart = i;
					currentTokenType = Token.WHITESPACE;
					break;

				case '"':
					addToken(text, currentTokenStart, i - 1,
							Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset
									+ currentTokenStart);
					currentTokenStart = i;
					currentTokenType = Token.LITERAL_STRING_DOUBLE_QUOTE;
					break;

				default:

					if (RSyntaxUtilities.isDigit(c)) {
						break; // Still a literal number.
					}

					// Otherwise, remember this was a number and start over.
					addToken(text, currentTokenStart, i - 1,
							Token.LITERAL_NUMBER_DECIMAL_INT, newStartOffset
									+ currentTokenStart);
					i--;
					currentTokenType = Token.NULL;

				} // End of switch (c).

				break;

			case Token.COMMENT_EOL:
				i = end - 1;
				addToken(text, currentTokenStart, i, currentTokenType,
						newStartOffset + currentTokenStart);
				// We need to set token type to null so at the bottom we don't
				// add one more token.
				currentTokenType = Token.NULL;
				break;

			case Token.LITERAL_STRING_DOUBLE_QUOTE:
				if (c == '"') {
					addToken(text, currentTokenStart, i,
							Token.LITERAL_STRING_DOUBLE_QUOTE, newStartOffset
									+ currentTokenStart);
					currentTokenType = Token.NULL;
				}
				break;

			} // End of switch (currentTokenType).

		} // End of for (int i=offset; i<end; i++).

		switch (currentTokenType) {

		// Remember what token type to begin the next line with.
		case Token.LITERAL_STRING_DOUBLE_QUOTE:
			addToken(text, currentTokenStart, end - 1, currentTokenType,
					newStartOffset + currentTokenStart);
			break;

		// Do nothing if everything was okay.
		case Token.NULL:
			addNullToken();
			break;

		// All other token types don't continue to the next line...
		default:
			addToken(text, currentTokenStart, end - 1, currentTokenType,
					newStartOffset + currentTokenStart);
			addNullToken();

		}

		// Return the first token in our linked list.
		return firstToken;
	}

	@Override
	public TokenMap getWordsToHighlight() {
		TokenMap tokenMap = new TokenMap();

		tokenMap.put("mostrar", Token.RESERVED_WORD);
		tokenMap.put("se", Token.RESERVED_WORD);
		tokenMap.put("enquanto", Token.RESERVED_WORD);
		tokenMap.put("importar", Token.RESERVED_WORD);
		tokenMap.put("grafo", Token.RESERVED_WORD);
		tokenMap.put("digrafo", Token.RESERVED_WORD);
		tokenMap.put("ligadoCom", Token.RESERVED_WORD);
		tokenMap.put("com", Token.RESERVED_WORD);
		tokenMap.put("comPeso", Token.RESERVED_WORD);
		tokenMap.put("adicionar", Token.RESERVED_WORD);
		tokenMap.put("em", Token.RESERVED_WORD);
		tokenMap.put("definirPropriedade", Token.RESERVED_WORD);
		tokenMap.put("comValor", Token.RESERVED_WORD);
		tokenMap.put("executar", Token.RESERVED_WORD);
		tokenMap.put("copiarGrafo", Token.RESERVED_WORD);
		tokenMap.put("obterTodosOsVerticesDe", Token.RESERVED_WORD);
		tokenMap.put("obterTodasAsArestasDe", Token.RESERVED_WORD);
		tokenMap.put("obterIteradorDe", Token.RESERVED_WORD);
		tokenMap.put("existeProximoItemEm", Token.RESERVED_WORD);
		tokenMap.put("obterProximoItemDe", Token.RESERVED_WORD);
		tokenMap.put("obterPropriedade", Token.RESERVED_WORD);
		tokenMap.put("de", Token.RESERVED_WORD);
		tokenMap.put("verticesAdjacentesDe", Token.RESERVED_WORD);
		tokenMap.put("obterUmElementoDe", Token.RESERVED_WORD);
		tokenMap.put("obterUmVerticeDe", Token.RESERVED_WORD);
		tokenMap.put("obterVertice", Token.RESERVED_WORD);
		tokenMap.put("obterPesoDaAresta", Token.RESERVED_WORD);
		tokenMap.put("para", Token.RESERVED_WORD);
		tokenMap.put("despejar", Token.RESERVED_WORD);
		tokenMap.put("função", Token.RESERVED_WORD);
		tokenMap.put("retornar", Token.RESERVED_WORD);
		tokenMap.put("percorrerGrafo", Token.RESERVED_WORD);
		tokenMap.put("utilizando", Token.RESERVED_WORD);
		tokenMap.put("iniciandoEm", Token.RESERVED_WORD);
		tokenMap.put("fornecendo", Token.RESERVED_WORD);
		tokenMap.put("falso", Token.RESERVED_WORD);
		tokenMap.put("verdadeiro", Token.RESERVED_WORD);
		tokenMap.put("{", Token.RESERVED_WORD);
		tokenMap.put("}", Token.RESERVED_WORD);
		
		tokenMap.put("numeroMaximo", Token.FUNCTION);
		tokenMap.put("numeroMinimo", Token.FUNCTION);
		
		tokenMap.put("=", Token.PREPROCESSOR);
		
		tokenMap.put("+", Token.OPERATOR);
		tokenMap.put("-", Token.OPERATOR);
		tokenMap.put("*", Token.OPERATOR);
		tokenMap.put("/", Token.OPERATOR);
		tokenMap.put("div", Token.OPERATOR);
		tokenMap.put("mod", Token.OPERATOR);
		
		tokenMap.put("subconjuntoProprioDe", Token.OPERATOR);
		tokenMap.put("subconjunto", Token.OPERATOR);
		tokenMap.put("eUmElementoDe", Token.OPERATOR);
		tokenMap.put("naoEUmElementoDe", Token.OPERATOR);
		
		tokenMap.put(",", Token.OPERATOR);
		
		tokenMap.put("==", Token.OPERATOR);
		tokenMap.put("<=", Token.OPERATOR);
		tokenMap.put(">=", Token.OPERATOR);
		tokenMap.put("<", Token.OPERATOR);
		tokenMap.put(">", Token.OPERATOR);
		tokenMap.put("!=", Token.OPERATOR);
		
		tokenMap.put("retirando", Token.OPERATOR);
		tokenMap.put("unindo", Token.OPERATOR);
		tokenMap.put("interseccao", Token.OPERATOR);
		tokenMap.put("diferenca", Token.OPERATOR);
		
		
		return tokenMap;
	}

}
