import java.util.Scanner;

public class SearchElement {
    public static void main(String[] args) {
        int a[]=  new int [5];
        int n;
        int count=0;
        Scanner scanner =  new Scanner(System.in);
        System.out.println("enter elements in array");
        for (int i = 0; i < a.length; i++) {
            a[i]= scanner.nextInt();
        }
        System.out.println( "array elements");
        for (int i = 0; i < a.length; i++) {
            System.out.println(a[i]);
        }
        System.out.println( "enter search element");
        n =scanner.nextInt();
        for (int i = 0; i < a.length; i++) {
            if (a[i] == n) {
                count++;
            }
        }
          if(count>0)
              System.out.println( "element found");
              else
              System.out.println( "element not found");


        }


    }


