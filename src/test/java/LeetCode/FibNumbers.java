package LeetCode;

import org.junit.Test;

public class FibNumbers {

    @Test
    public void TestFibNums(){
        fibonacci(8);

    }


    public   void fibonacci(int count) {
        int prevNumber = 0;
        int nextNumber = 1;

        System.out.println("Fibonacci Series " + count + ":");
        for (int i = 1; i <= count; ++i) {
            int fib = prevNumber + nextNumber;
            prevNumber = nextNumber;
            nextNumber = fib;
            System.out.print(prevNumber + " ");

        }

    }}