import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] arg) {
        //Main Class&Method for Solution
        //Change the Main to filename for individual solution
        int[] nums = new int[]{0,1,2,3,4,5};
        int[] ans = new int[2*nums.length];
        concat(nums,ans,0);
        System.out.println(Arrays.toString(ans));

    }
    static void concat(int[] nums, int[] ans, int i){
        if(i== ans.length) return;
        if(i>=nums.length) ans[i] = nums[i- nums.length];
        else ans[i] = nums[i];
        concat(nums,ans,i+1);
    }
}
