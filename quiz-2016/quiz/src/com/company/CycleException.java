package com.company;

public class CycleException extends Exception {
    public CycleException(){
        super("Can't Be circular");
    }
}
