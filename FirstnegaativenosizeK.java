import java.util.*;
public class FirstnegaativenosizeK {
    public static void main(String [] args){
        int [] arr = {-8, 2, 3, -6, 10};
        int k = 2;
        Solution sol = new Solution();
        System.out.println(sol.firstNegInt(arr, k));
    }
}
class Solution {
    static List<Integer> firstNegInt(int arr[], int k){
        List<Integer> ans  = new ArrayList<>();
        Queue<Integer> q = new LinkedList<>();

        int i = 0;
        int j = 0;
        while(j < arr.length){
            if(arr[j] < 0){
                q.add(j);
            }
            if(j - i + 1 < k){
                j++;
            }else{
                if(q.isEmpty()){
                    ans.add(0);
                }else{
                    ans.add(arr[q.peek()]);
                }
                if(!q.isEmpty() && q.peek() == i){
                    q.remove();
                }
                i++;
                j++;
            }
        }
        return ans ;
    }
}
