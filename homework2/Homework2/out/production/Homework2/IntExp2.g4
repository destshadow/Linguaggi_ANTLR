grammar IntExp2;



main : exp EOF;

exp : NAT                           # nat
    | LPAR exp PLUS exp RPAR        # plus
    | LPAR exp MUL exp RPAR         # mul
    ;


LPAR : '(';
RPAR : ')';
PLUS : '+';
MUL  : '*';

NAT : '0' | [1-9][0-9]*;

WS : [ \t\n\r]+ -> skip;