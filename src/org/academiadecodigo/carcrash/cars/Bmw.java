package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public class Bmw extends Car{
    private int speed;

    public Bmw() {

        super(new Position());
        speed = 3;
    }


    @Override
    public String toString() {
        return "b";
     }
}
