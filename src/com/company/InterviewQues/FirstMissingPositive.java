package com.company.InterviewQues;

public class FirstMissingPositive {

    public static void main(String[] args) {
        int[] arr = {3,4,-1,1};
                    //[3,4,-1,1]
        System.out.println(firstMissingPositive(arr,1));
    }
    public static int firstMissingPositive(int[] nums,int missingNmber) {

        for(int i =0;i<=nums.length-1;i++){
            if(missingNmber ==nums[i]){
                missingNmber++;
                i = -1;
            }
        }
        return missingNmber;
    }
}
