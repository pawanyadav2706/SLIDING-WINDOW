import java.util.Arrays;

public class KRadiusSubarrayAverages {
    public static void main(String [] args){
        int [] nums = {7,4,3,9,1,8,5,2,6};
        int k = 3;
        Solution sol = new Solution();
        System.out.println(Arrays.toString(sol.getAverages(nums, k)));
    }
}
class Solution {
    public int[] getAverages(int[] nums, int k){
        int [] ans = new int[nums.length];
        Arrays.fill(ans, -1);
        int i = 0;
        int j = 0;
        long sum = 0;
        int window = 2 * k + 1;
        while(j < nums.length){
            sum = sum + nums[j];
            if(j - i + 1 < window){
                j++;
            }else {
                int center = i + k;
                ans[center] = (int )(sum / window);
                sum = sum - nums[i];
                i++;
                j++;
            }
        }
        return ans;
    }
}
