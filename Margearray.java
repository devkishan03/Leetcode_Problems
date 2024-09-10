public class Margearray {
    public static void merge(int[] nums1, int m, int[] nums2, int n) {

        int i = m - 1;
        int j = n - 1;
        int k = nums1.length - 1;
        if (m == 0 && n > 0) {
            while (j >= 0 && k >= 0) {
                nums1[k--] = nums2[j--];
            }
        } else {
            while (i >= 0 && j >= 0) {
                if (nums1[i] > nums2[j]) {
                    nums1[k--] = nums1[i--];
                } else {
                    nums1[k--] = nums2[j--];
                }
            }
            while (i >= 0 && k >= 0) {
                nums1[k--] = nums1[i--];
            }
            while (j >= 0 && k >= 0) {
                nums1[k--] = nums2[j--];
            }

        }

    }

    public static void main(String[] args) {
        int nums1[] = { 2, 0 };
        int m = 1;
        int nums2[] = { 1 };
        int n = 1;
        merge(nums1, m, nums2, n);

        for (int i : nums1) {
            System.out.println(i);
        }
    }
}
