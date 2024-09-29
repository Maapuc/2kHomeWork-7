import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        {
            List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
            for (Integer num : nums) {
                if (num % 2 == 1) {
                    System.out.println(num);
                }
            }
        }
        System.out.println();
        System.out.println();
        {
            List<Integer> nums = new ArrayList<>(List.of(1, 1, 2, 3, 4, 4, 5, 5, 6, 7));
            Set<Integer> set = new TreeSet<>(nums);
            for (Integer i : set) {
                if (i % 2 == 0) {
                    System.out.println(i);
                }
            }
        }
        System.out.println();
        System.out.println();
        {


        }
    }
}