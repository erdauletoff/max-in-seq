package com.epam.rd.autotasks.sequence;
import java.util.Scanner;

public class FindMaxInSeq {
    public static int max() {
        Scanner scr = new Scanner(System.in);
        String[] seq = scr.nextLine().trim().split(" ");
        int[] nums = new int[seq.length - 1];

        for (int i = 0; i < seq.length - 1; i++) {
            nums[i] = Integer.parseInt(seq[i]);
        }

        int res = nums[0];

        for (int num: nums) {
            res = Math.max(res, num);
        }

        return res;
    }

    public static void main(String[] args) {

        System.out.println("Test your code here!\n");

        // Get a result of your code

        System.out.println(max());
    }
}
