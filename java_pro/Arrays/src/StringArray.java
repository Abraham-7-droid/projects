public class StringArray
{
    public static void main(String[] args)
    {
        String [] names=getNames();
        for (int i=0;i<names.length;i++)
        {
            System.out.println(names[i]);
        }
    }
    public static String [] getNames()
    {
        String [] names=new String[5];
        names[0]="Aby";
        names[1]="Aju";
        names[2]="Joel";
        names[3]="Rahul";
        names[4]="John";

        return  names;

    }
}
