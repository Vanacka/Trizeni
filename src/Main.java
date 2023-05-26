import java.io.PrintStream;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        int[] arr = new int[100];

        Scanner sc = new Scanner(System.in);

        for (;;) {
            int vstup = sc.nextInt();
            if (vstup == 0) {
                break;
            }
            for (int i = 0; arr[i] != 0; i++) {
                if (arr[i] <= vstup) {
                    continue;
                }
                else {
                    arr[i] = vstup;
                    break;
                }
            }
        }
        for (int i : arr) {
            System.out.println(i);
        }
    }
}