package main;

import java.lang.reflect.Array;
import java.util.*;

import LuluSymbolTable.*;
import com.sun.xml.internal.ws.util.StringUtils;
import gen.*;
import org.antlr.v4.runtime.TokenStream;
import org.antlr.v4.runtime.misc.Interval;

import javax.swing.*;


public class lulu2ExtendedListener extends lulu2BaseListener {

    BaseScope globalBase = new BaseScope();
    BaseScope pre = new BaseScope();

    int count = 0;
    boolean preIfWithElse;


    /**
     * functions for symbolTable filling
     */
    // ft_dcl -> args
    void fillListOfArgs(List<String> args, lulu2Parser.ArgsContext call) {
        if (call == null) {
            return;
        } else {
            args.add(call.type().getText());
            fillListOfArgs(args, call.args());
        }
    }

    // ft_dcl -> args_var
    void fillListOfArgs_var(List<String> argTypes, List<String> argIds, lulu2Parser.Args_varContext call) {
        if (call == null) {
            return;
        } else {
            argTypes.add(call.type().getText());
            argIds.add(call.ID().getText());
            fillListOfArgs_var(argTypes, argIds, call.args_var());
        }
    }

    void prTree(BaseScope node, int tab) {
        String tabs = "";
        for (int i = 0; i < tab; i++) {
            tabs += "\t";
        }
        if (node.getParentScope() == null) {
            System.out.println(tabs + null + ":" + node.getName());
        } else {
            System.out.println(tabs + node.getParentScope().getName() + ":" + node.getName());
        }
        if (node.getChildrenScopes().isEmpty()) {
            return;
        } else {
            for (int i = 0; i < node.getChildrenScopes().size(); i++) {
//                if (node.getChildrenScopes().get(i).getName() == null) {
//                    continue;
//                }
                prTree(node.getChildrenScopes().get(i), tab + 1);
            }
        }
    }


    /**
     * Listen to matches of classDeclaration
     */

