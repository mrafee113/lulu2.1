package main;

import gen.*;

import org.antlr.v4.runtime.CharStream;
import org.antlr.v4.runtime.CharStreams;
import org.antlr.v4.runtime.CommonTokenFactory;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.UnbufferedTokenStream;
import org.antlr.v4.runtime.CommonToken;
import org.antlr.v4.runtime.tree.ParseTree;
import org.antlr.v4.runtime.tree.ParseTreeWalker;
import org.antlr.runtime.*;



import java.util.*;
import java.io.*;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        String st = "%% be name khoda\n" +
                "declare{\n" +
                "    (int) = fib(bool v, string s);\n" +
                "    lalalala la;\n" +
                "}\n" +
                "\n" +
                "%% zombi ha az lulu nemitarsand\n" +
                "(int n) = function fib(int n_){\n" +
                "    if n_ <= 2 && n_ >= 3{\n" +
                "        if m == n-3*-a {\n" +
                "            (n) = 1;\n" +
                "        }\n" +
                "    }\n" +
                "    else {\n" +
                "        if b > 2 || !true {\n" +
                "            %~\n" +
                "            Calculating fibonacci recursively.\n" +
                "            Fib[n] = Fib[n-1] + Fib[n-2]\n" +
                "            ~%\n" +
                "            (n) = fib(n_-1) + fib(n_-2);\n" +
                "        }\n" +
                "    }\n" +
                "    return;\n" +
                "}\n" +
                "\n" +
                "type db:bd{\n" +
                "    private const string a[allocate b()], p[[[this.a.a.a], [((write(t)))]]][nil];\n" +
                "    %~\n" +
                "    Man an morghe siah balam.\n" +
                "    Man an morghe siah balam. ~%\n" +
                "    protected int a[b[c[d]]];\n" +
                "}\n" +
                "\n" +
                "function fun (  ) {\n" +
                "    %%Let's have some fun\n" +
                "    string str = 'RTFM\\X78\\xF1';\n" +
                "    \n" +
                "}\n" +
                "\n" +
                "function alex(){\n" +
                "    switch super.alex{\n" +
                "        case 1:{\n" +
                "            destruct [][] alex;\n" +
                "        }\n" +
                "        case 2:{\n" +
                "            destruct [][][] karshenas;\n" +
                "        }\n" +
                "        case 3:{\n" +
                "            const bool var = a *!b[d[3]+~W]-c/2|c(v(5,6))^3==3%a&3&&2||sds!=q>t>=y; \n" +
                "        }\n" +
                "        default:{\n" +
                "            book memo[n][m] = allocate book(); \n" +
                "        }\n" +
                "    }\n" +
                "}\n" +
                "\n" +
                "(float f, float e) = function yechizi(){\n" +
                "    while e == f == e {\n" +
                "        const float b, k;\n" +
                "        int a[12], z[13][17];\n" +
                "        return;\n" +
                "    }\n" +
                "}";
        String st2 = "declare {  int a;  myType;  (int, float) = f1(float b); } type myType {  protected int x;  public (float y) = function myFun(int z){   if (z > this.x) {    y = 23.5; }   else {    y = 15.2; }   return;  } } (int r) = function start() {  const float c = 0.23;  int s;  read(s);  float w;  (r, w) = f1(s);  return; } (int x, float y) = function f1(int b) {  myType a = allocate myType();  (y) = a.myFun(b);  x = 0;  return; }";
        CharStream input = CharStreams.fromString(st2);
        lulu2Lexer lexer = new lulu2Lexer(input);
        lexer.setTokenFactory(new CommonTokenFactory(true));
        TokenStream tokens = new UnbufferedTokenStream<CommonToken>(lexer);
        lulu2Parser parser = new lulu2Parser(tokens);
        ParseTree tree = parser.program();
        //System.out.println(tree.toStringTree(parser));
        ParseTreeWalker walker = new ParseTreeWalker(); // create standard walker
        lulu2ExtendedListener extractor = new lulu2ExtendedListener();
        walker.walk(extractor, tree); // initiate walk of tree with listener

    }
}
