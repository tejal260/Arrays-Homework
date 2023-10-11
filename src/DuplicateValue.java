public class DuplicateValue {
    public static void main(String[] args) {

        int array[] =  {4, 6, 4, 3, 10};
        System.out.println("duplicate element in given array is:");

        for (int i = 0; i < array.length; i++) {
            for (int j = i+1; j< array.length; j++) {
                if (array[i] == array[j]) {
                    System.out.println(array[j]);
                }
            }
        }
    }
    }

