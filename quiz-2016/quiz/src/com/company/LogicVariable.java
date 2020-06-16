package com.company;

import java.util.Objects;

public class LogicVariable {
    private String name;
    private boolean value;

    private LogicGate calculatedBy;
    private LogicVariable varItCalculates;

    public LogicVariable(String name){
        this.name = name;
    }

    public LogicVariable(String name, boolean value){
        this.name = name;
        this.value = value;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCalculates(LogicVariable a){
        this.varItCalculates = a;
    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof LogicVariable)) return false;
        LogicVariable that = (LogicVariable) o;
        return value == that.value &&
                Objects.equals(name, that.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, value);
    }

    public boolean getValue() {
        return value;
    }

    public void setValue(boolean value) {
        this.value = value;
        if(this.checkIfCalculatesSomething()){
            this.varItCalculates.calculateNewValue();
        }
    }

    public LogicVariable whatCalculates(){
        return this.varItCalculates;
    }

    public boolean checkIfCalculatesSomething(){
        return varItCalculates != null ;
    }

    public void calculateNewValue(){
        if(calculatedBy instanceof GateNot){
            this.setValue(!calculatedBy.getInputs()[0].getValue());
        }else if(calculatedBy instanceof GateAnd){
            this.setValue(calculatedBy.getInputs()[0].getValue() & calculatedBy.getInputs()[1].getValue());
        }else if(calculatedBy instanceof GateOr){
            this.setValue(calculatedBy.getInputs()[0].getValue() | calculatedBy.getInputs()[1].getValue());
        }
    }

    public LogicGate getCalculatedBy(){
        return calculatedBy;
    }

    public void setCalculatedBy(LogicGate gate){
        calculatedBy = gate;
    }

    public String getFormula(){
        if(calculatedBy == null){
            return getName();
        }else{
            return !calculatedBy.getSymbol().equals("NOT") ? calculatedBy.getSymbol() + '(' + calculatedBy.getInputs()[0].getFormula() + ',' + calculatedBy.getInputs()[1].getFormula() + ')' : calculatedBy.getSymbol() + '(' + calculatedBy.getInputs()[0].getFormula() + ')' ;
        }
    }
}
