package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public class Renault extends Car{
    private int speed;

    public Renault() {
        super(new Position());
        speed = 2;
    }


    @Override
    public String toString() {
        return "r";
    }
}


