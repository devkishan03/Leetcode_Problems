package Easy;

public class Roman {
    public int getval(char s) {
        switch (s) {
            case 'I':
                return 1;
            case 'V':
                return 5;
            case 'X':
                return 10;
            case 'L':
                return 50;
            case 'C':
                return 100;
            case 'D':
                return 500;
            case 'M':
                return 1000;
            default:
                return 0;
        }

    }

    public int romanToInt(String s) {

        int sum = 0;
        if (s.length() == 1) {
            sum = getval(s.charAt(0));
        } else

            for (int i = 0; i < s.length(); i++) {
                int val1 = getval(s.charAt(i));
                if (i + 1 < s.length() && (val1 < getval(s.charAt(i + 1)))) {
                    sum += -val1;
                } else
                    sum += +val1;
            }
        return sum;
    }

    public static void main(String[] args) {
        Roman s = new Roman();
        int a = s.romanToInt("III");
        System.out.println(a);
    }

}
