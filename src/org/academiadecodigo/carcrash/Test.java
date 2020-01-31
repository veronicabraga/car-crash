package org.academiadecodigo.carcrash;

import org.academiadecodigo.carcrash.field.Position;

public class Test {

    public static void main(String[] args) {

        Position position1 = new Position(1, 2);

        position1.turnLeft();

        System.out.println(position1.getCol());

        //position1.turnRight();
        //System.out.println(position1.getCol());

        //position1.goAhead();
        //System.out.println(position1.getRow());

        //position1.goBehind();
        //System.out.println(position1.getRow());
    }
}
