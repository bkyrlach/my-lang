grammar MyLang;

file: exp EOF;

exp
    : literal       #lit
    | exp PLUS exp  #add
    ;


literal: NUMBER;

PLUS: '+';
NUMBER: [0-9]+;

WS: ' ' -> skip;