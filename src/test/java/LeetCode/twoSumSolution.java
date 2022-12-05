package LeetCode;

import org.junit.Test;

import java.sql.Array;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;

public class twoSumSolution {

    @Test
    public void runTwoSum() {
        ArrayList<Integer> arr = new ArrayList<>();
        arr.add(-10);
        arr.add(-3);
        arr.add(-1);
        arr.add(5);
        arr.add(2);
        arr.add(1);



        two_sum(arr, 7);
        for (int i : two_sum(arr, 7)) {
            System.out.println(i);

        }
    }

    public int[] twoSum(int[] nums, int target) {

        int[] arrInt = new int[3];

        for (int i = 0; i <= nums.length - 1; i++) {
            for (int j = i + 1; j <= nums.length - 1; j++) {
                if (nums[i] + nums[j] == target) {

                    return new int[]{i, j};

                }
            }
        }
        return arrInt;
    }

    static ArrayList<Integer> two_sum(ArrayList<Integer> numbers, Integer target) {
        // Write your code here.

        HashMap<Integer, Integer> HashCol = new HashMap<Integer, Integer>();

        for (int i = 0; i < numbers.size(); i++) {
            if (HashCol.containsKey(target - numbers.get(i))) {
                ArrayList<Integer> arr = new ArrayList<Integer>();
                arr.add(0, HashCol.get(target - numbers.get(i)));
                arr.add(1, i);
                return arr;
            } else {
                HashCol.put(numbers.get(i), i);
            }
        }
        return new ArrayList(List.of(-1, 1));
    }




    }







