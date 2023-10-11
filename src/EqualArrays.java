

import java.util.Arrays;

public class EqualArrays {
    public static void main(String[] args) {
        int a[] = {2, 4, 6, 8, 10};
        int b[] = {2, 4, 6, 8, 10};

        if(Arrays.equals(a,b)) {

            System.out.println("both arrays are equal");
        }
       else {
            System.out.println("both arrays are not equal");
       }
    }
}