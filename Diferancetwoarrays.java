public class Diferancetwoarrays {

    public static int[] unsortedDiffrence(int arr1[], int arr2[]) {
        int newarr[] = new int[arr1.length];
        int i = 0, k = 0;
        boolean flag = true;
        for (; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                newarr[k++] = arr1[i];
            }
            flag = true;
        }
        return newarr;
    }

    public static int[] sortedDiffrence(int arr1[], int arr2[]) {
        int newarr[] = new int[arr1.length];
        int i = 0, k = 0;
        boolean flag = false;
        for (; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr2[j] >= arr1[i]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                newarr[k++] = arr1[i];
            }
            flag = true;
        }
        return newarr;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int b[] = { 2, 6, 7, 8, 9 };
        int c[] = unsortedDiffrence(a, b);
        for (int i : c) {
            System.out.println(i);
        }
    }
}
