package Practical1;

import java.util.Scanner;

public class sixth {
    // static String New(String , String );

    static String New(String s, char a) {
        char[] ch = s.toCharArray();
        char[] sh = new char[s.length()];
        int t = 0;
        for (int i = 0; i < s.length(); i++) {
            if (ch[i] != a) {
                sh[t] = ch[i];
                t++;
            }
        }
        String str = String.valueOf(sh);
        return str;

    }

    public static void main(String[] args) {
        String s;
        char t;
        Scanner sc = new Scanner(System.in);
        s = sc.next();
        t = sc.next().charAt(0);
        System.out.println(New(s, t));
    }
}
