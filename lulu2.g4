grammar lulu2;
import LULULexer;

program : ft_dcl? ft_def+;
ft_dcl : DECLARE O_CUR(func_dcl | type_dcl | var_def)+ C_CUR;
func_dcl : ( O_PAR args C_PAR EQUAL )? ID O_PAR (args | args_var)? C_PAR SEM_C ;
args : type ( O_BRA C_BRA)* | args COMMA type (O_BRA C_BRA)*;
args_var : type ( O_BRA C_BRA )* ID | args_var COMMA type ( O_BRA C_BRA )* ID;
type_dcl : ID SEM_C;
var_def : CONST? type var_val ( COMMA var_val )* SEM_C;
var_val : ref ( EQUAL expr)?;
ft_def : ( type_def | fun_def );
type_def : TYPE ID ( COLON ID )? O_CUR component+ C_CUR;
component : access_modifier? ( var_def | fun_def );
access_modifier : PRIVATE | PUBLIC | PROTECTED;
fun_def : ( O_PAR args_var C_PAR EQUAL )? FUNCTION ID O_PAR args_var? C_PAR block;
block : O_CUR ( var_def | stmt )* C_CUR;
stmt : assign SEM_C | func_call SEM_C | cond_stmt | loop_stmt | RETURN SEM_C |
      BREAK SEM_C | CONTINUE SEM_C | DESTRUCT ( O_BRA C_BRA )* ID SEM_C;
assign : ( var | O_PAR var ( COMMA var )* C_PAR ) EQUAL expr;
ref : ID ( O_BRA expr C_BRA )*;
expr : expr binary_op expr | expr binary_op2 expr |  O_PAR expr C_PAR | TERM expr | const_val | ALLOCATE handle_call | func_call | var | list | NIL ;
var : ( ( THIS | SUPER ) DOT )? ref ( DOT ref )*;
func_call : ( var DOT )? handle_call | READ O_PAR var C_PAR | WRITE O_PAR var C_PAR;
list : O_BRA ( expr | list ) ( COMMA ( expr | list ) )* C_BRA;
handle_call : ID O_PAR params? C_PAR;
params : expr | expr COMMA params;
cond_stmt : IF expr block ( ELSE block )? |
          SWITCH var O_CUR ( CASE INT_CONST COLON block )* DEFAULT COLON block C_CUR;
loop_stmt : FOR ( type? assign )? SEM_C expr SEM_C assign? block |
           WHILE expr block;
type : INT | BOOL | FLOAT | STRING | ID;
const_val : STRING_CONST | INT_CONST | REAL_CONST | BOOL_CONST ;
binary_op : ARITHMETIC1 | RELATIONAL | BITWISE;
binary_op2 : TERM | LOGICAL;








