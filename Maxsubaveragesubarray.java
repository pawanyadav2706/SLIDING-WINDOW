import java.util.*;
public class Maxsubaveragesubarray {
    public static void main(String[] args){
        int [] nums = {1,2,4,5,7,8};
        Solution sol = new Solution();
        System.out.println(sol.findMaxAverage(nums, 3));
    }
}
class Solution {
    public double findMaxAverage(int[] nums, int k){
        int i = 0;
        int j = 0;
        int sum =  0;
        int max = Integer.MIN_VALUE;
        while(j < nums.length){
            sum = sum + nums[j];

            if(j - i + 1 < k){
                j++;
            }else if(j - i + 1 == k){
                max = Math.max(max, sum);
                sum = sum - nums[i];
                i++;
                j++;
            }
        }
        return (double) max / k;
    }
}