    @Override
    public void enterProgram(lulu2Parser.ProgramContext ctx) {
        System.out.println("in enterProgram");

        LinkedHashMap<String, Entry> symbolTable = new LinkedHashMap<>();

        /**
         * start symbolTable
         * */
        // each ft_def
//        for (int each_ft_def = 0; each_ft_def < ctx.ft_def().size(); each_ft_def++) {
//            // fun_def
//            if (ctx.ft_def().get(each_ft_def).fun_def() != null) {
//                FunctionEntry functionEntry = new FunctionEntry();
//                functionEntry.setEntryType(Entry.EntryType.FUNCTION);
//
//                functionEntry.setName(ctx.ft_def().get(each_ft_def).fun_def().ID().getText());
//
////                functionEntry.setSize(); --------------------------------------------------to-be-implemented----------
//
//                // process inputs and outputs
//                // args and args_var sizes prepared
//                int argsVarSize = ctx.ft_def().get(each_ft_def).fun_def().args_var().size();
//
//                List<String> outputArgTypes = new ArrayList<String>();
//                List<String> outputArgIds = new ArrayList<String>();
//                List<String> inputArgTypes = new ArrayList<String>();
//                List<String> inputArgIds = new ArrayList<String>();
//
//                // if function has output
//                if (ctx.ft_def().get(each_ft_def).fun_def().getText().contains("=")) {
//
//                    // output is args_var
//                    if (argsVarSize == 1) {
//                        // outputs
//                        // get the arguments recursively
//                        fillListOfArgs_var(outputArgTypes, outputArgIds, ctx.ft_def().get(each_ft_def).fun_def().args_var().get(0));
//                        Collections.reverse(outputArgTypes);
//                        Collections.reverse(outputArgIds);
//                    }
//                    // output is args_var & input is args_var[1]
//                    else if (argsVarSize == 2) {
//                        // inputs
//                        // get the arguments recursively
//                        fillListOfArgs_var(inputArgTypes, inputArgIds, ctx.ft_def().get(each_ft_def).fun_def().args_var().get(1));
//                        Collections.reverse(inputArgTypes);
//                        Collections.reverse(inputArgIds);
//
//                        // outputs
//                        // get the arguments recursively
//                        fillListOfArgs_var(outputArgTypes, outputArgIds, ctx.ft_def().get(each_ft_def).fun_def().args_var().get(0));
//                        Collections.reverse(outputArgTypes);
//                        Collections.reverse(outputArgIds);
//                    }
//                }
//                // if it doesn't
//                else {
//
//                    // input is args_var
//                    if (argsVarSize == 1) {
//                        // inputs
//                        // get the arguments recursively
//                        fillListOfArgs_var(inputArgTypes, inputArgIds, ctx.ft_def().get(each_ft_def).fun_def().args_var().get(0));
//                        Collections.reverse(inputArgTypes);
//                        Collections.reverse(inputArgIds);
//                    }
//                    // if it doesn't have no output and input
//                    else if (argsVarSize == 0) {
//                        // no inputs and outputs -> no need to process
//                    }
//                }
//
//                // inputs
//                // process each arg wether Array or not and add it to the function
//                if (!inputArgTypes.isEmpty()) {
//                    for (int eachVar = 0; eachVar < inputArgTypes.size(); eachVar++) {
//                        VariableEntry variableEntry = new VariableEntry();
//                        variableEntry.setEntryType(Entry.EntryType.VARIABLE);
//
//                        String Temp[] = inputArgTypes.get(eachVar).split("\\[");
//                        int dimNum = Temp.length - 1;
//                        String type = inputArgTypes.get(eachVar).replace("[", "").replace("]", "");
//
//                        variableEntry.setDimensionNumber(dimNum);
//                        if (!inputArgIds.isEmpty()) {
//                            variableEntry.setName(inputArgIds.get(eachVar).trim());
//                        }
//                        variableEntry.setVariableType(type.toUpperCase());
//                        if (dimNum != 0) {
//                            variableEntry.setSize(4);
//                        } else if (type.equals("int")) {
//                            variableEntry.setSize(4);
//                        } else if (type.equals("float")) {
//                            variableEntry.setSize(8);
//                        } else if (type.equals("bool")) {
//                            variableEntry.setSize(1);
//                        } else if (type.equals("string")) {
//                            int size = 0 * 2 + 2;
//                            variableEntry.setSize(size);
//                        } else {
//                            variableEntry.setSize(4);
//                        }
//                        functionEntry.addArgToInput(variableEntry);
//                    }
//                }
//                // outputs
//                // process each arg wether Array or not and add it to the function
//                if (!outputArgTypes.isEmpty()) {
//                    for (int eachVar = 0; eachVar < outputArgTypes.size(); eachVar++) {
//                        VariableEntry variableEntry = new VariableEntry();
//                        variableEntry.setEntryType(Entry.EntryType.VARIABLE);
//
//                        String Temp[] = outputArgTypes.get(eachVar).split("\\[");
//                        int dimNum = Temp.length - 1;
//                        String type = outputArgTypes.get(eachVar).replace("[", "").replace("]", "");
//
//                        variableEntry.setDimensionNumber(dimNum);
//                        if (!outputArgIds.isEmpty()) {
//                            variableEntry.setName(outputArgIds.get(eachVar));
//                        }
//                        variableEntry.setVariableType(type.toUpperCase());
//                        if (dimNum != 0) {
//                            variableEntry.setSize(4);
//                        } else if (type.equals("int")) {
//                            variableEntry.setSize(4);
//                        } else if (type.equals("float")) {
//                            variableEntry.setSize(8);
//                        } else if (type.equals("bool")) {
//                            variableEntry.setSize(1);
//                        } else if (type.equals("string")) {
//                            int size = 0 * 2 + 2;
//                            variableEntry.setSize(size);
//                        } else {
//                            variableEntry.setSize(4);
//                        }
//                        functionEntry.addArgToOutput(variableEntry);
//                    }
//                }
//
//                symbolTable.put(functionEntry.getName(), functionEntry);
//            }
//
//            // type_def
//            else {
//                for (int each_component = 0; each_component < ctx.ft_def().get(each_ft_def).type_def().component().size(); each_component++) {
//
//                    String accessModifier = ctx.ft_def().get(each_ft_def).type_def().component().get(each_component).access_modifier().getText();
//
//                    // method
//                    if (ctx.ft_def().get(each_ft_def).type_def().component().get(each_component).fun_def() != null) {
//                        MethodEntry methodEntry = new MethodEntry();
//                        methodEntry.setEntryType(Entry.EntryType.METHOD);
//
//                        // PUBLIC PRIVATE PROTECTED
//                        if ( accessModifier == "public") {
//                            methodEntry.setAccessModifier(Entry.AccessModifier.PUBLIC);
//                        } else if ( accessModifier == "private" ) {
//                            methodEntry.setAccessModifier(Entry.AccessModifier.PRIVATE);
//                        } else if ( accessModifier == "protected" ) {
//                            methodEntry.setAccessModifier(Entry.AccessModifier.PROTECTED);
//                        }
//
//                        // ID
//                        methodEntry.setName(ctx.ft_def().get(each_ft_def).type_def().component().get(each_component).fun_def().ID().getText());
//
////                        methodEntry.setSize(); ---------------------------------------------------to-be-implemented---
//
//
//                        // process inputs and outputs
//                        // args and args_var sizes prepared
//                        int argsVarSize = ctx.ft_def().get(each_ft_def).type_def().component().get(each_component).fun_def().args_var().size();
//
//                        List<String> outputArgTypes = new ArrayList<String>();
//                        List<String> outputArgIds = new ArrayList<String>();
//                        List<String> inputArgTypes = new ArrayList<String>();
//                        List<String> inputArgIds = new ArrayList<String>();
//
//                        // if function has output
//                        if (ctx.ft_def().get(each_ft_def).type_def().component().get(each_component).fun_def().getText().contains("=")) {
//
//                            // output is args_var
//                            if (argsVarSize == 1) {
//                                // outputs
//                                // get the arguments recursively
//                                fillListOfArgs_var(outputArgTypes, outputArgIds, ctx.ft_def().get(each_ft_def).fun_def().args_var().get(0));
//                                Collections.reverse(outputArgTypes);
//                                Collections.reverse(outputArgIds);
//                            }
//                            // output is args_var & input is args_var[1]
//                            else if (argsVarSize == 2) {
//                                // inputs
//                                // get the arguments recursively
//                                fillListOfArgs_var(inputArgTypes, inputArgIds, ctx.ft_def().get(each_ft_def).fun_def().args_var().get(1));
//                                Collections.reverse(inputArgTypes);
//                                Collections.reverse(inputArgIds);
//
//                                // outputs
//                                // get the arguments recursively
//                                fillListOfArgs_var(outputArgTypes, outputArgIds, ctx.ft_def().get(each_ft_def).fun_def().args_var().get(0));
//                                Collections.reverse(outputArgTypes);
//                                Collections.reverse(outputArgIds);
//                            }
//                        }
//                        // if it doesn't
//                        else {
//
//                            // input is args_var
//                            if (argsVarSize == 1) {
//                                // inputs
//                                // get the arguments recursively
//                                fillListOfArgs_var(inputArgTypes, inputArgIds, ctx.ft_def().get(each_ft_def).fun_def().args_var().get(0));
//                                Collections.reverse(inputArgTypes);
//                                Collections.reverse(inputArgIds);
//                            }
//                            // if it doesn't have no output and input
//                            else if (argsVarSize == 0) {
//                                // no inputs and outputs -> no need to process
//                            }
//                        }
//
//                        // inputs
//                        // process each arg wether Array or not and add it to the function
//                        if (!inputArgTypes.isEmpty()) {
//                            for (int eachVar = 0; eachVar < inputArgTypes.size(); eachVar++) {
//                                VariableEntry variableEntry = new VariableEntry();
//                                variableEntry.setEntryType(Entry.EntryType.VARIABLE);
//
//                                String Temp[] = inputArgTypes.get(eachVar).split("\\[");
//                                int dimNum = Temp.length - 1;
//                                String type = inputArgTypes.get(eachVar).replace("[", "").replace("]", "");
//
//                                variableEntry.setDimensionNumber(dimNum);
//                                if (!inputArgIds.isEmpty()) {
//                                    variableEntry.setName(inputArgIds.get(eachVar).trim());
//                                }
//                                variableEntry.setVariableType(type.toUpperCase());
//                                if (dimNum != 0) {
//                                    variableEntry.setSize(4);
//                                } else if (type.equals("int")) {
//                                    variableEntry.setSize(4);
//                                } else if (type.equals("float")) {
//                                    variableEntry.setSize(8);
//                                } else if (type.equals("bool")) {
//                                    variableEntry.setSize(1);
//                                } else if (type.equals("string")) {
//                                    int size = 0 * 2 + 2;
//                                    variableEntry.setSize(size);
//                                } else {
//                                    variableEntry.setSize(4);
//                                }
//                                methodEntry.addArgToInput(variableEntry);
//                            }
//                        }
//                        // outputs
//                        // process each arg wether Array or not and add it to the function
//                        if (!outputArgTypes.isEmpty()) {
//                            for (int eachVar = 0; eachVar < outputArgTypes.size(); eachVar++) {
//                                VariableEntry variableEntry = new VariableEntry();
//                                variableEntry.setEntryType(Entry.EntryType.VARIABLE);
//
//                                String Temp[] = outputArgTypes.get(eachVar).split("\\[");
//                                int dimNum = Temp.length - 1;
//                                String type = outputArgTypes.get(eachVar).replace("[", "").replace("]", "");
//
//                                variableEntry.setDimensionNumber(dimNum);
//                                if (!outputArgIds.isEmpty()) {
//                                    variableEntry.setName(outputArgIds.get(eachVar));
//                                }
//                                variableEntry.setVariableType(type.toUpperCase());
//                                if (dimNum != 0) {
//                                    variableEntry.setSize(4);
//                                } else if (type.equals("int")) {
//                                    variableEntry.setSize(4);
//                                } else if (type.equals("float")) {
//                                    variableEntry.setSize(8);
//                                } else if (type.equals("bool")) {
//                                    variableEntry.setSize(1);
//                                } else if (type.equals("string")) {
//                                    int size = 0 * 2 + 2;
//                                    variableEntry.setSize(size);
//                                } else {
//                                    variableEntry.setSize(4);
//                                }
//                                methodEntry.addArgToOutput(variableEntry);
//                            }
//                        }
//
//                        symbolTable.put(methodEntry.getName(), methodEntry);
//                    }
//
//                    // attribute
//                    else {
////                        AttributeEntry attributeEntry = new AttributeEntry();
////                        attributeEntry.setEntryType(Entry.EntryType.ATTRIBUTE);
////
////                        // PUBLIC PRIVATE PROTECTED
////                        if ( accessModifier == "public") {
////                            attributeEntry.setAccessModifier(Entry.AccessModifier.PUBLIC);
////                        } else if ( accessModifier == "private" ) {
////                            attributeEntry.setAccessModifier(Entry.AccessModifier.PRIVATE);
////                        } else if ( accessModifier == "protected" ) {
////                            attributeEntry.setAccessModifier(Entry.AccessModifier.PROTECTED);
////                        }
////
////                        attributeEntry.setAttributeType();
//                        // Entry VariableTypes
//                        ctx.ft_def().get(each_ft_def).type_def().component().get(each_component).var_def().var_val();
////                        for (int each_var_def = 0; each_var_def < ctx.var_def().size(); each_var_def++) {
////                            for (int each_var_val = 0; each_var_val < ctx.var_def().get(each_var_def).var_val().size(); each_var_val++) {
////
////                                // new Entry
////                                VariableEntry vartest = new VariableEntry();
////
////                                // set typeEntry as variable
////                                vartest.setEntryType(Entry.EntryType.VARIABLE);
////
////                                // set Entry Name
////                                String name = ctx.var_def().get(each_var_def).var_val().get(each_var_val).ref().ID().toString();
////                                vartest.setName(name);
////
////                                // set Entry dimensionNumber and dimensionSizes
////                                //   split by '[' -> a[2][3][4] -> a, 2], 3], 4]
////                                String temp[] = ctx.var_def().get(each_var_def).var_val().get(each_var_val).ref().getText().split("\\[");
////                                int dimNum = temp.length - 1; // minus the name string
////                                List<Integer> dimSizes = new ArrayList<Integer>();
////                                for (int index = 1; index < dimNum; index++) {
////                                    dimSizes.add(Integer.parseInt(temp[index].replace("]", ""))); // 2] -> 2
////                                }
////                                // input: a[2][3][4] -> output: int dimensionNumber: 3, List<Integer> dimensionSizes: [2, 3, 4]
////                                vartest.setDimensionNumber(dimNum);
////                                vartest.setDimensionSizes(dimSizes);
////
////                                // set Entry type and size
////                                String type = ctx.var_def().get(each_var_def).type().getText();
////                                if (type == "int") {
////                                    vartest.setVariableType("INT");
////                                    vartest.setSize(4);
////                                } else if (type == "float") {
////                                    vartest.setVariableType("FLOAT");
////                                    vartest.setSize(8);
////                                } else if (type == "bool") {
////                                    vartest.setVariableType("BOOL");
////                                    vartest.setSize(1);
////                                } else if (type == "string") {
////                                    vartest.setVariableType("STRING");
////                                    int size = Integer.parseInt(ctx.var_def().get(each_var_def).var_val().get(each_var_val).expr().const_val().getText()) * 2 + 2;
////                                    vartest.setSize(size);
////                                } else {
////                                    vartest.setVariableType(type.toUpperCase());
////                                    vartest.setSize(4);
////                                }
////
////                                // if varTest.getName() already not in symbolTable, otherwise raise error
////                                // -----------------------------------------------------------------------to-be-implemented-------------
////                                symbolTable.put(vartest.getName(), vartest);
////                            }
////                        }
//                    }
//
//                }
//
//            }
//        }

        /**
         * end symbolTable
         * */

        globalBase.setName("GlobalScope");
        globalBase.setParentScope(null);
        pre = globalBase;
    }

