package com.company;

public class Task9 {
    public static int sumOfCubes(int[] nums){
        int sum = 0;
        for(int i = 0; i < nums.length; i++){
            sum = sum + (int)Math.pow(nums[i], 3);
        }
        return sum;
    }
}
