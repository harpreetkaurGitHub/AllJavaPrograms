package com.company.Collectionss.ArrayListss.All;

public class StringsEqual {

    public static int minimumMoves(String[] arr){
        int length = arr.length;
        int result = Integer.MAX_VALUE;
        for (int i=0;i<length;i++){
            int count=0;
            String temp="";

            for (int j=0;j<length;j++){
                temp = arr[j] + arr[j];
                int index = temp.indexOf(arr[i]);

                if (index == arr[i].length()){
                    return -1;
                }
                count += index;
            }
            result = Math.min(count,result);
        }
        return result;
    }

    public static void main(String[] args) {

        String[] arr = {"xzzwo", "zwoxz","zzwox", "xzzwo"};
        System.out.println(minimumMoves(arr));
    }
}
