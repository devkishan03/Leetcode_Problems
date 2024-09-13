public class Intersectiontwoarrays {

    public static int[] unsortedIntersect(int arr1[], int arr2[]) {
        int newarr[] = new int[arr1.length];
        int i = 0, k = 0;
        for (; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] == arr2[j]) {
                    newarr[k++] = arr1[i];
                    break;
                }
            }

        }
        return newarr;
    }

    public static int[] sortedIntersect(int arr1[], int arr2[]) {
        int newarr[] = new int[arr1.length];
        int i = 0, k = 0;
        for (; i < arr1.length; i++) {
            for (int j = 0; j < arr2.length; j++) {
                if (arr1[i] < arr2[j]) {
                    break;
                } else if (arr1[i] == arr2[j]) {
                    newarr[k++] = arr1[i];
                    break;
                }
            }
        }
        return newarr;
    }

    public static void main(String[] args) {
        int a[] = { 1, 2, 3, 4, 5, 6 };
        int b[] = { 2, 6, 7, 8, 9 };
        int c[] = unsortedIntersect(a, b);
        for (int i : c) {
            System.out.println(i);
        }
    }
}
