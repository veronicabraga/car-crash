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

    public void turnRight(int speed) {

        if (column <= Field.getWidth() - 1 - speed) {
            column += speed;
        }

    }

    public void turnLeft(int speed) {
        if (column - speed > 0) {
            column -= speed;
        }

    }

    public void goAhead(int speed) {
        if (row - speed > 0) {
            row -= speed;
        }
    }

    public void goBack(int speed) {
        if (row <= Field.getHeight() - 1 - speed) {
            row += speed;
        }

    }

}
