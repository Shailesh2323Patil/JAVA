package Collections.Set;


import java.util.TreeSet;

public class Comparator
{
    public static void main(String[] args)
    {
        TreeSet set = new TreeSet(new MyComparator());
        set.add("A");
        set.add("B");
        set.add("E");
        set.add("F");
        set.add("G");
        set.add("C");
        set.add("D");
        
        System.out.println(set);
    }
}
