import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

/**
 *
 * 1.Given a string as "1 2 3 4 5 6 ..." . String[] strings contains of element from given string ("1","2",..).
 * Add all elements from String[] strings to Set<Integer> set.
 * 2.Add all the elements from helpList to set .
 * 3.Using Iterator remove/filter(Stream API)/"method-of-all-collections" all elements greater than 10(>) from set and return modified set.
 *
 * Sample Input:
 *
 * 1 2 3 4 5 6 7 8 9 10 11 12 13 14 15 16 17 18 19 20
 * Sample Output:
 *
 * 1
 * 2
 * 3
 * 4
 * 5
 * 6
 * 7
 * 8
 * 9
 * 10
 *
 */

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String str = reader.readLine();
        //add elements from strings to set
        Set<Integer> set =  Arrays.stream(str.split("\\s")).mapToInt(Integer::valueOf).boxed().collect(Collectors.toSet());
        List<Integer> helpList = getList();
        //add elements from helpList to set
        set.addAll(helpList);
        set = removeAllNumbersMoreThan10(set);
        set.forEach(System.out::println);
    }

    public static Set<Integer> removeAllNumbersMoreThan10(Set<Integer> set){
         set.removeIf(i->i>10);
         return set;
    }
    public static List<Integer> getList(){
        return  Arrays.asList(1,2,3);
    }
}
