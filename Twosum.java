package Easy;

public class Twosum {

    public int[] twoSum(int[] nums, int target) {
        int t = target;
        int output[] = new int[2];
        for (int i = 0; i < nums.length; i++) {
            for (int j = i + 1; j < nums.length; j++) {
                int n = nums[i] + nums[j];
                if (n == t) {
                    output[0] = i;
                    output[1] = j;
                    return output;
                }
            }
        }
        return output;
    }

    public static void main(String[] args) {
        int sum[] = { 3, 2, 4 };
        int t = 6;
        Twosum t1 = new Twosum();
        int result[] = t1.twoSum(sum, t);
        System.out.println(result[0] + " " + result[1]);
    }
}
