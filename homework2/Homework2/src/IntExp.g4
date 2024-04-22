grammar IntExp;

main : s EOF;
s : x ZERO x ZERO x ZERO x ZERO x;
x : ONE x | ZERO x | ;

ZERO : '0';
ONE : '1' ;