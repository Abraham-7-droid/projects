public class SumAndAverage
{
    public static void main(String[] args)
    {
        int [] numbers={2,4,5,6,8,9,6};
        int sum=0;
        for (int i=0;i<numbers.length;i++)
        {
            sum =sum+numbers[i];
        }
        System.out.println("The sum is: "+sum);
        double average= (double)sum/numbers.length;
        System.out.println("The average is: "+average);
    }
}
