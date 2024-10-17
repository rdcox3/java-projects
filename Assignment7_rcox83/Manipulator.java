public class Manipulator {
    public static void main(String[] args) {
        Drawable[] objects = new Drawable[4];
        objects[0] = new Animal("Lion");
        objects[1] = new Vehicle("Car", 5);
        objects[2] = new Vehicle("Bus", 10);
        objects[3] = new Animal("Elephant");

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
    }
}
