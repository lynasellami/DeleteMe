package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = {3, 1, 5, 2, 1, 4};
        bubbleSort(nums);

        System.out.println(Arrays.toString(nums));

        int num1 = 1;
        int num2 = 2;


    }

    public static void bubbleSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            for (int j = 0; j < nums.length - 1 - i; j++) {
                if (nums[j] > nums[j + 1]) {
                    int temp = nums[j];
                    nums[j] = nums[j + 1];
                    nums[j + 1] = temp;
                }
            }
        }

    }
}