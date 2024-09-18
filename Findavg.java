public class Findavg {
    public static String getHighName(String str[]) {
        String names[] = new String[str.length];
        int marks[] = new int[str.length];
        for (int i = 0; i < str.length; i++) {
            names[i] = str[i].substring(0, str[i].indexOf(":"));
            marks[i] = Integer.parseInt(str[i].substring(str[i].indexOf(":") + 2));
            // System.out.println(names[i] + " " + marks[i]);
        }
        int index = 0;
        int sum = 0;
        for (int i = 0; i < names.length; i++) {
            for (int j = i + 1; j < names.length; j++) {
                if (names[i].equalsIgnoreCase(names[j])) {
                    sum = (marks[i] + marks[j]) / 2;
                    marks[i] = sum;
                    marks[j] = 0;
                }
            }
        }
        for (int i = 1; i < marks.length; i++) {
            if (marks[index] < marks[i]) {
                index = i;
            }
        }
        return names[index];
    }

    public static void main(String[] args) {
        String str[] = { "kishan: 10", "lopa: 18", "Udd: 7", "kishan: 8" };
        System.out.println(getHighName(str));

    }
}