    @Override
    public void exitProgram(lulu2Parser.ProgramContext ctx) {
        System.out.println("in exitProgram");

        List<BaseScope> globalChildren = globalBase.getChildrenScopes();

        for (int i = 0; i < globalChildren.size(); i++) {
            if (globalChildren.get(i).getName() != null) {
                System.out.println(globalChildren.get(i).getName());
                System.out.println();

            }
        }

        System.out.println("-------------------------------------------------");
        prTree(this.globalBase, 1);
        System.out.println("-------------------------------------------------");


    }

    @Override
    public void enterFt_dcl(lulu2Parser.Ft_dclContext ctx) {
        System.out.println("in enterFt_dcl");

        /**
         * symbolTable start
         */
        LinkedHashMap<String, Entry> symbolTable = new LinkedHashMap<>();

        // Entry VariableTypes
        for (int each_var_def = 0; each_var_def < ctx.var_def().size(); each_var_def++) {
            for (int each_var_val = 0; each_var_val < ctx.var_def().get(each_var_def).var_val().size(); each_var_val++) {

                // new Entry
                VariableEntry vartest = new VariableEntry();

                // set typeEntry as variable
                vartest.setEntryType(Entry.EntryType.VARIABLE);

                // set Entry Name
                String name = ctx.var_def().get(each_var_def).var_val().get(each_var_val).ref().ID().toString();
                vartest.setName(name);

                // set Entry dimensionNumber and dimensionSizes
                //   split by '[' -> a[2][3][4] -> a, 2], 3], 4]
                String temp[] = ctx.var_def().get(each_var_def).var_val().get(each_var_val).ref().getText().split("\\[");
                int dimNum = temp.length - 1; // minus the name string
                List<Integer> dimSizes = new ArrayList<Integer>();
                for (int index = 1; index < dimNum; index++) {
                    dimSizes.add(Integer.parseInt(temp[index].replace("]", ""))); // 2] -> 2
                }
                // input: a[2][3][4] -> output: int dimensionNumber: 3, List<Integer> dimensionSizes: [2, 3, 4]
                vartest.setDimensionNumber(dimNum);
                vartest.setDimensionSizes(dimSizes);

                // set Entry type and size
                String type = ctx.var_def().get(each_var_def).type().getText();
                if (type == "int") {
                    vartest.setVariableType("INT");
                    vartest.setSize(4);
                } else if (type == "float") {
                    vartest.setVariableType("FLOAT");
                    vartest.setSize(8);
                } else if (type == "bool") {
                    vartest.setVariableType("BOOL");
                    vartest.setSize(1);
                } else if (type == "string") {
                    vartest.setVariableType("STRING");
                    int size = Integer.parseInt(ctx.var_def().get(each_var_def).var_val().get(each_var_val).expr().const_val().getText()) * 2 + 2;
                    vartest.setSize(size);
                } else {
                    vartest.setVariableType(type.toUpperCase());
                    vartest.setSize(4);
                }

                // if varTest.getName() already not in symbolTable, otherwise raise error
                // -----------------------------------------------------------------------to-be-implemented-------------
                symbolTable.put(vartest.getName(), vartest);
            }
        }

        // Entry FunctionTypes
        for (int each_func_dcl = 0; each_func_dcl < ctx.func_dcl().size(); each_func_dcl++) {
            FunctionEntry functionEntry = new FunctionEntry();
            functionEntry.setEntryType(Entry.EntryType.FUNCTION);

            String name = ctx.func_dcl().get(each_func_dcl).ID().getText();
            functionEntry.setName(name);

            // -1 in functions from declare scope means the size has to be calculated later
            //----------------------------------------------------------------to-be-checked---------------------
            functionEntry.setSize(-1);

            // process inputs and outputs
            // args and args_var sizes prepared
            int argsSize = ctx.func_dcl().get(each_func_dcl).args().size();
            int argsVarSize;
            if (ctx.func_dcl().get(each_func_dcl).args_var() == null) {
                argsVarSize = 0;
            } else {
                argsVarSize = 1;
            }

            List<String> outputArgTypes = new ArrayList<String>();
            List<String> outputArgIds = new ArrayList<String>();
            List<String> inputArgTypes = new ArrayList<String>();
            List<String> inputArgIds = new ArrayList<String>();

            // if function has output
            if (ctx.func_dcl().get(each_func_dcl).getText().contains("=")) {

                // both args
                if (argsSize == 2 && argsVarSize == 0) {

                    // outputs
                    // get the arguments recursively
                    fillListOfArgs(outputArgTypes, ctx.func_dcl().get(each_func_dcl).args().get(0));
                    Collections.reverse(outputArgTypes);
                    // inputs
                    // get the arguments recursively
                    fillListOfArgs(inputArgTypes, ctx.func_dcl().get(each_func_dcl).args().get(0));
                    Collections.reverse(inputArgTypes);
                }
                // output is args & input is args_var
                else if (argsSize == 1 && argsVarSize == 1) {
                    // outputs
                    // get the arguments recursively
                    fillListOfArgs(outputArgTypes, ctx.func_dcl().get(each_func_dcl).args().get(0));
                    Collections.reverse(outputArgTypes);
                    // inputs
                    // get the arguments recursively
                    fillListOfArgs_var(inputArgTypes, inputArgIds, ctx.func_dcl().get(each_func_dcl).args_var());
                    Collections.reverse(inputArgTypes);
                    Collections.reverse(inputArgIds);
                }
                // output is args & no input
                else if (argsSize == 1 && argsVarSize == 0) {
                    // outputs
                    // get the arguments recursively
                    fillListOfArgs(outputArgTypes, ctx.func_dcl().get(each_func_dcl).args().get(0));
                    Collections.reverse(outputArgTypes);
                }
            }
            // if it doesn't
            else {
                // input is args
                if (argsSize == 1) {
                    // inputs
                    // get the arguments recursively
                    fillListOfArgs(inputArgTypes, ctx.func_dcl().get(each_func_dcl).args().get(0));
                    Collections.reverse(inputArgTypes);
                }
                // input is args_var
                else if (argsVarSize == 1) {
                    // inputs
                    // get the arguments recursively
                    fillListOfArgs_var(inputArgTypes, inputArgIds, ctx.func_dcl().get(each_func_dcl).args_var());
                    Collections.reverse(inputArgTypes);
                    Collections.reverse(inputArgIds);
                }
                // if it doesn't have no output and input
                else if (argsSize == 0 && argsVarSize == 0) {
                    // no inputs and outputs -> no need to process
                }
            }

            // inputs
            // process each arg wether Array or not and add it to the function
            if (!inputArgTypes.isEmpty()) {
                for (int eachVar = 0; eachVar < inputArgTypes.size(); eachVar++) {
                    VariableEntry variableEntry = new VariableEntry();
                    variableEntry.setEntryType(Entry.EntryType.VARIABLE);

                    String Temp[] = inputArgTypes.get(eachVar).split("\\[");
                    int dimNum = Temp.length - 1;
                    String type = inputArgTypes.get(eachVar).replace("[", "").replace("]", "");

                    variableEntry.setDimensionNumber(dimNum);
                    if (!inputArgIds.isEmpty()) {
                        variableEntry.setName(inputArgIds.get(eachVar).trim());
                    }
                    variableEntry.setVariableType(type.toUpperCase());
                    if (dimNum != 0) {
                        variableEntry.setSize(4);
                    } else if (type.equals("int")) {
                        variableEntry.setSize(4);
                    } else if (type.equals("float")) {
                        variableEntry.setSize(8);
                    } else if (type.equals("bool")) {
                        variableEntry.setSize(1);
                    } else if (type.equals("string")) {
                        int size = 0 * 2 + 2;
                        variableEntry.setSize(size);
                    } else {
                        variableEntry.setSize(4);
                    }
                    functionEntry.addArgToInput(variableEntry);
                }
            }
            // outputs
            // process each arg wether Array or not and add it to the function
            if (!outputArgTypes.isEmpty()) {
                for (int eachVar = 0; eachVar < outputArgTypes.size(); eachVar++) {
                    VariableEntry variableEntry = new VariableEntry();
                    variableEntry.setEntryType(Entry.EntryType.VARIABLE);

                    String Temp[] = outputArgTypes.get(eachVar).split("\\[");
                    int dimNum = Temp.length - 1;
                    String type = outputArgTypes.get(eachVar).replace("[", "").replace("]", "");

                    variableEntry.setDimensionNumber(dimNum);
                    if (!outputArgIds.isEmpty()) {
                        variableEntry.setName(outputArgIds.get(eachVar));
                    }
                    variableEntry.setVariableType(type.toUpperCase());
                    if (dimNum != 0) {
                        variableEntry.setSize(4);
                    } else if (type.equals("int")) {
                        variableEntry.setSize(4);
                    } else if (type.equals("float")) {
                        variableEntry.setSize(8);
                    } else if (type.equals("bool")) {
                        variableEntry.setSize(1);
                    } else if (type.equals("string")) {
                        int size = 0 * 2 + 2;
                        variableEntry.setSize(size);
                    } else {
                        variableEntry.setSize(4);
                    }
                    functionEntry.addArgToOutput(variableEntry);
                }
            }

            symbolTable.put(functionEntry.getName(), functionEntry);

        }

        // Entry PredefinedType
        for (int each_type_dcl = 0; each_type_dcl < ctx.type_dcl().size(); each_type_dcl++) {
            PredefinedTypeEntry typeEntry = new PredefinedTypeEntry();
            typeEntry.setEntryType(Entry.EntryType.TYPE);
            typeEntry.setName(ctx.type_dcl().get(each_type_dcl).ID().getText());
            typeEntry.setSize(-1); //--------------------------------------------------------to-be-implemented----------
            symbolTable.put(typeEntry.getName(), typeEntry);
        }

//        System.out.println();
//        for (HashMap.Entry<String, Entry> entry : symbolTable.entrySet()) {
//            System.out.println(entry.getValue());
//        }
//        System.out.println();
        /**
         * symbolTable end
         */


        BaseScope declareScope = new BaseScope();
        declareScope.setName(ctx.DECLARE().getText());
        declareScope.setParentScope(pre);
        pre.addChildScope(declareScope);

    }

