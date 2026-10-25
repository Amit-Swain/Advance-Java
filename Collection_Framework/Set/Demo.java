import java.util.Collection;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;
import java.util.TreeSet;

public class Demo {
    public static void main(String[] args) {
        // Set<Integer> nums = new HashSet<Integer>();
        // Set<Integer> nums = new TreeSet<Integer>();
        Collection<Integer> nums = new TreeSet<Integer>();
        nums.add(82);
        nums.add(11);
        nums.add(16);
        nums.add(4);
        nums.add(3);
        nums.add(82);

        // System.out.println(nums);
        // for(int n : nums){
        //     System.out.println(n);
        // }

        Iterator<Integer> values = nums.iterator();
        while(values.hasNext())
            System.out.println(values.next());
    }
}
