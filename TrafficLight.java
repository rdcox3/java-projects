import java.util.concurrent.TimeUnit;

class TrafficLight {
    enum Color {
        RED, YELLOW, GREEN
    }

    private Color color;

    public TrafficLight() {
        this.color = Color.RED; // Initialize with a red light
    }

    public void changeColor(Color newColor) {
        this.color = newColor;
    }

    public Color getColor() {
        return color;
    }
}

class Intersection {
    private TrafficLight northLight;
    private TrafficLight southLight;
    private TrafficLight eastLight;
    private TrafficLight westLight;

    public Intersection() {
        northLight = new TrafficLight();
        southLight = new TrafficLight();
        eastLight = new TrafficLight();
        westLight = new TrafficLight();
    }

    public void simulateTraffic() {
        while (true) {
            // Simulate the traffic light changes
            changeTrafficLights();

            // Print the current traffic light state
            System.out.println("North: " + northLight.getColor() +
                    " South: " + southLight.getColor() +
                    " East: " + eastLight.getColor() +
                    " West: " + westLight.getColor());

            // Delay to make the simulation readable (in milliseconds)
            try {
                TimeUnit.SECONDS.sleep(2);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    private void changeTrafficLights() {
        // Implement the logic to change traffic lights here based on the traffic rules
        // For example, you could simulate a simple pattern like:
        // Green: North-South, Red: East-West, then switch to Green: East-West, Red: North-South
        northLight.changeColor(TrafficLight.Color.RED);
        southLight.changeColor(TrafficLight.Color.RED);
        eastLight.changeColor(TrafficLight.Color.GREEN);
        westLight.changeColor(TrafficLight.Color.GREEN);

        // Wait for a few seconds to simulate the green light duration
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        // Change to the next state (opposite direction gets green)
        northLight.changeColor(TrafficLight.Color.GREEN);
        southLight.changeColor(TrafficLight.Color.GREEN);
        eastLight.changeColor(TrafficLight.Color.RED);
        westLight.changeColor(TrafficLight.Color.RED);

        // Wait for a few seconds to simulate the green light duration
        try {
            TimeUnit.SECONDS.sleep(3);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}

public class Main {
    public static void main(String[] args) {
        Intersection intersection = new Intersection();
        intersection.simulateTraffic();
    }
}
