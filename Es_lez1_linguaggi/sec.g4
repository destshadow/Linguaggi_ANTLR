grammar sec;

main : seq EOF;

seq : | '0' seq | '1' seq | '2' seq | '3' seq | '4' seq | '5' seq | '6' seq | '7' seq | '8' seq | '9' seq ;
