package LuluSymbolTable;

import java.util.*;

public class VariableEntry extends Entry {

    private String variableType;
    private int dimensionNumber = 0; // is >= 0 and is 0 if no dimension
    private List<Integer> dimensionSizes = new ArrayList<Integer>(); // a[2][3][4] -> [2, 3, 4], is [] if dimensionNumber is 0 & is null if array is declared in function argument
    
    public String toString() {
        return "entryType: " + this.getEntryType() + ", "
                + "variableType: " + this.getVariableType() + ", "
                + "name: " + this.getName() + ", "
                + "dimNum: " + this.getDimensionNumber() + ", "
                + "dimSizes: " + this.getDimensionSizes() + ", "
                + "size: " + this.getSize();
    }

    public String getVariableType() {
        return variableType;
    }

    public void setVariableType(String variableType) {
        this.variableType = variableType;
    }

    public Integer getDimensionNumber() {
        return dimensionNumber;
    }

    public void setDimensionNumber(Integer dimensionNumber) {
        this.dimensionNumber = dimensionNumber;
    }

    public List<Integer> getDimensionSizes() {
        return dimensionSizes;
    }

    public void setDimensionSizes(List<Integer> dimensionSizes) {
        this.dimensionSizes = dimensionSizes;
    }
}
