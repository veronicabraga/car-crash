package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public class Renault extends Car{

    public Renault() {
        super(new Position());
    }

    @Override
    public int getSpeed() {
        return 2;
    }


    @Override
    public String toString() {
        return "r";
    }
}


