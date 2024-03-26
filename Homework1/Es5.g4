grammar Es5;

main : string EOF;

string : es | es2;

es : '0' es '1' | ;

es2 : '0' es '1' '1' | ;