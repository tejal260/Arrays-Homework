import java.util.Arrays;

public class SortThevalue {
    public static void main(String[] args) {
        int a[]= {25,55,89,7,46};
        System.out.println( "Araay  contains" + Arrays.toString(a));

        Arrays.sort(a);

        System.out.println( "ascending order of given array is "+ Arrays.toString(a));
    }
}
