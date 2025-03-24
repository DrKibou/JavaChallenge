package javaTwoSum;
import java.util.Scanner;

class Solution {
    public static int[] twoSum(int[] nums, int target) {
        int [] emp = {};
        for(int i = 0; i < nums.length; i++){
            for(int j = 1; j < nums.length; j++){
                if(i != j && nums[i] + nums[j] == target){
                  int [] newn = {i,j};
                return newn; 
            }
            }
        }
        return emp;
    }

    public static void main(String args []){
        Scanner input = new Scanner(System.in);
        int n = input.nextInt();
        int [] nums = new int[n];

        int target = input.nextInt();

        for(int i = 0; i < n; i++){
            nums[i] = input.nextInt();
        }

        int res [] = twoSum(nums, target);
        for(int i = 0; i < 2; i++){
            System.out.print(res[i]);
        }
    }
}