package com.company.DataStructure.Array;

import java.util.HashSet;
import java.util.Set;

public class ContainsDuplicate {

    public static void main(String[] args) {
        int[] arr = {22,12,13,22,13};
        System.out.println(containsDuplicate(arr));
        System.out.println(containsDuplicateWithoutCollection(arr));
    }
    public static boolean containsDuplicate(int[] nums) {
        Set<Integer> set =  new HashSet<>();
        for(int num:nums){
            if(set.add(num) ==false){
                return true;
            }
        }
    return false;
    }


    public static boolean containsDuplicateWithoutCollection(int[] nums) {
        int index = 0;
        int loop =1;
        for(int i =loop;i<=nums.length-1;i++){
                if(nums[index] ==nums[i]){
                    System.out.println("duplicate number is "+nums[index]);
                }
                if(i ==nums.length-1){
                    i =loop++;
                    index++;
                    continue;
                }
                if(index ==nums.length-1){
                    break;
            }
        }
        return false;
    }
}
//mumm