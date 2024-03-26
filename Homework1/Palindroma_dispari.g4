grammar Palindroma_dispari;

main : pald EOF;

pald : | '1' pald '1' | '0' pald '0' | pal;

pal : | '0' | '1'  ;