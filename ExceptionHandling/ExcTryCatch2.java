import java.io.*;
import java.util.*;

public class Solution {

    public static void main(String[] args) {
        /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
      Scanner scanner = null;
        try {
            scanner = new Scanner(System.in);
            int numerator = scanner.nextInt();
            int denominator = scanner.nextInt();
            int result = numerator / denominator;
            System.out.println(result);
        } catch (ArithmeticException ae) {
            System.out.println("java.lang.ArithmeticException: " + ae.getMessage());
        } catch (Throwable t) {
            System.out.println(t.getClass().getName());
        } 
        scanner.close();
        }
    }
  
