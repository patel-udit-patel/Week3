package Day02.com.hashmaps_and_hashfunctions.pair_with_given_sum;
import java.util.Scanner;

public class PairWithGivenSum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        FindPairWithGivenSum fswgs=new FindPairWithGivenSum();

        System.out.println("Enter the size of list of numbers");
        int size=input.nextInt();
        int []arr=new int[size];

        System.out.println("Enter the list of numbers ");
        for(int i=0;i<size;i++){
            arr[i]=input.nextInt();
        }
        System.out.println("Enter the target Sum ");
        int target=input.nextInt();
        System.out.println(fswgs.hasPairWithSum(arr,target));
    }
}
