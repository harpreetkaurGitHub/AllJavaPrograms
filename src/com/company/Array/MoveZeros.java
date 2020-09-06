package com.company.Array;

import java.util.Arrays;

public class MoveZeros {

    public static void main(String[] args) {
        int[] array = {0,1,0,3,12};
        move(array);
    }

    public static void move(int[] nums) {
        boolean flag =false;
        int index =0;
        for(int i =0;i<=nums.length-1;i++) {
                if (nums[i] == 0 || flag) {
                    if(i <nums.length - 1) {
                        nums[i] = nums[i + 1];
                        flag = true;
                    }else{
                        index++;
                        if(index ==nums.length){
                            break;
                        }

                        flag = false;
                        i = -1;
                        nums[nums.length - 1] = 0;
                        continue;
                }
            }
        }
        System.out.println(Arrays.toString(nums));
    }


}
