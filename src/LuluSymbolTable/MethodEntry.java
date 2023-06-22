package LuluSymbolTable;

import java.util.List;

public class MethodEntry extends Entry {
    private List<VariableEntry> inputArgs;
    private List<VariableEntry> outputArgs;
    private AccessModifier accessModifier;

    public List<VariableEntry> getInputArgs() {
        return inputArgs;
    }

    public void setInputArgs(List<VariableEntry> inputArgs) {
        this.inputArgs = inputArgs;
    }

    public void addArgToInput(VariableEntry arg) {
        this.inputArgs.add(arg);
    }

    public List<VariableEntry> getOutputArgs() {
        return outputArgs;
    }

    public void setOutputArgs(List<VariableEntry> outputArgs) {
        this.outputArgs = outputArgs;
    }

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(AccessModifier accessModifier) {
        this.accessModifier = accessModifier;
    }

    public void addArgToOutput(VariableEntry arg) {
        this.outputArgs.add(arg);
    }

}
