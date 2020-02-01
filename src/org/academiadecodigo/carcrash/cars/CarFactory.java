package org.academiadecodigo.carcrash.cars;

public class CarFactory {

    public static Car getNewCar() {

            int index = (int) (Math.random() * 3);

            switch(index) {
                case 0:
                    return new Bmw();

                case 1:
                    return new Renault();

                default:
                   return new Peugeot();
            }


    }
}
