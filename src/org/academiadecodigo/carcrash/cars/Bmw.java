package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public class Bmw extends Car{


    public Bmw() {

        super(new Position());
    }

    @Override
    public int getSpeed() {
        return 5;
    }


    @Override
    public String toString() {
        return "b";
     }
}
