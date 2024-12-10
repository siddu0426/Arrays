import java.util.Scanner;

class AddArrayInput
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the array length");
        int length = sc.nextInt();

        int[] arr1 = new int[length];
        int[] arr2 = new int[length];

        System.out.println("Enter the elements in the first array");
        for(int i = 0; i<length; i++)
        {
            arr1[i] = sc.nextInt();
        }

        System.out.println("Enter the elements in the second array");
        for(int i = 0; i<length; i++)
        {
            arr2[i] = sc.nextInt();
        }
        

        int[] result = new int[length];

        for(int i=0; i<arr1.length; i++)
        {
            result[i] = arr1[i] + arr2[i];
        }

        System.out.println("The addition of the arrays is : " );
        for (int i = 0; i < length; i++) {
            System.out.print(result[i] + " ");
        }
    }
}