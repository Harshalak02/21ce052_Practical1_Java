package Practical1;

import java.util.Scanner;

public class third {
    static boolean convert(int s, int h) {
        int a, b;
        a = s % 10;
        b = h % 10;
        if (a == b)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int s, h;
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        h = sc.nextInt();
        boolean l = convert(s, h);
        System.out.print(l);
        // System.out.print(s[2]);

    }
}