    @Override
    public void exitFt_dcl(lulu2Parser.Ft_dclContext ctx) {
        System.out.println("in exitFt_dcl");
    }

    @Override
    public void exitFt_def(lulu2Parser.Ft_defContext ctx) {
        System.out.println("in exitFt_def");
    }

    @Override
    public void exitFunc_dcl(lulu2Parser.Func_dclContext ctx) {
        System.out.println("in exitFunc_dcl");
    }

    @Override
    public void enterType_def(lulu2Parser.Type_defContext ctx) {

        BaseScope typeDef = new BaseScope();
        typeDef.setName(ctx.TYPE().getText() + " " + ctx.ID().get(0).getText());
        typeDef.setParentScope(pre);
        pre.addChildScope(typeDef);

    }


    @Override
    public void enterBlock(lulu2Parser.BlockContext ctx) {

        BaseScope blockScope = new BaseScope();

        String first = ctx.getParent().getChild(0).getText();


        if (first.equals("(") || first.equals("function")) {

            if (first.equals("(")) {
                blockScope.setName("function" + " " + ctx.getParent().getChild(5).getText());
            } else if (first.equals("function")) {
                blockScope.setName("function" + " " + ctx.getParent().getChild(1).getText());
            }


            blockScope.setParentScope(pre);
            pre.addChildScope(blockScope);
            pre = blockScope;


        } else {

            for (lulu2Parser.StmtContext temp : ctx.stmt()) {
                if (temp.cond_stmt() != null) {
                    if (temp.cond_stmt().IF() != null) {
                        if (temp.cond_stmt().ELSE() != null) {   //cond_stmt with else

                            BaseScope ifScope = new BaseScope();
                            BaseScope elseScope = new BaseScope();
                            ifScope.setName("if");
                            ifScope.setParentScope(pre);
                            pre.addChildScope(ifScope);
                            elseScope.setName("else");
                            elseScope.setParentScope(pre);
                            pre.addChildScope(elseScope);


                            pre = ifScope; //reminder-----------change parent


                        } else if (temp.cond_stmt().ELSE() == null) {

                            //cond_stmt without else
                            //BaseScope blockScope = new BaseScope();
                            blockScope.setName("if");
                            blockScope.setParentScope(pre);
                            pre.addChildScope(blockScope);
                            pre = blockScope;
                        }

                    } else if (temp.cond_stmt().SWITCH() != null) {

                        //BaseScope switchScope = new BaseScope();
                        blockScope.setName("switch");
                        blockScope.setParentScope(pre);
                        pre.addChildScope(blockScope);


                        BaseScope defaultScope = new BaseScope();
                        defaultScope.setName("default");
                        defaultScope.setParentScope(blockScope);
                        blockScope.addChildScope(defaultScope);


                        for (int i = 0; i < temp.cond_stmt().CASE().size(); i++) {
                            BaseScope caseScope = new BaseScope();
                            caseScope.setName("case");
                            caseScope.setParentScope(blockScope);
                            blockScope.addChildScope(caseScope);
                        }


                    }


                } else if (temp.loop_stmt() != null) {
                    if (temp.loop_stmt().FOR() != null) {

                        //BaseScope forScope = new BaseScope();
                        blockScope.setName("for");
                        blockScope.setParentScope(pre);
                        pre.addChildScope(blockScope);
                        pre = blockScope;

                    } else if (temp.loop_stmt().WHILE() != null) {

                        //BaseScope blockScope = new BaseScope();
                        blockScope.setName("while");
                        blockScope.setParentScope(pre);
                        blockScope.addChildScope(blockScope);
                        pre = blockScope;

                    }
                }
            }

        }


    }

