package com.company;

import java.util.ArrayList;
import java.util.List;

public class CombinatorialCircuit {

    List<LogicVariable> logicVariableList;

    public CombinatorialCircuit(){
        logicVariableList = new ArrayList<>();
    }

    public boolean addVariable(LogicVariable a){
        if(!logicVariableList.contains(a)){
            logicVariableList.add(a);
            return true;
        }
        return false;
    }

    public LogicVariable getVariableByName(String name){
        for(LogicVariable lvar : logicVariableList){
            if(lvar.getName().equals(name)){
                return lvar;
            }
        }
        return null;
    }
}
