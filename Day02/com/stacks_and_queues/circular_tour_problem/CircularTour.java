package Day02.com.stacks_and_queues.circular_tour_problem;

public class CircularTour {
    static int findStartingPoint(int[] petrol, int[] distance) {
        int totalPetrol = 0, totalDistance = 0;
        int surplus = 0, start = 0;

        for (int i = 0; i < petrol.length; i++) {
            totalPetrol += petrol[i];
            totalDistance += distance[i];
            surplus += petrol[i] - distance[i];

            // If surplus is negative, reset start index
            if (surplus < 0) {
                start = i + 1; // Move start to the next pump
                surplus = 0; // Reset surplus
            }
        }

        return (totalPetrol >= totalDistance) ? start : -1;
    }
}
