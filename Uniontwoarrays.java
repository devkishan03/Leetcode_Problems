public class Uniontwoarrays {

    public static int[] unsortedUnion(int arr1[], int arr2[]) {
        int newarr[] = new int[arr1.length + arr2.length];
        boolean flag = true;
        int k = 0;
        for (int i = 0; i < arr1.length; i++) {
            newarr[k++] = arr1[i];
        }
        int i = 0;
        for (; i < arr2.length; i++) {
            for (int j = 0; j < arr1.length; j++) {
                if (arr2[i] == arr1[j]) {
                    flag = false;
                    break;
                }
            }
            if (flag) {
                newarr[k++] = arr2[i];
            }
            flag = true;
        }

        return newarr;
    }

    public static int[] sortedUnion(int arr1[], int arr2[]) {
        int newarr[] = new int[arr1.length + arr2.length];
        int i = 0, j = 0, k = 0;
        while (i < arr1.length && j < arr2.length) {
            if (arr1[i] > arr2[j]) {
                newarr[k++] = arr2[j++];
            } else if (arr1[i] < arr2[j]) {
                newarr[k++] = arr1[i++];
            } else {
                newarr[k++] = arr1[i++];
                j++;
            }

        }
        while (i < arr1.length) {
            if (arr1[i] > newarr[k - 1]) {
                newarr[k++] = arr1[i++];
            } else {
                i++;
            }

        }
        while (j < arr2.length) {
            if (arr2[j] > newarr[k - 1]) {
                newarr[k++] = arr2[j++];
            } else {
                j++;
            }
        }

        return newarr;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int b[] = { 2, 6, 6, 7, 8, 9, 10, 11 };
        int c[] = unsortedUnion(a, b);
        for (int i : c) {
            System.out.println(i);
        }
    }
}