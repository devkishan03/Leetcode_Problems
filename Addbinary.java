public class Addbinary {
    public static String addBinary(String a, String b) {
        int num1 = Integer.parseInt(a, 2);
        int num2 = Integer.parseInt(b, 2);
        String str = Integer.toBinaryString(num1 + num2);
        return str;
    }

    public static void main(String[] args) {
        String s1 = "1100";
        String s2 = "0011";
        System.out.println(addBinary(s1, s2));
    }

}
