/***
 *Write a method for calculating the sum of odd numbers in the given interval (inclusively) using Stream API.
 *
 * Important. Use the provided template for your method. Pay attention to type of an argument and the returned value. Please, don't use cycles.
 *
 * Sample Input 1:
 *
 * 0 0
 * Sample Output 1:
 *
 * 0
 * Sample Input 2:
 *
 * 7 9
 * Sample Output 2:
 *
 * 16
 * Sample Input 3:
 *
 * 21 30
 * Sample Output 3:
 *
 * 125
 *
 */


public static long sumOfOddNumbersInRange(long start, long end) {

       return LongStream.rangeClosed(start, end).filter(x -> x % 2 != 0).sum();

   }
