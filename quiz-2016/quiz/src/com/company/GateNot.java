package com.company;

public class GateNot extends LogicGate{
    public GateNot(LogicVariable a, LogicVariable b) throws CollisionException, CycleException {
        super.a = a;
        super.b = b;
        if(a.getCalculatedBy()!=null){
            throw new CollisionException();
        }
        a.setCalculatedBy(this);
        a.setValue(this.calculateValue());
        if(super.a.whatCalculates()==super.b) throw new CycleException();
        b.setCalculates(a);
    }

    @Override
    public LogicVariable[] getInputs(){
        return new LogicVariable[]{super.b};
    }

    @Override
    public String getSymbol(){
        return new String("NOT");
    }

    @Override
    public boolean calculateValue(){
        return !b.getValue();
    }
}
