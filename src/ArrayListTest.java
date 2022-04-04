import java.util.ArrayList;

public class ArrayListTest
{
    public static void main(String[] args)
    {
        ArrayList<String> names = new ArrayList<String>();
        names.add("Jamal");
        names.add("Emily");
        names.add("Destiny");
        names.add("Mateo");

        //COMPLETE ME: print each name using an index based for loop
        for (int i = 0; i < name.size(); i++)
        {
System.out.println(names.get(i));
        }
        //COMPLETE ME: print each name (again!) using enhanced for loop
        for (String name : names
        {
System.out.println(name);
        }
        //COMPLETE ME: print each name (a third time!) using a while loop
        int i = 0;
        while (i<names.size())
                {
System.out.println(names.get(i));
i++;
                }
        ArrayList<Integer> ints = new ArrayList<Integer>();
        ints.add(0, 1);
        ints.add(0, 2);
        ints.add(0, 3);
        ints.add(0, 4);
        ints.add(0, 5);
        ints.add(0, 6);

        ArrayList<Integer> newInts = new ArrayList<Integer>();

        // traverse the entire ints array backwards
        for (int i = ints.size(); i >= 0; i--)
        {
            newInts.add(ints.get(i));
        }

        System.out.println(ints);
        System.out.println(newInts);

    }
}
