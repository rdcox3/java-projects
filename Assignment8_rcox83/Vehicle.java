/*
Ron Cox
Java 605.201.83
Assignment 8
*/

public class Vehicle implements Drawable, Rotatable, Resizable, Sounds {
    private String name;
    private int age;
    private String sound;


    public Vehicle(String name, int age, String sound) {
        this.name = name;
        this.age = age;
	this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public String getSound() {
        return sound;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public void drawObject() {
        System.out.println("Drawing a Vehicle: " + name + " (Age: " + age + ")");
    }

    @Override
    public void rotateObject() {
         System.out.println("Rotating a Vehicle: " + name + " (Age: " + age + ")");
    }

    @Override
    public void resizeObject() {
        System.out.println("Resizing a Vehicle: " + name + " (Age: " + age + ")");
    }

    @Override
    public void playSound() {
        System.out.println(name + " goes " + sound + ".");
    }
}//end class Vehicle