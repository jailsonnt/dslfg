lexer grammar DSLFGLexico;

TIPOS_BOOLEANOS: 'verdadeiro' | 'falso';

CONSTANTES: 'numeroMaximo' | 'numeroMinimo';

OPERADOR_ARITMETICO: '+' | '-' | '*' | '/' | 'div' | 'mod' ;

OPERADOR_CONDICIONAL_DE_CONJUNTO : ' subconjuntoProprioDe ' | ' subconjunto ' | ' eUmElementoDe ' | ' naoEUmElementoDe ';

OPERADOR_CONDICIONAL: ' == ' | ' <= ' | ' >= '| ' < '| ' > ' | ' != ';

NUMERO : DIGITO+ ('.' DIGITO+)?;

STRING:     ('“'|'"') 
           (' ' |'!' | [\u0001-\u0021] | [\u0023-\u30FF] | 'Á')*
            ('”'|'"')
      ;

DIGITO : [0-9];

PALAVRA : ([A-Z]|[a-z]|[À-ü]|[\u0168-\u0169]|'Ã'|'ã'|'ú'|'Ú'|'_') ([A-Z]|[a-z]|[À-ü]|[\u0168-\u0169]|'Ã'|'ã'|'ú'|'Ú'|'_'|DIGITO)*; 

TAB : '\t';

QUEBRA_DE_LINHA: '\r'| '\n' | '\r''\n';

COMENTARIO: '//*' .*? QUEBRA_DE_LINHA -> skip;

WS : ( ' '|'\f') -> skip;