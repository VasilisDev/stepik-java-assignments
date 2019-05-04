
/****
 * On static List<String> changeList(List<String> list) method you must do:
 *
 * 1.find the longest string in list
 *  -if you use method max of class Collections : don't forget to implement a comparator for this method
 *    Collections.max(list, (s1,s2)->{...})
 *    by default, this method compares strings alphabetically!
 * -of course you can use other approaches(for example comparison in a for-loop)
 * 2.replace all list items with this row
 * 3.return modified list
 *
 * Sample Input:
 *
 * hi hello goodmorning ask
 * Sample Output:
 *
 * goodmorning
 * goodmorning
 * goodmorning
 * goodmorning
 *
 */


 static List<String> changeList(List<String> list){

         List<String> list = Arrays.asList("hi","hello", "goodmorning","ask");
         String max = Collections.max(list, Comparator.comparing(String::length));
         Collections.fill(list, max);
         list.forEach(System.out::println);
         return list;

 }
