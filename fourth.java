package Practical1;

import java.util.Scanner;

public class fourth {
    static boolean convert(int[] sh, int s) {
        int count = 0;
        for (int i = 0; i < s; i++) {
            if (sh[i] == 1 && sh[i + 1] == 2 && sh[i + 2] == 3) {
                count = 1;
                break;
            }

        }
        if (count == 1)
            return true;
        else
            return false;
    }

    public static void main(String[] args) {
        int s;
        Scanner sc = new Scanner(System.in);
        s = sc.nextInt();
        int[] sh = new int[s];
        for (int i = 0; i < s; i++) {
            sh[i] = sc.nextInt();
        }
        boolean k = convert(sh, s);
        System.out.print(k);
    }
}