    @Override
    public void exitBlock(lulu2Parser.BlockContext ctx) {
        System.out.println("in exitBlock");

//        System.out.println(pre.getName());

//        if (first.equals("if")) {
//            if (ctx.getParent().getChild(3) != null) {
//                preIfWithElse = true;
//            } else {
//                preIfWithElse = false;
//            }
//        }

//        System.out.println("Current ==== " + pre.getName());
        if (pre != null) {
            pre = pre.getParentScope();

        } else {
//            System.out.println("pashmm");
        }

//        System.out.println("Parent ==== " + pre.getName());

    }

    @Override
    public void enterLoop_stmt(lulu2Parser.Loop_stmtContext ctx) {
//        System.out.println("in enterLoop");
//
//        BaseScope loopStmt = new BaseScope();
//        String name = ctx.getChild(0).getText();
//
//        if (name == "for") {
//            loopStmt.setName("for");
//        } else {
//            loopStmt.setName("while");
//        }
//
//        loopStmt.setParentScope(pre);
//        System.out.println("---setParent---");
//        pre.addChildScope(loopStmt);
//        System.out.println("---addToChildrenParent---");
//
//        pre = loopStmt;

    }

    @Override
    public void exitLoop_stmt(lulu2Parser.Loop_stmtContext ctx) {
//        System.out.println("in exitLoop");
//
//        pre = pre.getParentScope();
    }

