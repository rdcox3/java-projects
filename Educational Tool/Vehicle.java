public class Vehicle implements Drawable, Rotatable, Resizable, Sounds {
    private String name;
    private int age;

    public Vehicle(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    @Override
    public void drawObject() {
        System.out.println("Drawing a Vehicle");
    }

    @Override
    public void rotateObject() {
        System.out.println("Rotating a Vehicle");
    }

    @Override
    public void resizeObject() {
        System.out.println("Resizing a Vehicle");
    }

    @Override
    public void playSound() {
        System.out.println("Vehicle sound");
    }
}