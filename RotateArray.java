package replit;
import java.util.Arrays;
public class RotateArray {

    public static  int[] rotateArray(int[] nums, int k) {
        for(int i=0; i<k; i++){ // 1
            int last=nums[nums.length-1]; // 6

            for(int q=0; q<nums.length; q++){
                //
                int second=nums[q];  nums[q]=last;   last=second;
                //6,7,1,2,3,4,5
            }
        }
        return nums;
 }

    public static void main(String[] args) {
        int[] nums=new int[]{1,2,3,4,5,6,7};
          System.out.println(Arrays.toString(rotateArray(nums,3)));
    }

}
