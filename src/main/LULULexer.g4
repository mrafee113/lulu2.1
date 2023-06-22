lexer grammar LULULexer;

COMMENT : '%%'(~[\n])* -> skip;
MULTI_LINE_COMMENT : '%~'.*?'~%' -> skip;

ARITHMETIC1 : '*' | '/' | '%' ;
RELATIONAL : '<=' | '>=' | '<' | '>' | '==' | '!=' ;
BOOL_CONST : ('true' | 'false');
BITWISE : '&' | '^' | '|';
LOGICAL : '&&' | '||';
TERM : '-'? TERM1?;
TERM1 : '!' | '~' | '+';


PROTECTED : 'protected';


FUNCTION : 'function';
CONTINUE : 'continue';
DESTRUCT : 'destruct';
ALLOCATE : 'allocate';




DECLARE : 'declare';
PRIVATE : 'private';
DEFAULT : 'default';

MCOMMENT : '%~'.*?'~%' '\n' -> skip;

PUBLIC : 'public';
RETURN : 'return';
SWITCH : 'switch';
STRING : 'string';


BREAK : 'break';
CONST : 'const';
O_CUR : '{';
C_CUR : '}';
O_PAR : '(';
C_PAR : ')';
EQUAL : '=';
SEM_C : ';';
O_BRA : '[';
C_BRA : ']';
COMMA : ',';
COLON : ':';
SUPER : 'super';
WRITE : 'write';
WHILE : 'while';
FLOAT : 'float';

TYPE : 'type';
THIS : 'this';
ELSE : 'else';
CASE : 'case';
READ : 'read';
BOOL : 'bool';

NIL : 'nil';
DOT : '.';
FOR : 'for';
INT : 'int';
IF : 'if';




INT_CONST : (('0'[Xx][0-9a-fA-F]+)|([0-9]+));
REAL_CONST : (([0-9]+'.'[0-9]*|'.'[0-9]+))([eE][-+][0-9]+)?;
ID : [a-zA-Z_#][a-zA-Z_#0-9]*;

STRING_CONST : '\'' ( ESC | ~[\\'] )*? '\'' ;
fragment ESC : '\\'('b'|'n'|'r'|'t'|'\\'|'0'|'\'') | '\\'[Xx][a-fA-F0-9][a-fA-F0-9] ;

WS : [ \r\t\u000C\n]+ -> skip;

