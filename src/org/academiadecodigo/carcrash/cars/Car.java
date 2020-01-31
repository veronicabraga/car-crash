package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public abstract class Car {

    /** The position of the car on the grid */
    private Position pos;
    //private boolean isCrashed;

    public Car(int column, int row){
        pos = new Position(column, row);
        //isCrashed = false;
    }



    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {

        return false;
    }

    /*public boolean crashed(Car car) {
        if (pos.getCol() == car.pos.getCol() && pos.getRow() == car.pos.getRow()) {
            isCrashed = true;
            return true;
        } else {
            isCrashed = false;
            return false;
        }
    }*/
}
