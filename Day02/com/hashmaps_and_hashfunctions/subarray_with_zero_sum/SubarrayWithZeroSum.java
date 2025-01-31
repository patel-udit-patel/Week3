package Day02.com.hashmaps_and_hashfunctions.subarray_with_zero_sum;

import java.util.ArrayList;
import java.util.Scanner;

public class SubarrayWithZeroSum {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        FindSubarrays fsz=new FindSubarrays();

        int size=input.nextInt();
        ArrayList<Integer>array=new ArrayList<>(size);
        for (int i = 0; i < size; i++) {
            array.add(i,input.nextInt());
        }

        ArrayList<ArrayList<Integer>>subarraywithZeroSum=new ArrayList<>();
        subarraywithZeroSum=fsz.findSubarraysWithZeroSum(array);

        System.out.println(subarraywithZeroSum);
    }
}
