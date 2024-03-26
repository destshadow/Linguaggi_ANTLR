grammar Test;

main : a EOF;

a : b '1' b '1' b '1' b '1' b;

b : | '1' b | '0' b;