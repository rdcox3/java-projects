/*
Ron Cox
Java 605.201.83
Assignment 8
*/

public class ManipulateAnimals {
    public static void main(String[] args) {
        Drawable[] objects = new Drawable[4];
        objects[0] = new Animal("Lion", "roar");
        objects[1] = new Vehicle("Car", 5, "beep");
        objects[2] = new Vehicle("Bus", 10, "honk");
        objects[3] = new Animal("Elephant", "trumpet");

        for (Drawable object : objects) {
            object.drawObject();
            if (object instanceof Rotatable) {
                ((Rotatable) object).rotateObject();
            }
            if (object instanceof Resizable) {
                ((Resizable) object).resizeObject();
            }
            if (object instanceof Sounds) {
                ((Sounds) object).playSound();
            }
            System.out.println();
        }
    }//end class ManipulatorAnimals
}//end main
