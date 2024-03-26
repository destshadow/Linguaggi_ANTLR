grammar Lista;

main : list EOF;

list : '(' ')' | '(' elem tail ')';

elem : '0' | '1' | '2' | '3' | '4' | '5' | '6' | '7' | '8' | '9' ;

tail : | ',' elem tail ;