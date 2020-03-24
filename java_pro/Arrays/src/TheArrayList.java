import java.util.ArrayList;
public class TheArrayList
{
    public static void main(String[] args)
    {
        ArrayList<String> names =new ArrayList<>();
        names.add("Peter");
        names.add("james");
        names.add("john");
        names.add("jake");
        names.set(1,"Peters");
        names.remove(0);
        for (int i=0;i<names.size();i++)
        {
            System.out.println(names.get(i));
        }
    }
}
