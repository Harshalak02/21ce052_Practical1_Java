package Practical1;

import java.util.Scanner;

public class fifth {
    static int NumRepeat(String s, String t) {
        char[] ch = s.toCharArray();
        char[] sh = t.toCharArray();
        int count = 0;
        for (int i = 0; i < s.length(); i++) {

            for (int j = 0; j < t.length(); j++) {

                if (s.length() >= t.length()) {
                    if (i < t.length() - 1) {
                        if (ch[i] == sh[j] && ch[i + 1] == sh[j + 1]) {
                            count++;
                        }
                    }
                } else {
                    if (j < s.length() - 1) {
                        if (ch[i] == sh[j] && ch[i + 1] == sh[j + 1]) {
                            count++;
                        }
                    }
                }
            }
        }
        // System.out.println(count);
        return count;
    }

    public static void main(String[] args) {
        String s, t;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        t = sc.next();
        int l = NumRepeat(s, t);
        System.out.println(l);

    }
}
