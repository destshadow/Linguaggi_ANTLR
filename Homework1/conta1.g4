grammar conta1;

main : es EOF;

es : 'a' es 'c' | b;
b : 'b' b 'c' |;
