import java.util.Arrays;

public class SortStringandNumberarray {

    public static void main(String[] args) {
        int a[] = {12, 9, 79, 2, 36, 45};

        String b[]= {"james","ahmed","sakina","pegah","charles"};

        System.out.println(  "original data " + Arrays.toString(a));
        Arrays.sort(a);
        System.out.println( "sorted data1" + Arrays.toString(a));

        System.out.println( "original data"+ Arrays.toString(b));
        Arrays.sort(b);
        System.out.println( "sorted data2"+ Arrays.toString(b));


    }
}