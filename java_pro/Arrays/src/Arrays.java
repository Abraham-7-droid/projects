public class Arrays
{
    public static void main(String[] args)
    {
        int [] numbers =new int[10];
        numbers[0]=10;
        numbers[1]=15;
        numbers[2]=20;
        numbers[3]=25;

        int [] numbers2={2,3,4,5};

        for (int i=0;i<numbers.length;i++)
        {
            System.out.println(numbers[i]);
        }
        //enhanceed for loop
        for (int val:numbers2)
        {

            System.out.println(val);
        }
    }
}
