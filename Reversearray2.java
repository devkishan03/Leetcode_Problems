public class Reversearray2 {

    public static int[] reversearr(int arr[], int from, int to) {
        for (int i = from, j = to; i <= (to - from) / 2; i++, j--) {
            int temp = arr[i];
            arr[i] = arr[j];
            arr[j] = temp;
        }
        return arr;
    }

    public static void main(String[] args) {
        int arr[] = { 2, 3, 4, 6, 7, 10, 12, 41, 23, 34, 54 };
        int k = 5;
        int n = arr.length - 1;
        int arr2[] = reversearr(arr, k, n);
        for (int i : arr2) {
            System.out.println(i);
        }
    }
}
