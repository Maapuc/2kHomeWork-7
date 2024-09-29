import java.util.*;

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
            var strings = List.of("один", "два", "два", "три", "три", "три");
            var set = new HashSet<>(strings);
            for (String s : set) {
                System.out.println(s);
            }
        }
        System.out.println();
        System.out.println();
        {
            List<String> strings = new ArrayList<>(List.of("один", "два", "два", "три", "три", "три"));
            Map<String, Integer> map = new HashMap<>();
            for (String numbers : strings) {
                var num = map.get(numbers);
                if (num == null) {
                    map.put(numbers, 1);
                } else {
                    map.put(numbers, num + 1);
                }
            }
            for (Integer value : map.values()) {
                System.out.println(value);
            }
        }

    }


}