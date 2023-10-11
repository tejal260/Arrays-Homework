import java.util.Scanner;

public class FindIndex {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int a[] = {14, 20, 36, 46, 90, 29};

        System.out.println("enter the element in array");

        int b = scanner.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (b == a[i]) {
                System.out.println(b + " " + "index" + " " + i);
            }

        }
    }
}





