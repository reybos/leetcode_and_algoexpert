package rey.bos.merge_sorted_array;

public class Solution {

    public void merge(int[] nums1, int m, int[] nums2, int n) {
        if (n == 0) {
            return;
        }
        m--;
        n--;
        if (m < 0) {
            addSecondArrayToFirst(nums1, nums2, n);
            return;
        }
        for (int i = nums1.length - 1; i >= 0; i--) {
            nums1[i] = nums2[n] > nums1[m] ? nums2[n--] : nums1[m--];
            if (n < 0) return;
            if (m < 0) {
                addSecondArrayToFirst(nums1, nums2, n);
                return;
            }
        }
    }

    private void addSecondArrayToFirst(int[] nums1, int[] nums2, int n) {
        if (n + 1 >= 0) System.arraycopy(nums2, 0, nums1, 0, n + 1);
    }

}
