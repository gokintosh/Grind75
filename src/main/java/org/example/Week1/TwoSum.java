package org.example.Week1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSum {


    public static void main(String[] args) {

        int[] nums={2,7,11,15};

        int target=9;

        int[] result=twoSum(nums,target);

        System.out.printf(Arrays.toString(result));

    }


    public static int[] twoSum(int[] nums,int target){

        int delta;

        Map<Integer,Integer> resultMap=new HashMap<>();

        for(int i=0;i<nums.length;i++){

            delta=target-nums[i];

            if(!resultMap.containsKey(delta)){
                resultMap.put(nums[i],i);
            }else {
                return new int[]{resultMap.get(delta),i};
            }
        }

        return new int[]{0,0};

    }
}
