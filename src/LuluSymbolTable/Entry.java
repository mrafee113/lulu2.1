package LuluSymbolTable;

public abstract class Entry {

    public enum AccessModifier {
        PUBLIC, PRIVATE, PROTECTED
    }

    public enum EntryType {
        VARIABLE, ATTRIBUTE, FUNCTION, METHOD, TYPE
    }

    private String name;
    private Integer size;
    private EntryType entryType;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public EntryType getEntryType() {
        return entryType;
    }

    public void setEntryType(EntryType entryType) {
        this.entryType = entryType;
    }

}
