import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Spliterator;


/***
 *
 *  1. On spliteratorWork( List<Double> lst ):
 * -using Spliterator add to List<Double> sqrts all square roots of items from lst ,if this item greater than 1
 * -use Math.sqrt(number) to find square root : Math.sqrt(4)-> 2.0
 *
 * 2. On print(List<Double> list):
 * -get spliterator() of given list
 * -divide spliterator into 2 parts ( use spliterator.trySplit())
 * -print all items which >=2 from first part (use .println())
 * -print empty string
 * -print all items which >=10 from second part (use .println())
 *
 * *! remember when you use trySplit() method :
 * List<Integer> lst = new ArrayList<>(Arrays.asList(1,1,1,2,2,2,2));
 * Spliterator<Integer> split = lst.spliterator();
 * split.trySplit()...//-> 1 1 1 (its your first path of spliterator)
 * split...//2 2 2 2 (now split contains of second path)
 *
 *
 *
 */

public class Main {


    public static void main(String[] args) {

        List<Double> list = Arrays.asList(4.0,4.0,4.0,100.0,100.0,100.0);
        print(spliteratorWork(list));

    }

    public static List<Double> spliteratorWork(List<Double> lst){

        List<Double> sqrs = new ArrayList<>();
        Spliterator<Double> split = lst.spliterator();
        split.forEachRemaining(i->{
            if(i>1) {
                sqrs.add(Math.sqrt(i));
            }

        });

        return sqrs;
    }
    public static void print(List<Double> list){

        Spliterator<Double> spliterator = list.spliterator();
        spliterator.trySplit().forEachRemaining(i->{

            if(i>=2)
                System.out.println(i);
                });

        System.out.println();

        spliterator.forEachRemaining(i->{
            if(i>=10)
                System.out.println(i);
        });
    }
}
