package com.company;

public class GateAnd extends LogicGate{

    public GateAnd(LogicVariable a, LogicVariable b, LogicVariable c) throws CollisionException, CycleException {
        super.a = a;
        super.b = b;
        super.c = c;
        if(a.getCalculatedBy()!=null){
            throw new CollisionException();
        }
        a.setCalculatedBy(this);
        a.setValue(this.calculateValue());
        if(super.a.whatCalculates()==super.b || super.a.whatCalculates()==super.c) throw new CycleException();
        b.setCalculates(a);
        c.setCalculates(a);
    }

    @Override
    public String getSymbol(){
        return new String("AND");
    }

    @Override
    public boolean calculateValue(){
        return b.getValue() & c.getValue();
    }
}
