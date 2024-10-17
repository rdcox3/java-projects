/*
Ron Cox
Java 605.201.83
Assignment 8
*/

public class Animal implements Drawable, Rotatable, Resizable, Sounds {
    private String name;
    private String sound;

    public Animal(String name, String sound) {
        this.name = name;
	this.sound = sound;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    @Override
    public void drawObject() {
        System.out.println("Drawing an Animal: " + name);
    }

    @Override
    public void rotateObject() {
        System.out.println("Rotating an Animal: " + name);
    }

    @Override
    public void resizeObject() {
        System.out.println("Resizing an Animal: " + name);
    }

    @Override
    public void playSound() {
        System.out.println(name + " makes a " + sound + " sound.");
    }
}//end class Animal
