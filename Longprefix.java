package Easy;

import java.util.Arrays;

public class Longprefix {
    public String longestCommonPrefix(String[] strs) {
        StringBuilder sb = new StringBuilder();
        boolean flag = false;
        if (strs.length < 2) {
            return strs[0];
        } else {
            Arrays.sort(strs);
            for (int i = 0; i < strs[0].length(); i++) {
                for (int j = 1; j < strs.length; j++) {
                    if (strs[0].charAt(i) == strs[j].charAt(i)) {
                        flag = true;
                    } else
                        return sb.toString();
                }
                if (flag) {
                    sb.append(strs[0].charAt(i));
                }
            }
            return sb.toString();
        }

    }

    public static void main(String[] args) {
        String str[] = { "flower", "flow", "flight" };
        Longprefix l = new Longprefix();
        String s = l.longestCommonPrefix(str);
        System.out.println(s);
    }
}