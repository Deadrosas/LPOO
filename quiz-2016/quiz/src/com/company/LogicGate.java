package com.company;

public abstract class LogicGate {
    protected LogicVariable a;
    protected LogicVariable b;
    protected LogicVariable c;

    public LogicVariable getOutput(){
        return this.a;
    }

    public LogicVariable[] getInputs(){
        return new LogicVariable[]{this.b,this.c};
    }

    public String getSymbol(){
        return "";
    }

    public String getFormula(){
         return a.getFormula();
    }

    public boolean calculateValue(){
        return false;
    }
}
