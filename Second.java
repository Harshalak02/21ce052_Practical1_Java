
package Practical1;

import java.util.Scanner;

public class Second {
    static String convert(String s) {
        char[] ch = s.toCharArray();
        char[] sh = new char[2];
        int i = 0;
        if (ch[0] == 'o') {
            sh[i] = ch[0];
            i++;
        }
        if (ch[1] == 'z') {
            sh[i] = ch[1];
        }

        String str = String.valueOf(sh);
        return str;
    }

    public static void main(String[] args) {

        String s;
        Scanner sc = new Scanner(System.in);
        s = sc.next();

        System.out.print(convert(s));

    }
}
