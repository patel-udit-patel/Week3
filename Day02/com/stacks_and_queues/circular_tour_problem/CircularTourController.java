package Day02.com.stacks_and_queues.circular_tour_problem;

public class CircularTourController {
    public static void main(String[] args) {
        CircularTour circularTour=new CircularTour();

        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};

        int startIndex =circularTour. findStartingPoint(petrol, distance);
        System.out.println(startIndex);
    }
}
