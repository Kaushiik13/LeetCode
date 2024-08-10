class Solution {
  public void merge(int[] nums1, int m, int[] nums2, int n) {
        int ct = m;
         for (int j = 0; j < n; j++)
          {
            nums1[ct++] = nums2[j];
        }
         for (int i = 0; i < m + n; i++) {
          for (int j = i + 1; j < m + n; j++) {
                if (nums1[i] > nums1[j]) {
                    int temp = nums1[i];
                    nums1[i] = nums1[j];
                    nums1[j] = temp;
                }
            }
        }
    }
}
