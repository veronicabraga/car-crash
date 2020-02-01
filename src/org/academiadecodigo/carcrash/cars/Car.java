package org.academiadecodigo.carcrash.cars;

import org.academiadecodigo.carcrash.field.Position;

public abstract class Car {

    /** The position of the car on the grid */
    private Position pos;
    private boolean isCrashed;
    private int speed;

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


    public int getSpeed() {
        return speed;
    }

    public void moveRandom() {

        int index = (int) (Math.random() * 4);

        switch(index) {
            case 0:
                pos.turnRight(getSpeed());
                break;

            case 1:
                pos.turnLeft(getSpeed());
                break;

            case 2:
                pos.goAhead(getSpeed());
                break;

            case 3:
                pos.goBack(getSpeed());
                break;
        }
    }
}
