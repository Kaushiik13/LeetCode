class Solution {
    public static double findMedianSortedArrays(int[] nums1, int[] nums2) {
        int len1 = nums1.length;
        int len2 = nums2.length;
        int len = len1 + len2;
        int[] nums = new int[len];
        int ct = 0;
        for (int i = 0; i < len1; i++) {
            nums[ct++] = nums1[i];
        }
        for (int j = 0; j < len2; j++) {
            nums[ct++] = nums2[j];
        }
        // Sort the merged array
        for (int i = 0; i < len; i++) {
            for (int j = i + 1; j < len; j++) {
                if (nums[i] > nums[j]) {
                    int temp = nums[i];
                    nums[i] = nums[j];
                    nums[j] = temp;
                }
            }
        }
        // Find the median
        double median;
        if (len % 2 != 0) {
            int middleIndex = len / 2;
            median = nums[middleIndex];
        } else {
            int middleIndex1 = len / 2 - 1;
            int middleIndex2 = len / 2;
            median = (nums[middleIndex1] + nums[middleIndex2]) / 2.0;
        }
        System.out.printf("\nMedian: %.2f\n", median);
        return median;
    }
}
