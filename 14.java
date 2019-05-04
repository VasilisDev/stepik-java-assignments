import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/***
 *
 * Using BufferedReader read one string with numbers written across the space ("1 2 3 4 5 ...").
 *
 * Put this numbers to any Collection of Integers.Sort this collection!
 *
 * Using Iterator remove all even annoying numbers(death for elem%2=0 !) from your Collection
 *
 * Print all remaining elements to console (use System.out.println() method)
 *
 * Sample Input:
 *
 * 1 2 3 4 5 6 7 8 9 10
 * Sample Output:
 *
 * 1
 * 3
 * 5
 * 7
 * 9
 */

public class Main {

    public static void main(String[] args) throws IOException {

            BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));

            List<Integer> list = Stream.of(reader.readLine().split(" "))
                    .map(Integer::valueOf).sorted(Comparator.naturalOrder()).collect(Collectors.toList());

        Iterator<Integer> iterator = list.iterator();

        while(iterator.hasNext()){
            if(iterator.next()%2==0){
                iterator.remove();
            }
        }
        list.forEach(System.out::println);
     }
  }
