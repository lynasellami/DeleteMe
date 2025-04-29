package org.example;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int[] nums = {3, 1, 5, 2, 1, 4};
        insertionSort(nums);

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

    public static void selectionSort(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < nums.length; j++) {
                if (nums[j] < nums[minIdx]) {
                    minIdx = j;
                }

            }
            int temp = nums[i];
            nums[i] = nums[minIdx];
            nums[minIdx] = temp;
        }
    }

    public static void insertionSort(int[] nums) {
        for (int i = 1; i < nums.length; i++) {
            int key = nums[i];
            int j = i = 1;
            while (j >= 0 && nums[j] > key) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = key;
        }
    }
}
