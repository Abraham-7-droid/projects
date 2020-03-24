public class HighestAndLowest
{
    public static void main(String[] args)
    {
        int [] numbers = {2,6,120,12,15,17,1};
        int highest=numbers[0];
        //int temp;
        for (int i=1;i<numbers.length;i++) {
            if (numbers[i] > highest) {
                highest = numbers[i];
            }
        }
            System.out.println("The highest no is: "+highest);
            int lowest=numbers[0];
            for ( int i=1;i<numbers.length;i++)
            {
                if (numbers[i]<lowest)
                {
                    lowest=numbers[i];
                }
            }
            System.out.println("The lowest no is: "+lowest);



    }
}
