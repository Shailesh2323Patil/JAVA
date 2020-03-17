package Collections.Set;

class MyComparator implements java.util.Comparator
{
    @Override
    public int compare(Object obj1, Object obj2)
    {
        String S1 = (String) obj1;
        String S2 = (String) obj2;

        return -S1.compareTo(S2);
    }
}