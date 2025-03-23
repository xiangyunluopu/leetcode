package test_2025_3_23;

import java.util.Arrays;

class Solution88 {
    public static void main(String[] args) {
        int[] nums1 = new int[]{4, 4, 9, 0, 0, 0};
        int m = 3;
        int[] nums2 = new int[]{3, 3, 6};
        int n = 3;
        int p = m + n - 1;
        m -= 1;
        n -= 1;
        while (m > -1 && n > -1)
            nums1[p--] = nums1[m] > nums2[n] ? nums1[m--] : nums2[n--];
        while (n > -1) nums1[p--] = nums2[n--];
        System.out.println(Arrays.toString(nums1));
    }
}