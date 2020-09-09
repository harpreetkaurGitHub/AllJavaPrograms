package com.company.InterviewQues;

import java.sql.SQLOutput;
import java.util.Arrays;

public class ProductExceptSelf {

    public static void main(String[] args) {
    int[] arr = {1,2,3,4};
        System.out.println(Arrays.toString(productExceptSelf(arr)));
        //Input:  [1,2,3,4]
        //Output: [24,12,8,6]
    }
    public static int[] productExceptSelf(int[] nums) {
        int index = 0;
        int[] array = new int[nums.length];
        int sum =1;

        for(int i =0;i<=nums.length-1;i++){

           if(i!=index){              //if iteration is not eual to index then multiply
                sum = sum*nums[i];
            }
            if(i ==nums.length-1){    //when loop last iteration then restart loop from 0 with next index
                array[index] = sum;
                sum = 1;
                i = -1;
                index++;
            }
            if(index >=nums.length){
                break;
            }

        }
        return array;

    }
}
