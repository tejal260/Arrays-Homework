public class SpecificValue {

    public static void main(String[] args) {
        int a[] = {25, 15, 43, 56, 97};

        int find = 56;

        for (int i = 0; i < a.length; i++) {

            if (find == a[i])
            {
                System.out.println("value found at:" + " " + i);
            }
            else{
                System.out.println("value not found");
            }
        }
    }
}
