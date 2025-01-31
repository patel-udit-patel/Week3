package Day02.com.hashmaps_and_hashfunctions.pair_with_given_sum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class FindPairWithGivenSum {
    public HashMap<Integer, ArrayList<Integer>> hasPairs(int[] arr) {
        HashMap<Integer,ArrayList<Integer>> map = new HashMap<>();
        for(int i=0;i<arr.length;i++){
            ArrayList<Integer>indexes=new ArrayList<>(2);
            int sum=0;
            for(int j=0;j<arr.length;j++){
                if(i==j)
                    continue;
                sum=sum+arr[j];
                indexes.add(i);
                indexes.add(j);

                map.put(sum, indexes);
            }

        }

        return map;
    }
    public boolean hasPairWithSum(int[]arr,int target){
        HashMap<Integer,ArrayList<Integer>>map=hasPairs(arr);

        for (Map.Entry<Integer,ArrayList<Integer>> entry : map.entrySet()) {
                if(entry.getKey()==target){
                    return true;
                }

        }
        return false;
    }
}