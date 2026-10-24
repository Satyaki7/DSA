//71a

import java.util.ArrayList;
import java.util.Scanner;

public class WayTooLongWord {

    public static String large_word(String a) {
        int l = a.length();
        if (l > 10)
            return (a.charAt(0) + "" + (l - 2) + "" + a.charAt(l - 1));
        else
            return a;

    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<String> h= new ArrayList<>();
        for (int i = 0; i < n; i++) {
            h.add(large_word(sc.next()));
        }
        h.forEach(System.out::println);
        sc.close();
    }
}
