import java.util.Scanner;
class printN
{
    public static void main(String[] args)
    {
       Scanner a = new Scanner(System.in);
       System.out.println("Enter n value");
       int N = a.nextInt();
    
       
       int result = Fact(N);
       System.out.print(result+" ");
    }


    
  
    public static int Fact(int N)
    {
        if(N == 0 || N == 1)
        {
            return 1;
        }
        

        return N * Fact(N - 1);
    }
}