    @Override
    public void enterStmt(lulu2Parser.StmtContext ctx) {
//        System.out.println("in enterStmt");
//        System.out.println(pre.getName());
//
//        BaseScope stmtScope = new BaseScope();
//        stmtScope.setParentScope(pre);
//        System.out.println("---setParent---");
//        pre.addChildScope(stmtScope);
//        System.out.println("---addToChildrenParent---");
//
//        pre = stmtScope;
//        System.out.println("---change Scope to prerent Scope---");
//        System.out.println(pre.getName());
    }

    @Override
    public void exitStmt(lulu2Parser.StmtContext ctx) {
//        System.out.println("in exitStmt");
//        System.out.println(pre.getName());
//
//        pre = pre.getParentScope();
//        System.out.println(pre.getName());
    }


    @Override
    public void enterCond_stmt(lulu2Parser.Cond_stmtContext ctx) {
        System.out.println("in enterCond_stmt");
        System.out.println();


//        System.out.println(pre.getName());
//
//        BaseScope condStmt = new BaseScope();
//        String name = ctx.getChild(0).getText();
//
//
//        if (name.equals("if") && ctx.ELSE() == null) {
//            if (preIfWithElse == false) {
//                condStmt.setName("else");
//
//            }
//            System.out.println("++++++++++++++++++++++++++++++++++++++ without else");
//        }
//        else if (name.equals("if") && ctx.ELSE() != null) {
//            if (preIfWithElse == true) {
//                condStmt.setName("else");
//
//            } else {
//                condStmt.setName("if");
//            }
//            System.out.println("++++++++++++++++++++++++++++++++++++++ with else");
//
//        }
//
//        if (name.equals("switch")) {
//            condStmt.setName("switch");
//        }
//
//        //reminder----scope case & default kamel shavad
//
//        condStmt.setParentScope(pre);
//        System.out.println("---setParent---");
//        pre.addChildScope(condStmt);
//        System.out.println("---addToChildrenParent---");
//
//        pre = condStmt;
//        System.out.println("---change Scope to prerent Scope---");


    }


    @Override
    public void exitCond_stmt(lulu2Parser.Cond_stmtContext ctx) {
        System.out.println(" in exitCond_stmt");


//        //reminder----- taqire pre baraye taqire parent halqehaye tu dar tu
//        pre = pre.getParentScope();
//        System.out.println("---Change preScope to parentScope---");
    }

}

