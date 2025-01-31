package Day02.com.hashmaps_and_hashfunctions.subarray_with_zero_sum;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

//class FindSubarrays is created to implement subarray with zero sum
public class FindSubarrays {

    //Method returns all pairs of subarray and their sums
    Map<ArrayList<Integer>,Integer>findSubarrays(ArrayList<Integer>numbers){
        Map<ArrayList<Integer>,Integer>map=new HashMap<>();
        int sum;
        //Iterating through arraylist
        for (int i=0;i<numbers.size();i++) {
            sum=0;
            for(int j=i;j<numbers.size();j++){
                ArrayList<Integer> indices = new ArrayList<>(2);
               sum=sum+numbers.get(j);
               indices.add(i);
               indices.add(j);
               map.put(indices,sum);
            }
        }
        //return map of all pairs and sum of subarray
        return map ;
    }

    //Method checks Subarray with zero sum and return an array of subarray
    public ArrayList<ArrayList<Integer>>findSubarraysWithZeroSum(ArrayList<Integer>numbers){
        ArrayList<ArrayList<Integer>>subarrays=new ArrayList<>();
        Map<ArrayList<Integer>,Integer>map=findSubarrays(numbers);
        for (Map.Entry<ArrayList<Integer>,Integer> entry : map.entrySet()) {
            if(entry.getValue()==0) {
                ArrayList<Integer>subArray=new ArrayList<>();
                for (int i = entry.getKey().get(0); i <= entry.getKey().get(1); i++) {
                    subArray.add(numbers.get(i));
                }
                subarrays.add(subArray);
            }
        }
        return subarrays;
    }
}
