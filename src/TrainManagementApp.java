import java.util.HashMap;
import java.util.Map;

public class TrainManagementApp {
    public static void main(String[] args) {

        // Create HashMap for bogie and capacity
        HashMap<String, Integer> bogieCapacity = new HashMap<>();

        // Insert bogie-capacity mapping
        bogieCapacity.put("Sleeper", 72);
        bogieCapacity.put("AC Chair", 60);
        bogieCapacity.put("First Class", 24);

        // Display bogie capacities
        System.out.println("Bogie Capacity Details:");

        for (Map.Entry<String, Integer> entry : bogieCapacity.entrySet()) {
            System.out.println(entry.getKey() + " -> " + entry.getValue() + " seats");
        }
    }
}