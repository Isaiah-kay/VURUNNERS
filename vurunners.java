/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package kvm.vurunners;


public class vurunners {
    public static void main(String[] args) {
        // Array of runners names
        String[] runnerNames = {
            "Elena", "Thomas", "Hamilton", "Suzie", "Phil","Matt", "Alex", "Emma", "John","James", "Jane", "Emily", "Daniel","Neda","Aaron","Kate"  
        };

        // Array of corresponding times in minutes
        double [] runnerTimes = {
            341, 273, 278, 329, 445, 402, 388, 275, 243, 334, 412, 393, 299, 343, 317, 265
        };

        // Sort the runners by their times
        sortRunners(runnerTimes, runnerNames);

        // Display the runners from fastest to last
        System.out.println("Runners sorted from fastest to last:");
        for (int i = 0; i < runnerNames.length; i++) {
            System.out.println(runnerNames[i] + ": " + runnerTimes[i] + " minutes");
        }

        // Outputting the first and second fastest runners
        if (runnerNames.length >= 2) {
            System.out.println("\nThe Fastest Runners:");
            System.out.println("1st: " + runnerNames[0] + " with a time of " + runnerTimes[0] + " minutes");
            System.out.println("2nd: " + runnerNames[1] + " with a time of " + runnerTimes[1] + " minutes");
        }
    }

    // Method to sort runners times in ascending order using the bubble sort
    public static void sortRunners(double[] times, String[] names) {
        int n = times.length;
        for (int i = 0; i < n - 1; i++) {
            for (int j = 0; j < n - i - 1; j++) {
                // Compare adjacent times and swap if they are in the wrong order
                if (times[j] > times[j + 1]) {
                    // Swap times
                    double tempTime = times[j];
                    times[j] = times[j + 1];
                    times[j + 1] = tempTime;

                    // Swap corresponding names
                    String tempName = names[j];
                    names[j] = names[j + 1];
                    names[j + 1] = tempName;
                }
            }
        }
    }
}
