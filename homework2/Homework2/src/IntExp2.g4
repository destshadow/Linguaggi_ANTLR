grammar IntExp2;



main : exp EOF;

exp : NAT                           # nat
    | NEG                           # neg
    | LPAR exp PLUS exp RPAR        # plus
    | LPAR exp MUL exp RPAR         # mul
    | LPAR exp SUB exp RPAR         # sub
    | LPAR exp MOD exp RPAR         # mod
    | LPAR exp DIV exp RPAR         # div
    ;

var : STR '=' exp ';' var | ;

prog : var exp;

num : NEG | NAT;

LPAR : '(';
RPAR : ')';
PLUS : '+';
MUL  : '*';
SUB  : '-';
MOD  : 'mod';
DIV  : '/';

STR  : [a-z]+;

NAT : '0' | [1-9][0-9]*;
NEG : '-' [1-9][0-9]*;

WS : [ \t\n\r]+ -> skip;