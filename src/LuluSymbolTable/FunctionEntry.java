package LuluSymbolTable;

import java.lang.reflect.Array;
import java.util.*;

public class FunctionEntry extends Entry {
    private List<VariableEntry> inputArgs;
    private List<VariableEntry> outputArgs;

    public FunctionEntry() {
        inputArgs = new ArrayList<VariableEntry>(Arrays.asList());
        outputArgs = new ArrayList<VariableEntry>(Arrays.asList());
    }

    public String toString() {
        String inputs = "";
        for (int eachInput = 0; eachInput < this.inputArgs.size(); eachInput++) {
            inputs = inputs + inputArgs.get(eachInput).toString() + "\n" ;
        }
        String outputs = "";
        for (int eachOutput = 0; eachOutput < this.outputArgs.size(); eachOutput++) {
            outputs = outputs + outputArgs.get(eachOutput).toString() + "\n" ;
        }
        return "entryType: " + this.getEntryType() + ", "
                + "name: " + this.getName() + ", "
                + "size: " + this.getSize() + ",\n"
                + "inputsStart-----\n" + inputs + "inputsEnd-----\n"
                + "outputsStart+++++\n" + outputs + "outputsEnd+++++";
    }

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

    public void addArgToOutput(VariableEntry arg) {
        this.outputArgs.add(arg);
    }

}
