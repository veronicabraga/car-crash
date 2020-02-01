package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public class Peugeot extends Car{
    private int speed;

    public Peugeot() {
        super(new Position());
        speed = 1;
    }


    @Override
    public String toString() {
        return "p";
    }
}
