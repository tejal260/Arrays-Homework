import java.util.Arrays;

public class CommonElement {
    public static void main(String[] args)
    {
        String array1[]={ "rose","lotus","lily", "grapes"};
        String array2[]={ "banana","rose","apple", "grapes"};
        System.out.println( "Araay 1 contain" + Arrays.toString(array1));
        System.out.println( "Araay 2 contain" + Arrays.toString(array2));

        for (int i = 0; i < array1.length; i++) {

            for (int j =0; j< array2.length; j++) {

                if (array1[i].equals(array2[j])){
                    System.out.println( "common element  is"+  " " + array1[i]);

                }

                }

    }

        }
        }