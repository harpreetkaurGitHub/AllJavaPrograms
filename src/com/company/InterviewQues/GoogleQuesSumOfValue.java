package com.company.InterviewQues;

public class GoogleQuesSumOfValue {

    public static void main(String[] args) {

        int[] arr = {3,2,3,14};

        for(int i: twoSum(arr,6 )){
            System.out.println(i);
        }
    }
    public static int[] twoSum(int[] nums, int target) {

        int low = 0;
        int high = nums.length-1;

        while(low<high){


            int sum =nums[low]+nums[high];
            if(sum==target){
                int[] arr= {low,high};
                return arr;
            }
            high=high-1;
            if(low ==high){
                low = low+1;
                high = nums.length-1;
            }

        }

        return new int[2];

    }
}
