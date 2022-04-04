import java.util.ArrayList;
import java.util.Arrays;

public class CatRunner {
    public static void main(String[] args) {

        ArrayList<Cat> catList = new ArrayList<Cat>();
        catList.add(new Cat("Patty"));
        catList.add(new Cat("Keith"));
        catList.add(new Cat("Jerry"));
        catList.add(new Cat("Mary"));

        // COMPLETE ME: print each Cat’s name using a
        // standard for loop
        for (int i=0; i< catList.size(); i++)
        {
System.out.println(catList.get(i).getName());
        }
        // COMPLETE ME: print each Cat’s name using an
        // enhanced for loop
        for (Cat cat : catList)
        {
System.out.println(cat.getName());
        }
        Integer[] nums = {1, 2, 3, 4, 5, 6, 7};
        ArrayList<Integer> numList = new ArrayList<Integer>(Arrays.asList(nums));

        //COMPLETE ME!
        for(int i= 1; i< numList.size()-1; i++)
        {
            int current = numList.get(i);
            int next = numList.get(i +1);
            numList.set(i-1,current + next);
        }
        System.out.println(numList);

        System.out.println(numList);

    }
}
