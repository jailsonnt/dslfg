grammar DSLFG;
import DSLFGLexico;

inicio : 
           importar* codigo*
;
codigo:
          QUEBRA_DE_LINHA |
          construcaoDeGrafo |
          construcaoDeDigrafo |
          funcaoMostrar |
          declaracaoDeConjunto |
          atribuicaoPorExpressao |
          adicionarAConjunto |
          definirPropriedade |
          se |
          enquanto |
          despejar |
          funcao |
          chamadaFuncao |
          retorno |
          funcaoPercorerGrafo | 
          executarAcaoDePercorrerGrafo
          
      ;
se:
      TAB* 'se' (condicionalDeConjunto | condicional) QUEBRA_DE_LINHA 
     // ('senão' QUEBRA_DE_LINHA
       //   (TAB+ codigo QUEBRA_DE_LINHA)+)?
      
  ;
  
enquanto:
            TAB* 'enquanto' (condicionalDeConjunto | condicional) QUEBRA_DE_LINHA 
        ;

condicionalDeConjunto:
                         PALAVRA OPERADOR_CONDICIONAL_DE_CONJUNTO PALAVRA
                     ;
condicional:
               multiTipos OPERADOR_CONDICIONAL multiTipos
           ;
importar : 
             'importar' STRING
         ;  
construcaoDeGrafo:
                     TAB* 'grafo' PALAVRA QUEBRA_DE_LINHA
                        ligacaoDeVertice*
                 ;
construcaoDeDigrafo:
                     TAB* 'digrafo' PALAVRA QUEBRA_DE_LINHA
                        ligacaoDeVertice*
				   ; 
ligacaoDeVertice:
                    TAB+ declaracaoDeVertice 'ligadoCom' declaracaoDeVertice pesoDaAresta? QUEBRA_DE_LINHA
                ;
declaracaoDeVertice:
                       PALAVRA (QUEBRA_DE_LINHA adicaoDePropriedade* TAB+)?
                   ;
adicaoDePropriedade:
                       TAB+ 'com' PALAVRA '=' multiTipos QUEBRA_DE_LINHA
                   ;
pesoDaAresta:
                 'comPeso' NUMERO
             ;
funcaoMostrar: 
                 TAB* 'mostrar' multiTipos QUEBRA_DE_LINHA
             ;
declaracaoDeConjunto:
                     TAB* PALAVRA '=' conjunto  QUEBRA_DE_LINHA
                    ;
atribuicaoPorExpressao:
                         TAB* PALAVRA '=' funcoes QUEBRA_DE_LINHA
                      ;
conjunto:
            '{'((NUMERO',')* NUMERO)? '}'
        ;
adicionarAConjunto:
                     TAB* 'adicionar' multiTipos 'em' PALAVRA QUEBRA_DE_LINHA
                  ;
definirPropriedade:
                   TAB* 'definirPropriedade' PALAVRA 'em' PALAVRA 'comValor' multiTipos QUEBRA_DE_LINHA
                  ;
funcoes:
            obterVerticesAdjacentes | obterUmElemento | obterUmVertice| retirar | uniao | interseccao | diferenca |
            chamadaFuncao | obterVertice | obterPesoDaAresta | obterPropriedade | obterIterador | existeProximoItem |
            obterProximoItem | obterTodosOsVertices | obterTodasAsArestas | copiarGrafo | expressaoAritmetica
       ;
expressaoAritmetica:
                       multiTipos (OPERADOR_ARITMETICO multiTipos)?
                   ;
retirar: 
            PALAVRA 'retirando' PALAVRA
        ;
uniao:
         PALAVRA 'unindo' PALAVRA
     ;
interseccao:
                PALAVRA 'interseccao' PALAVRA
            ;
diferenca:
             PALAVRA 'diferenca' PALAVRA
         ;
chamadaFuncao:
               TAB*  'executar' PALAVRA parametros
             ;
copiarGrafo:
               'copiarGrafo' PALAVRA
           ;
obterTodosOsVertices:
                        'obterTodosOsVerticesDe' PALAVRA
                    ;
obterTodasAsArestas:
                       'obterTodasAsArestasDe' PALAVRA
                   ;
obterIterador: 
                 'obterIteradorDe' PALAVRA
             ;
existeProximoItem:
                     'existeProximoItemEm' PALAVRA
                 ;
obterProximoItem:
                    'obterProximoItemDe' PALAVRA
                ;
obterPropriedade:
                    'obterPropriedade' PALAVRA 'de' PALAVRA
                ;
obterPesoDaAresta:
                     'obterPesoDaAresta' 'de' PALAVRA 'para' PALAVRA
                 ;
obterVerticesAdjacentes:
                           'verticesAdjacentesDe' PALAVRA
                       ;
obterUmElemento :
                'obterUmElementoDe' PALAVRA
            ;
obterUmVertice :
                'obterUmVerticeDe' PALAVRA
            ;
obterVertice :
                 'obterVertice' PALAVRA 'de' PALAVRA
             ;
multiTipos:
              NUMERO | PALAVRA | STRING | CONSTANTES | TIPOS_BOOLEANOS
          ;
despejar:
            TAB* 'despejar' PALAVRA
        ;
funcao:
          'função' PALAVRA parametros
      ;
parametros:
              (PALAVRA ','?)*
          ;
retorno:
      		TAB+ 'retornar' PALAVRA
    	;
funcaoPercorerGrafo:
                   TAB* 'percorrerGrafo' PALAVRA 'utilizando' PALAVRA 'iniciandoEm' PALAVRA
                   ;
executarAcaoDePercorrerGrafo:
                                TAB* 'executar' PALAVRA 'fornecendo' parametros
                            ;