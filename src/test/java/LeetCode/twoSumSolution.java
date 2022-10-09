package LeetCode;

import org.junit.Test;

public class twoSumSolution {

@Test
public void runTwoSum(){
    int[] arr={3,2,4};



}

        public int[] twoSum(int[] nums, int target){

            int[] arrInt= new int[3];

            for(int i=0; i<=nums.length-1; i++){
                for(int j=i+1; j<=nums.length-1; j++){
                    if(nums[i]+nums[j]==target){

                        return new int[]{i,j};

                    }
                }
            }
            return arrInt;
        }
    }

