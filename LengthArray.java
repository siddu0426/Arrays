class LengthArray
{
    public static void main(int N)
    {
        Scanner sc = new Scanner(Sytem.in);
        System.out.println("Enter n value");
        int n = sc.nextInt();
        int arr[] = {1,2,3,4,5}; 
        length(0,n-1);
    }
    public static int length(l,r)
    {
        if(l>=r)return;

        swap(arr[l],arr[r]);
        length(l+1,r-1);
        return swap;
    }
}