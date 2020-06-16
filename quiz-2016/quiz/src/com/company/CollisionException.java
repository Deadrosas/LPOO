package com.company;

public class CollisionException extends Exception{
    public CollisionException(){
        super("Can't calculate the same value by two diferente gates!");
    }
}
