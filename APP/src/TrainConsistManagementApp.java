import java.util.*;

public class TrainConsistManagementApp {

    public static void main(String[] args) {

        System.out.println("=== Train Consist Management App ===");

        // Create ArrayList for passenger bogies
        ArrayList<String> bogies = new ArrayList<>();

        // Adding bogies
        bogies.add("Sleeper");
        bogies.add("AC Chair");
        bogies.add("First Class");

        // Display after adding
        System.out.println("\nBogies after addition:");
        System.out.println(bogies);

        // Remove one bogie
        bogies.remove("AC Chair");

        // Display after removal
        System.out.println("\nBogies after removing AC Chair:");
        System.out.println(bogies);

        // Check existence
        if (bogies.contains("Sleeper")) {
            System.out.println("\nSleeper bogie is present in the train.");
        } else {
            System.out.println("\nSleeper bogie is NOT present.");
        }

        // Final list
        System.out.println("\nFinal Train Consist:");
        System.out.println(bogies);
    }
}