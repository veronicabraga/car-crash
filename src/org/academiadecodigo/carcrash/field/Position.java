package org.academiadecodigo.carcrash.field;

public class Position {

    private int column;
    private int row;
    //private int width = 4;
    //private int height = 4;

    public Position() {
        this.column = (int) (Math.random() * (Field.getWidth()) );
        this.row = (int) (Math.random() * (Field.getHeight()));;
    }

    public int getCol() {

        return column;
    }

    public int getRow() {

        return row;
    }

    public void turnRight() {

        if (!(column == Field.getWidth() - 1)) {
            column++;
        }
        /*else {
            System.out.println("Limit exceeded, you can not turn right.");
        }*/
    }

    public void turnLeft() {
        if (!(column == 0)) {
            column--;
        }
        /*else {
            System.out.println("Limit exceeded, you can not turn left.");
        }*/
    }

    public void goAhead() {
        if (!(row == 0)) {
            row--;
        }
    }

    public void goBehind() {
        if (!(row == Field.getHeight() - 1)) {
            row++;
        }

    }

}
