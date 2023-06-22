package LuluSymbolTable;

import java.util.List;

public class AttributeEntry extends Entry {
    private String attributeType;
    private int dimensionNumber; // is >= 0 and is 0 if dimensionless
    private List<Integer> dimensionSizes; // a[2][3][4] -> [2, 3, 4]
    private AccessModifier accessModifier;

    public String getAttributeType() {
        return attributeType;
    }

    public void setAttributeType(String attributeType) {
        this.attributeType = attributeType;
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

    public AccessModifier getAccessModifier() {
        return accessModifier;
    }

    public void setAccessModifier(AccessModifier accessModifier) {
        this.accessModifier = accessModifier;
    }

}
