import java.io.IOException;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;
import java.util.function.Predicate;
import java.util.stream.Collectors;


/**
 *
 * 1.Find Symmetrical difference of sets.
 * ﻿* For example ﻿sets:{1 2 3 4} {3 4 5 6} --> Symmetrical difference = ﻿{1 2 5 6}
 * ﻿
 * Sample Input:
 *
 * 3 14 16 5 13 2 20 10 6 9;2 4 6 8 10 12 14 16 18 20
 * Sample Output:
 *
 * 3
 * 4
 * 5
 * 8
 * 9
 * 12
 * 13
 * 18
 *
 */

public class Main {

    public static void main(String[] args) throws IOException {

        Set<Integer> set1 = new HashSet<>(Arrays.asList(1,2,3,4));
        Set<Integer> set2 = new HashSet<>(Arrays.asList(3,4,5,6));


        Set<Integer> notInSet2 = set1.stream().filter(t -> set2.stream().noneMatch(Predicate.isEqual(t))).collect(Collectors.toSet());
        Set<Integer> notInSet1 = set2.stream().filter(t -> set1.stream().noneMatch(Predicate.isEqual(t))).collect(Collectors.toSet());

        Set<Integer> finalSet = new HashSet<>(notInSet2);
        finalSet.addAll(notInSet1);
        finalSet.forEach(System.out::println);
    }
}
