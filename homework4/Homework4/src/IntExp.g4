grammar IntExp;

main : prog EOF;

prog : init exp;

init: ID EQUAL exp SEMICOLON init   # idinit
    |                               # nilinit
    ;

exp: FLOAT                                              # num
    | ID                                                # id
    | LPAR exp RPAR                                     # parExp
    | <assoc=right> exp POW exp                         # pow
    | exp op=(DIV | MUL | MOD) exp                      # divMulMod
    | exp op=(PLUS | MINUS) exp                         # plusMinus
    ;

LPAR : '(' ;
RPAR : ')' ;
PLUS : '+' ;
MUL  : '*' ;
MOD  : '%' ;
POW  : '^' ;
DIV  : '/' ;
MINUS: '-' ;


FLOAT: INT | (INT | '-' '0') '.' DIGIT;
fragment INT: NAT | '-' POS;
fragment NAT: '0' | POS;
fragment POS: POSDIGIT DIGIT*;
fragment DIGIT: '0' | POSDIGIT;
fragment POSDIGIT: [1-9];

ID: [a-z]+;

WS: [ \t\n\r]+ -> skip;