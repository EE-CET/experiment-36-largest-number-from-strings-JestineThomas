import java.util.Scanner;
import java.util.Arrays;
import java.util.Comparator;

public class LargestNumber {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        String[] arr = new String[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.next();
        }

        Arrays.sort(arr, new Comparator<String>() {
            public int compare(String str1, String str2) {
                return (str2 + str1).compareTo(str1 + str2);
            }
        });

        if (arr[0].equals("0")) {
            System.out.println("0");
            return;
        }

        String result = "";
        for (String s : arr) {
            result += s;
        }

        System.out.println(result);

        sc.close();
    }
}
