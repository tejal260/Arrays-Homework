import java.util.Scanner;

public class SumofArray {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int add[] = new int[5];
        int sum=0;

        System.out.println("enter element of array");
        for (int i = 0; i < add.length; i++) {

            add[i]=scanner.nextInt();
        }
        System.out.println( "array elements");
        for (int i = 0; i < add.length; i++)
        {
            System.out.println(add[i] + " ");
            sum=add[i]+sum;
        }

        System.out.println( "addition of array is" +  " "+ sum);
        }

}
