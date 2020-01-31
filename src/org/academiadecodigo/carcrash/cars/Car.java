package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public abstract class Car {

    /** The position of the car on the grid */
    private Position pos;
    private boolean isCrashed;

    public Car(Position position){

        pos = position;
        isCrashed = false;
    }



    public Position getPos() {
        return pos;
    }

    public boolean isCrashed() {

        return isCrashed;
    }

    public void setIsCrashed(boolean isCrashed) {
        this.isCrashed = isCrashed;
    }

    /*public boolean crashed(Car car) {
        if (pos.getCol() == car.pos.getCol() && pos.getRow() == car.pos.getRow()) {
            isCrashed() = true;
            return true;
        } else {

            return false;
        }
    }*/

    public void moveRandom() {

        int index = (int) (Math.random() * 4);

        switch(index) {
            case 0:
                pos.turnRight();
                break;

            case 1:
                pos.turnLeft();
                break;

            case 2:
                pos.goAhead();
                break;

            case 3:
                pos.goBehind();
                break;
        }
    }
}
