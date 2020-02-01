package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public class Peugeot extends Car{


    public Peugeot() {
        super(new Position());

    }

    @Override
    public int getSpeed() {
        return 1;
    }



    @Override
    public String toString() {
        return "p";
    }
}
