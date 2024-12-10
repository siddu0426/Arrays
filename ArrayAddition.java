import java.util.Arrays;

public class ArrayAddition {
    public static void main(String[] args) {
        int[] array1 = {1, 2, 3, 4, 5};
        int[] array2 = {6, 7, 8, 9, 10};

        // Make sure both arrays have the same length
        if (array1.length != array2.length) {
            System.out.println("Arrays must have the same length for addition.");
            return;
        }

        int[] result = new int[array1.length];

        // Add corresponding elements
        for (int i = 0; i < array1.length; i++) {
            result[i] = array1[i] + array2[i];
        }

        System.out.println("Resultant array after addition: " + Arrays.toString(result));   //new method of adding arrays in java

       /*  for(int i=0 ; i<arr1.length ; i++)             //Traditional method of adding two arrays
        {
            System.out.print(result[i] +" ");
        }  */
    }
}
