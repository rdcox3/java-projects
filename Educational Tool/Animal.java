public class Animal implements Drawable, Rotatable, Resizable, Sounds {
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Override
    public void drawObject() {
        System.out.println("Drawing an Animal");
    }

    @Override
    public void rotateObject() {
        System.out.println("Rotating an Animal");
    }

    @Override
    public void resizeObject() {
        System.out.println("Resizing an Animal");
    }

    @Override
    public void playSound() {
        System.out.println("Animal sound");
    }
}
