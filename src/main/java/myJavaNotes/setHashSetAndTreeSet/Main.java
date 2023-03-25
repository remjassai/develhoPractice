package myJavaNotes.setHashSetAndTreeSet;
import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;


public class Main {
    public static void main(String[] args) {
        //Set demonstration using HashSet
        Set<Integer> hashSet = new HashSet<>();
        hashSet.add(5);
        hashSet.add(4);
        hashSet.add(3);
        hashSet.add(1);
        hashSet.add(3);
        hashSet.add(3);
        hashSet.add(2);


        for (Integer integer : hashSet) {
            System.out.println(integer + "");
        }

        System.out.println();

        System.out.println("The HashSet is empty: "+hashSet.isEmpty());
        System.out.println("It has a size of: "+hashSet.size()+" elements.");
        System.out.println("And it contains number 5: "+hashSet.contains(5));
        hashSet.remove(5);
        System.out.println("We have removed the 5 so it now contains just : " + hashSet);

        System.out.println();

        Set<Integer> treeSet = new TreeSet<>();
        treeSet.add(55);
        treeSet.add(44);
        treeSet.add(1);
        treeSet.add(33);
        treeSet.add(33);
        treeSet.add(22);
        treeSet.add(11);

        for (Integer integer : treeSet) {
            System.out.println(integer + "");
        }




    }
}

/*
* Set: Interface
* HashSet: Implementation
* TreeSet: Implementation [sorted by natural order]
*
* Properties:
*    1. Unordered Collection
*    2. Cannot store duplicate elements
*    3. It has more implementations such as HashSet, TreeHashSet and TreeSet
*
*  TreeSet contains elements in Sorted Order
 */
