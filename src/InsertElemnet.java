public class InsertElemnet {
    public static void main(String[] args) {
        int a[] = {10, 15, 25, 56, 21};
        int position = 2;
        int element = 34;
        for (int i = a.length-1; i > position-1; i--)
        {
            a[i] = a[i - 1];
        }
        a[position-1] = element;

        for(int i=0; i<a.length;i++)
        {

            System.out.println(a[i]);
        }

    }










    }

