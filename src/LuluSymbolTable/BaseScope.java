package LuluSymbolTable;

import javafx.util.Pair;
import jdk.nashorn.internal.objects.Global;

import java.util.*;



public class BaseScope {

    public enum ScopeType {
        globalScope, declareScope, functionScope, predefinedTypeScope, ifScope, elseScope, switchScope, caseScoope, defaultScope, whileScope, forScope;
    }
    private String name;
    private int width;
    public ScopeType scopeType;
    private BaseScope parentScope;
    private List<BaseScope> childrenScopes = new ArrayList<>();

    public void setSymbolTable(LinkedHashMap<String, Entry> symbolTable) {
        this.symbolTable = symbolTable;
    }

    private LinkedHashMap<String, Entry> symbolTable;
    static BaseScope declareContainer;


    public String getName() {
        return name;
    }


    public void setName(String name) {
        this.name = name;
    }


    public BaseScope getParentScope() {
        return parentScope;
    }


    public void setParentScope(BaseScope parent) {
        this.parentScope = parent;
    }


    public List<BaseScope> getChildrenScopes() {
        return childrenScopes;
    }


    public void addChildScope(BaseScope child) {
        childrenScopes.add(child);
    }


    public List<BaseScope> getPathToRootScopes() {
        List<BaseScope> temp = new ArrayList<BaseScope>();
        BaseScope traverser = this;
        while (traverser != null) {
            temp.add(traverser);
            traverser = ((BaseScope) traverser).parentScope;
        }
        return temp;
    }


    public Pair<String, Entry> getLocalSymbol(String symbol) {
        if (symbolTable.isEmpty()) {
        } // exception
        else if (!symbolTable.containsKey(symbol)) {
            return null;
        }
        Pair<String, Entry> temp = new Pair<String, Entry>(symbol, symbolTable.get(symbol));
        return temp;
    }


    public Pair<String, Entry> getSymbol(String symbol) {
        if (symbolTable.isEmpty()) {

        } // exception
        Pair<String, Entry> local = getLocalSymbol(symbol);
        if (local != null) {
            return local;
        } else if (this == BaseScope.declareContainer) {
            return this.getLocalSymbol(symbol);
        } else {
            BaseScope traverser = parentScope;
            while (traverser != null) {
                local = traverser.getLocalSymbol(symbol);
                if (local != null) {
                    return local;
                } else {
                    traverser = traverser.getParentScope();
                }
            }
            // when global parameter used in other scopes
            local = BaseScope.declareContainer.getLocalSymbol(symbol);
            if (local != null) {
                return local;
            } else {
                return null;
            }
        }
    }


    public void addSymbol(String name, Entry entry){
        symbolTable.put(name, entry);
    }


}
